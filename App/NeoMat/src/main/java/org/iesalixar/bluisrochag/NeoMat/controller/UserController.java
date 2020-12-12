package org.iesalixar.bluisrochag.neomat.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.model.Planet;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementBuilding;
import org.iesalixar.bluisrochag.neomat.model.SettlementResearch;
import org.iesalixar.bluisrochag.neomat.model.SettlementTroup;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.repository.LocationRepository;
import org.iesalixar.bluisrochag.neomat.repository.PlanetRepository;
import org.iesalixar.bluisrochag.neomat.repository.UserRepository;
import org.iesalixar.bluisrochag.neomat.service.BuildingService;
import org.iesalixar.bluisrochag.neomat.service.LocationService;
import org.iesalixar.bluisrochag.neomat.service.ResearchService;
import org.iesalixar.bluisrochag.neomat.service.SettlementBuildingService;
import org.iesalixar.bluisrochag.neomat.service.SettlementResearchService;
import org.iesalixar.bluisrochag.neomat.service.SettlementService;
import org.iesalixar.bluisrochag.neomat.service.SettlementTroupService;
import org.iesalixar.bluisrochag.neomat.service.TroupService;
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
	private LocationRepository locationRepository;

	@Autowired
	private SettlementService settlementService;

	@Autowired
	private PlanetRepository planetRepository;

	@Autowired
	private SettlementBuildingService settlementBuildingService;

	@Autowired
	private BuildingService buildingService;

	@Autowired
	private SettlementResearchService settlementResearchService;

	@Autowired
	private ResearchService researchService;

	@Autowired
	private SettlementTroupService settlementTroupService;

	@Autowired
	private TroupService troupService;

	@RequestMapping(value = { "/login" }, method = { RequestMethod.POST })
	public String Register(@RequestParam(value = "inputLoginEmail") String email,
			@RequestParam(value = "inputLoginPassword") String password, HttpSession session) throws ParseException {
		String res = null;
		User em = userService.search(email);

		if (em != null) {
			if (em.getEmail().equals(email) && em.getPassword().equals(password)) {
				session.setAttribute("user", em);
				if (em.getRole().equals("user")) {
					res = "redirect:/user/general";
				} else if (em.getRole().equals("admin")) {
					res = "redirect:/admin/game";
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
		if (password.equals(reppassword)) {
			if (us == null) {
				User u = new User("Emperador NeoMat", nick, email, password, null, "user");
				Planet p = planetRepository.findFirstByName("Tierra");

				Location l = new Location();
				for (Integer x = 1; x <= 5; x++) {
					for (Integer y = 1; y <= 10; y++) {
						for (Integer z = 1; z <= 25; z++) {
							Location loc = locationRepository.findLocationFirstByContinentAndCountryAndRegion(x, y, z);
							if (loc == null) {
								l.setContinent(x);
								l.setCountry(y);
								l.setRegion(z);

								z = 26;
								y = 11;
								x = 6;
							}
						}
					}
				}

				Settlement s = new Settlement("Asentamiento de " + nick);
				p.setNumSettlements(p.getNumSettlements() + 1);
				u.getSettlementsId().add(s);
				s.setLocation(l);
				l.setSettlement(s);
				s.setUser(u);
				u.setPlanet(p);
				p.setNumPlayers(p.getNumPlayers() + 1);
				p.getUsersId().add(u);

				List<SettlementBuilding> sbList = createSettlementBuildings(s);
				List<SettlementResearch> srList = createSettlementResearches(s);
				List<SettlementTroup> stList = createSettlementTroups(s);

				for (Integer x = 0; x < sbList.size(); x++) {
					this.settlementBuildingService.createSettlementBuilding(sbList.get(x));
				}

				for (Integer x = 0; x < srList.size(); x++) {
					this.settlementResearchService.createSettlementResearch(srList.get(x));
				}

				for (Integer x = 0; x < stList.size(); x++) {
					this.settlementTroupService.createSettlementTroup(stList.get(x));
				}

				this.settlementService.createSettlement(s);
				this.locationService.createLocation(l);
				this.userService.createUser(u);
			}
		}

		return "index";

	}

	private List<SettlementBuilding> createSettlementBuildings(Settlement s) {
		List<SettlementBuilding> sbList = new ArrayList<SettlementBuilding>();

		SettlementBuilding sbW = new SettlementBuilding(15.0, 10.0, 25.0, 10.0, 40.0, 0.0, 5, 10.0);
		sbW.setSettlementId(s);
		sbW.setBuildingIds(this.buildingService.findFirstById(1L));
		sbList.add(sbW);

		SettlementBuilding sbG = new SettlementBuilding(15.0, 15.0, 20.0, 15.0, 35.0, 0.0, 5, 10.0);
		sbG.setSettlementId(s);
		sbG.setBuildingIds(this.buildingService.findFirstById(2L));
		sbList.add(sbG);

		SettlementBuilding sbC = new SettlementBuilding(15.0, 10.0, 15.0, 20.0, 45.0, 0.0, 5, 10.0);
		sbC.setSettlementId(s);
		sbC.setBuildingIds(this.buildingService.findFirstById(3L));
		sbList.add(sbC);

		SettlementBuilding sbS = new SettlementBuilding(15.0, 20.0, 10.0, 15.0, 50.0, 0.0, 5, 10.0);
		sbS.setSettlementId(s);
		sbS.setBuildingIds(this.buildingService.findFirstById(4L));
		sbList.add(sbS);

		SettlementBuilding sbR = new SettlementBuilding(15.0, 15.0, 25.0, 20.0, 40.0, 0.0, 5, 10.0);
		sbR.setSettlementId(s);
		sbR.setBuildingIds(this.buildingService.findFirstById(5L));
		sbList.add(sbR);

		SettlementBuilding sbE = new SettlementBuilding(0.0, 10.0, 30.0, 10.0, 50.0, 0.0, 5, 75.0);
		sbE.setSettlementId(s);
		sbE.setBuildingIds(this.buildingService.findFirstById(6L));
		sbList.add(sbE);

		SettlementBuilding sbH = new SettlementBuilding(0.0, 140.0, 170.0, 120.0, 400.0, 100.0, 20, 0.0);
		sbH.setSettlementId(s);
		sbH.setBuildingIds(this.buildingService.findFirstById(7L));
		sbList.add(sbH);

		SettlementBuilding sbL = new SettlementBuilding(0.0, 100.0, 130.0, 140.0, 320.0, 100.0, 20, 0.0);
		sbL.setSettlementId(s);
		sbL.setBuildingIds(this.buildingService.findFirstById(8L));
		sbList.add(sbL);

		return sbList;
	}

	private List<SettlementResearch> createSettlementResearches(Settlement s) {
		List<SettlementResearch> srList = new ArrayList<SettlementResearch>();

		SettlementResearch srEn = new SettlementResearch(0, 20.0, 200.0, 150.0, 20.0, 0.0, 15);
		srEn.setSettlementIds(s);
		srEn.setResearchIds(this.researchService.findFirstById(1L));
		srList.add(srEn);

		SettlementResearch srIA = new SettlementResearch(0, 25.0, 470.0, 280.0, 15.0, 0.0, 50);
		srIA.setSettlementIds(s);
		srIA.setResearchIds(this.researchService.findFirstById(2L));
		srList.add(srIA);

		SettlementResearch srEs = new SettlementResearch(0, 50.0, 500.0, 250.0, 75.0, 0.0, 35);
		srEs.setSettlementIds(s);
		srEs.setResearchIds(this.researchService.findFirstById(3L));
		srList.add(srEs);

		SettlementResearch srM = new SettlementResearch(0, 250.0, 25.0, 15.0, 300.0, 0.0, 75);
		srM.setSettlementIds(s);
		srM.setResearchIds(this.researchService.findFirstById(4L));
		srList.add(srM);

		SettlementResearch srB = new SettlementResearch(0, 30.0, 60.0, 100.0, 700.0, 0.0, 60);
		srB.setSettlementIds(s);
		srB.setResearchIds(this.researchService.findFirstById(5L));
		srList.add(srB);

		SettlementResearch srAr = new SettlementResearch(0, 450.0, 30.0, 25.0, 670.0, 0.0, 80);
		srAr.setSettlementIds(s);
		srAr.setResearchIds(this.researchService.findFirstById(6L));
		srList.add(srAr);

		return srList;
	}

	private List<SettlementTroup> createSettlementTroups(Settlement s) {
		List<SettlementTroup> stList = new ArrayList<SettlementTroup>();

		SettlementTroup st1 = new SettlementTroup();
		st1.setSettlementIds(s);
		st1.setTroupIds(this.troupService.findFirstById(1L));
		stList.add(st1);

		SettlementTroup st2 = new SettlementTroup();
		st2.setSettlementIds(s);
		st2.setTroupIds(this.troupService.findFirstById(2L));
		stList.add(st2);

		SettlementTroup st3 = new SettlementTroup();
		st3.setSettlementIds(s);
		st3.setTroupIds(this.troupService.findFirstById(3L));
		stList.add(st3);

		SettlementTroup st4 = new SettlementTroup();
		st4.setSettlementIds(s);
		st4.setTroupIds(this.troupService.findFirstById(4L));
		stList.add(st4);

		SettlementTroup st5 = new SettlementTroup();
		st5.setSettlementIds(s);
		st5.setTroupIds(this.troupService.findFirstById(5L));
		stList.add(st5);

		SettlementTroup st6 = new SettlementTroup();
		st6.setSettlementIds(s);
		st6.setTroupIds(this.troupService.findFirstById(6L));
		stList.add(st6);

		SettlementTroup st7 = new SettlementTroup();
		st7.setSettlementIds(s);
		st7.setTroupIds(this.troupService.findFirstById(7L));
		stList.add(st7);

		SettlementTroup st8 = new SettlementTroup();
		st8.setSettlementIds(s);
		st8.setTroupIds(this.troupService.findFirstById(8L));
		stList.add(st8);

		SettlementTroup st9 = new SettlementTroup();
		st9.setSettlementIds(s);
		st9.setTroupIds(this.troupService.findFirstById(9L));
		stList.add(st9);

		SettlementTroup st10 = new SettlementTroup();
		st10.setSettlementIds(s);
		st10.setTroupIds(this.troupService.findFirstById(10L));
		stList.add(st10);

		SettlementTroup st11 = new SettlementTroup();
		st11.setSettlementIds(s);
		st11.setTroupIds(this.troupService.findFirstById(11L));
		stList.add(st11);

		SettlementTroup st12 = new SettlementTroup();
		st12.setSettlementIds(s);
		st12.setTroupIds(this.troupService.findFirstById(12L));
		stList.add(st12);

		SettlementTroup st13 = new SettlementTroup();
		st13.setSettlementIds(s);
		st13.setTroupIds(this.troupService.findFirstById(13L));
		stList.add(st13);

		SettlementTroup st14 = new SettlementTroup();
		st14.setSettlementIds(s);
		st14.setTroupIds(this.troupService.findFirstById(14L));
		stList.add(st14);

		SettlementTroup st15 = new SettlementTroup();
		st15.setSettlementIds(s);
		st15.setTroupIds(this.troupService.findFirstById(15L));
		stList.add(st15);

		SettlementTroup st16 = new SettlementTroup();
		st16.setSettlementIds(s);
		st16.setTroupIds(this.troupService.findFirstById(16L));
		stList.add(st16);

		SettlementTroup st17 = new SettlementTroup();
		st17.setSettlementIds(s);
		st17.setTroupIds(this.troupService.findFirstById(17L));
		stList.add(st17);

		SettlementTroup st18 = new SettlementTroup();
		st18.setSettlementIds(s);
		st18.setTroupIds(this.troupService.findFirstById(18L));
		stList.add(st18);

		SettlementTroup st19 = new SettlementTroup();
		st19.setSettlementIds(s);
		st19.setTroupIds(this.troupService.findFirstById(19L));
		stList.add(st19);

		SettlementTroup st20 = new SettlementTroup();
		st20.setSettlementIds(s);
		st20.setTroupIds(this.troupService.findFirstById(20L));
		stList.add(st20);

		SettlementTroup st21 = new SettlementTroup();
		st21.setSettlementIds(s);
		st21.setTroupIds(this.troupService.findFirstById(21L));
		stList.add(st21);

		return stList;
	}

	@RequestMapping(value = { "/user/updateProfile" }, method = { RequestMethod.POST })
	public String UpdateProfile(@RequestParam(value = "inputEmail") String inputEmail,
			@RequestParam(value = "inputPhone") String inputPhone,
			@RequestParam(value = "inputPassword") String inputPassword,
			@RequestParam(value = "inputName") String inputName, @RequestParam(value = "inputNick") String inputNick,
			HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		authUser.setEmail(inputEmail);
		authUser.setName(inputName);
		authUser.setNick(inputNick);
		authUser.setPassword(inputPassword);
		authUser.setPhone(inputPhone);
		this.userService.save(authUser);
		return "redirect:/user/general";
	}

}
