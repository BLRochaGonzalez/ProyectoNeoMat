package org.iesalixar.bluisrochag.neomat.controller;

import java.text.ParseException;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.model.Planet;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.repository.LocationRepository;
import org.iesalixar.bluisrochag.neomat.service.LocationService;
import org.iesalixar.bluisrochag.neomat.service.PlanetService;
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
	private LocationService locationService;
	
	@Autowired
	private SettlementService settlementService;

	@Autowired
	private LocationRepository locationRepository;

	@RequestMapping(value = { "/register" }, method = { RequestMethod.POST, RequestMethod.PUT })
	public String register(@RequestParam(value = "inputRegisterNick") String nick,
			@RequestParam(value = "inputRegisterEmail") String email,
			@RequestParam(value = "inputRegisterPassword") String password) throws ParseException {

		Planet p = PlanetService.search("Tierra");
		User u = new User("Emperador NeoMat", nick, email, password, null, "user");
		Location l = null;
		Settlement s;

		for (int x = 1; x >= 5; x++) {
			for (int y = 1; y >= 10; y++) {
				for (int z = 1; z >= 25; z++) {
					if (!locationRepository.findByContinentAndCountryAndRegion(x, y, z)) {
						l = new Location(x, y, z);
					}
				}
			}
		}
		s = new Settlement("Asentamiento Principal");
		
		this.settlementService.createSettlement(s, u, p, l);
		this.locationService.createLocation(l, s);
		this.userService.createUser(u, p);

		return "index";

	}

}
