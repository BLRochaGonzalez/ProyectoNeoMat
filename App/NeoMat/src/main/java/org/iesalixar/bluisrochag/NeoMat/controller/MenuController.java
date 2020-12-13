package org.iesalixar.bluisrochag.neomat.controller;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementBuilding;
import org.iesalixar.bluisrochag.neomat.model.SettlementResearch;
import org.iesalixar.bluisrochag.neomat.model.SettlementTroup;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.service.LocationService;
import org.iesalixar.bluisrochag.neomat.service.SettlementBuildingService;
import org.iesalixar.bluisrochag.neomat.service.SettlementResearchService;
import org.iesalixar.bluisrochag.neomat.service.SettlementService;
import org.iesalixar.bluisrochag.neomat.service.SettlementTroupService;
import org.iesalixar.bluisrochag.neomat.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("session")
public class MenuController {

	final static Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	private SettlementService settlementService;

	@Autowired
	private LocationService locationService;

	@Autowired
	private SettlementBuildingService settlementBuildingService;

	@Autowired
	private SettlementResearchService settlementResearchService;

	@Autowired
	private SettlementTroupService settlementTroupService;

	@Autowired
	private UserService userService;

	@GetMapping(value = { "/user/profile" })
	public String profileView(Model model, HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			model.addAttribute("user", authUser);
			return "profile";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}

	@GetMapping(value = { "/user/general" })
	public String generalView(Model model, HttpSession session) throws ParseException {
		logger.warn("general");
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			Settlement s = this.settlementService.findFirstByUser(authUser);
			Location l = this.locationService.searchById(s.getLocation().getId());
			if(session.getAttribute("timerAttack")==null) {
				session.setAttribute("timerAttack", 0);
			}
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
			if(session.getAttribute("validSettlement")!=null) {
				model.addAttribute("validSettlement", true);
			}
			model.addAttribute("timerAttack", session.getAttribute("timerAttack"));
			session.removeAttribute("validSettlement");
			session.removeAttribute("timerAttack");
			return "general";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}

	@GetMapping(value = { "/user/buildings" })
	public String buildingView(Model model, HttpSession session) throws ParseException {
		logger.warn("building");
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			Settlement s = this.settlementService.findFirstByUser(authUser);
			List<SettlementBuilding> sbList = this.settlementBuildingService.findAllBySettlementId(s);
			if(session.getAttribute("timer")==null) {
				session.setAttribute("timer", 0);
			}
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
			model.addAttribute("timer", session.getAttribute("timer"));
			session.removeAttribute("timer");
			return "buildings";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}

	@GetMapping(value = { "/user/researches" })
	public String researchesView(Model model, HttpSession session) throws ParseException {
		logger.warn("research");
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			Settlement s = this.settlementService.findFirstByUser(authUser);
			List<SettlementResearch> srList = this.settlementResearchService.findAllBySettlementId(s);
			if(session.getAttribute("timerR")==null) {
				session.setAttribute("timerR", 0);
			}
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
			model.addAttribute("timerR", session.getAttribute("timerR"));
			session.removeAttribute("timerR");
			return "researches";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}

	@GetMapping(value = { "/user/troups" })
	public String troupsView(Model model, HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			Settlement s = this.settlementService.findFirstByUser(authUser);
			List<SettlementTroup> stList = this.settlementTroupService.findAllBySettlementId(s);
			if(session.getAttribute("timerT")==null) {
				session.setAttribute("timerT", 0);
			}
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
			model.addAttribute("timerT", session.getAttribute("timerT"));
			session.removeAttribute("timerT");
			return "troups";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}

	@GetMapping(value = { "/user/movements" })
	public String movementsView(Model model, HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
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
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}

	@GetMapping(value = { "/user/movements/chosen" })
	public String movementsChosenView(Model model, HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			Settlement s = this.settlementService.findFirstByUser(authUser);
			List<SettlementTroup> stList = this.settlementTroupService.findAllBySettlementId(s);
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
			if(session.getAttribute("invalidSettlement")!=null) {
				model.addAttribute("invalidSettlement", true);
			}session.removeAttribute("invalidSettlement");
			return "movement_chosen";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}

	@GetMapping(value = { "/user/radar" })
	public String radarView(Model model, HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
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
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}

	@RequestMapping(value = { "/user/radar/chosen" })
	public String radarChosenView(@RequestParam(value = "cont") String cont, @RequestParam(value = "pais") String pais,
			Model model, HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			Settlement s = this.settlementService.findFirstByUser(authUser);
			Integer c = Integer.parseInt(cont);
			Integer p = Integer.parseInt(pais);
			List<Location> lList = this.locationService.findAllByContinentAndCountry(c, p);
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
			model.addAttribute("lList", lList);
			return "radar_chosen";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}

	@RequestMapping(value = { "/user/settlement/attack" })
	public String movementsSettlementAttackView(@RequestParam(value = "inputCont") String cont,
			@RequestParam(value = "inputPais") String pais, @RequestParam(value = "inputRegi") String regi, Model model, HttpSession session)
			throws ParseException {
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			Settlement s = this.settlementService.findFirstByUser(authUser);
			List<SettlementTroup> stList = this.settlementTroupService.findAllBySettlementId(s);
			Location l = this.locationService.searchById(s.getLocation().getId());
			String c = cont;
			String p = pais;
			String r = regi;
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
			model.addAttribute("cont", c);
			model.addAttribute("pais", p);
			model.addAttribute("regi", r);
			return "movement_chosen";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}
	
	@RequestMapping(value = { "/user/sendAttack" })
	public String movementsAttackView(@RequestParam(value = "locationContinent") Integer cont,
			@RequestParam(value = "locationCountry") Integer pais, @RequestParam(value = "locationRegion") Integer regi, Model model, HttpSession session)
			throws ParseException {
		String redirect="";
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			Settlement s = this.settlementService.findFirstByUser(authUser);
			Location sAttacked = this.locationService.findFirstByContinentAndCountryAndRegion(cont, pais, regi);
			Location l = this.locationService.searchById(s.getLocation().getId());
			if(sAttacked!=null) {
				session.setAttribute("validSettlement", true);
				Integer tiempoVuelo = (Math.abs(cont-l.getContinent())*300)+(Math.abs(pais-l.getCountry())*120)+(Math.abs(regi-l.getRegion())*30);
				session.setAttribute("timerAttack", tiempoVuelo);
				redirect = "redirect:/user/general";
			}else {
				session.setAttribute("invalidSettlement", true);
				redirect = "redirect:/user/movements/chosen";
			}
			return redirect;
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}
	
	
	
	@GetMapping(value = { "/user/ranking" })
	public String rankingView(Model model, HttpSession session) throws ParseException {
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
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
			model.addAttribute("userByPoints", this.userService.findAllOrderByPoints());
			model.addAttribute("userByBPoints", this.userService.findAllOrderByBuildingPoints());
			model.addAttribute("userByRPoints", this.userService.findAllOrderByResearchPoints());
			model.addAttribute("userByTPoints", this.userService.findAllOrderByTroupPoints());
			return "ranking";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}
}
