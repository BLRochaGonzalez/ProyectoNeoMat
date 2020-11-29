package org.iesalixar.bluisrochag.neomat.controller;

import java.text.ParseException;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.model.Planet;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.repository.PlanetRepository;
import org.iesalixar.bluisrochag.neomat.repository.UserRepository;
import org.iesalixar.bluisrochag.neomat.service.LocationService;
import org.iesalixar.bluisrochag.neomat.service.SettlementService;
import org.iesalixar.bluisrochag.neomat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("session")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationService locationService;

	@Autowired
	private SettlementService settlementService;

	@Autowired
	private PlanetRepository planetRepository;

	@RequestMapping(value = { "/login" }, method = { RequestMethod.POST })
	public String Register(@RequestParam(value = "inputLoginEmail") String email,
			@RequestParam(value = "inputLoginPassword") String password) throws ParseException {
		String res = null;
		User em = userRepository.findByEmail(email);

		if(em != null) {
			if (em.getEmail().equals(email) && em.getPassword().equals(password)) {
				if (em.getRole().equals("user")) {
					res = "user/general";
				} else if (em.getRole().equals("admin")) {
					res = "admin/game_settings";
				}
			}
		}
		
		return res;
	}

	@RequestMapping(value = { "/register" }, method = { RequestMethod.POST, RequestMethod.PUT })
	public String register(@RequestParam(value = "inputRegisterNick") String nick,
			@RequestParam(value = "inputRegisterEmail") String email,
			@RequestParam(value = "inputRegisterPassword") String password, 
			@RequestParam(value = "inputRegisterRepeatPassword") String reppassword) throws ParseException {

		User us = userRepository.findByEmail(email);
		if(password.equals(reppassword)) {
			if(us == null) {
				User u = new User("Emperador NeoMat", nick, email, password, null, "user");
				Planet p = planetRepository.findByName("Tierra");
				Location l = new Location(1,1,4);
//				Utils.generateLocation(l);
				Settlement s = new Settlement("Asentamiento Principal");
				p.setNumSettlements(p.getNumSettlements() + 1);
				u.getSettlementsId().add(s);
				s.setLocation(l);
				l.setSettlement(s);
				s.setUser(u);
				u.setPlanet(p);
				p.setNumPlayers(p.getNumPlayers() + 1);
				p.getUsersId().add(u);
				
				this.settlementService.createSettlement(s);
				this.locationService.createLocation(l);
				this.userService.createUser(u);
			}
		}
		
		return "index";

	}

}
