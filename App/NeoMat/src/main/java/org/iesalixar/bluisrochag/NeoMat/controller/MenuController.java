package org.iesalixar.bluisrochag.neomat.controller;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementBuilding;
import org.iesalixar.bluisrochag.neomat.model.SettlementResearch;
import org.iesalixar.bluisrochag.neomat.model.SettlementTroup;
import org.iesalixar.bluisrochag.neomat.model.Troup;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.service.LocationService;
import org.iesalixar.bluisrochag.neomat.service.SettlementBuildingService;
import org.iesalixar.bluisrochag.neomat.service.SettlementResearchService;
import org.iesalixar.bluisrochag.neomat.service.SettlementService;
import org.iesalixar.bluisrochag.neomat.service.SettlementTroupService;
import org.iesalixar.bluisrochag.neomat.service.TroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Scope("session")
public class MenuController {
	
	final static Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private SettlementService settlementService;
	
	@Autowired
	private TroupService troupService;
	
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private SettlementBuildingService settlementBuildingService;
	
	@Autowired
	private SettlementResearchService settlementResearchService;
	
	@Autowired
	private SettlementTroupService settlementTroupService;

	@GetMapping(value = { "/user/profile" })
	public String profileView() throws ParseException {
		return "profile";
	}
	
	@GetMapping(value = { "/user/general" })
	public String generalView(Model model, HttpSession session) throws ParseException {
		logger.warn("general");
		User authUser = (User) session.getAttribute("user");
		Settlement s = this.settlementService.findFirstByUser(authUser);
		Location l = this.locationService.searchById(s.getLocation().getId());
		model.addAttribute("w", Math.round(Math.floor(s.getwQuantity())));
		model.addAttribute("g", Math.round(Math.floor(s.getgQuantity())));
		model.addAttribute("c", Math.round(Math.floor(s.getcQuantity())));
		model.addAttribute("s", Math.round(Math.floor(s.getsQuantity())));
		model.addAttribute("r", Math.round(Math.floor(s.getrQuantity())));
		model.addAttribute("e", Math.round(Math.floor(s.geteQuantity())));
		model.addAttribute("points", authUser.getPoints());
		model.addAttribute("continent", l.getContinent());
		model.addAttribute("country", l.getCountry());
		model.addAttribute("region", l.getRegion());
		return "general";
	}
	
	@GetMapping(value = { "/user/buildings" })
	public String buildingView(Model model, HttpSession session) throws ParseException {
		logger.warn("building");
		User authUser = (User) session.getAttribute("user");
		Settlement s = this.settlementService.findFirstByUser(authUser);
		List<SettlementBuilding> sbList = this.settlementBuildingService.findAllBySettlementId(s);
		Location l = this.locationService.searchById(s.getLocation().getId());
		model.addAttribute("w", Math.round(Math.floor(s.getwQuantity())));
		model.addAttribute("g", Math.round(Math.floor(s.getgQuantity())));
		model.addAttribute("c", Math.round(Math.floor(s.getcQuantity())));
		model.addAttribute("s", Math.round(Math.floor(s.getsQuantity())));
		model.addAttribute("r", Math.round(Math.floor(s.getrQuantity())));
		model.addAttribute("e", Math.round(Math.floor(s.geteQuantity())));
		model.addAttribute("continent", l.getContinent());
		model.addAttribute("country", l.getCountry());
		model.addAttribute("region", l.getRegion());
		model.addAttribute("sbList", sbList);
		return "buildings";
	}
	
	@GetMapping(value = { "/user/researches" })
	public String researchesView(Model model, HttpSession session) throws ParseException {
		logger.warn("research");
		User authUser = (User) session.getAttribute("user");
		Settlement s = this.settlementService.findFirstByUser(authUser);
		List<SettlementResearch> srList = this.settlementResearchService.findAllBySettlementId(s);
		Location l = this.locationService.searchById(s.getLocation().getId());
		model.addAttribute("w", Math.round(Math.floor(s.getwQuantity())));
		model.addAttribute("g", Math.round(Math.floor(s.getgQuantity())));
		model.addAttribute("c", Math.round(Math.floor(s.getcQuantity())));
		model.addAttribute("s", Math.round(Math.floor(s.getsQuantity())));
		model.addAttribute("r", Math.round(Math.floor(s.getrQuantity())));
		model.addAttribute("e", Math.round(Math.floor(s.geteQuantity())));
		model.addAttribute("continent", l.getContinent());
		model.addAttribute("country", l.getCountry());
		model.addAttribute("region", l.getRegion());
		model.addAttribute("srList", srList);
		return "researches";
	}
	
	@GetMapping(value = { "/user/troups" })
	public String troupsView(Model model, HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		Settlement s = this.settlementService.findFirstByUser(authUser);
		List<SettlementTroup> stList = this.settlementTroupService.findAllBySettlementId(s);
		List<Troup> tList = this.troupService.findAll();
		Location l = this.locationService.searchById(s.getLocation().getId());
		model.addAttribute("w", Math.round(Math.floor(s.getwQuantity())));
		model.addAttribute("g", Math.round(Math.floor(s.getgQuantity())));
		model.addAttribute("c", Math.round(Math.floor(s.getcQuantity())));
		model.addAttribute("s", Math.round(Math.floor(s.getsQuantity())));
		model.addAttribute("r", Math.round(Math.floor(s.getrQuantity())));
		model.addAttribute("e", Math.round(Math.floor(s.geteQuantity())));
		model.addAttribute("continent", l.getContinent());
		model.addAttribute("country", l.getCountry());
		model.addAttribute("region", l.getRegion());
		model.addAttribute("stList", stList);
		model.addAttribute("tList", tList);
		return "troups";
	}
	
	@GetMapping(value = { "/user/movements" })
	public String movementsView(Model model, HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		Settlement s = this.settlementService.findFirstByUser(authUser);
		Location l = this.locationService.searchById(s.getLocation().getId());
		model.addAttribute("w", Math.round(Math.floor(s.getwQuantity())));
		model.addAttribute("g", Math.round(Math.floor(s.getgQuantity())));
		model.addAttribute("c", Math.round(Math.floor(s.getcQuantity())));
		model.addAttribute("s", Math.round(Math.floor(s.getsQuantity())));
		model.addAttribute("r", Math.round(Math.floor(s.getrQuantity())));
		model.addAttribute("e", Math.round(Math.floor(s.geteQuantity())));
		model.addAttribute("continent", l.getContinent());
		model.addAttribute("country", l.getCountry());
		model.addAttribute("region", l.getRegion());
		return "movements";
	}
	
	@GetMapping(value = { "/user/radar" })
	public String radarView(Model model, HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		Settlement s = this.settlementService.findFirstByUser(authUser);
		Location l = this.locationService.searchById(s.getLocation().getId());
		model.addAttribute("w", Math.round(Math.floor(s.getwQuantity())));
		model.addAttribute("g", Math.round(Math.floor(s.getgQuantity())));
		model.addAttribute("c", Math.round(Math.floor(s.getcQuantity())));
		model.addAttribute("s", Math.round(Math.floor(s.getsQuantity())));
		model.addAttribute("r", Math.round(Math.floor(s.getrQuantity())));
		model.addAttribute("e", Math.round(Math.floor(s.geteQuantity())));
		model.addAttribute("continent", l.getContinent());
		model.addAttribute("country", l.getCountry());
		model.addAttribute("region", l.getRegion());
		return "radar";
	}
	
	@GetMapping(value = { "/user/ranking" })
	public String rankingView(Model model, HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		Settlement s = this.settlementService.findFirstByUser(authUser);
		Location l = this.locationService.searchById(s.getLocation().getId());
		model.addAttribute("w", Math.round(Math.floor(s.getwQuantity())));
		model.addAttribute("g", Math.round(Math.floor(s.getgQuantity())));
		model.addAttribute("c", Math.round(Math.floor(s.getcQuantity())));
		model.addAttribute("s", Math.round(Math.floor(s.getsQuantity())));
		model.addAttribute("r", Math.round(Math.floor(s.getrQuantity())));
		model.addAttribute("e", Math.round(Math.floor(s.geteQuantity())));
		model.addAttribute("continent", l.getContinent());
		model.addAttribute("country", l.getCountry());
		model.addAttribute("region", l.getRegion());
		return "ranking";
	}
}
