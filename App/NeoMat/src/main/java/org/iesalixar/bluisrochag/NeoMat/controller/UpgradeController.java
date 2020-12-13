package org.iesalixar.bluisrochag.neomat.controller;

import java.text.ParseException;

import javax.servlet.http.HttpSession;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementBuilding;
import org.iesalixar.bluisrochag.neomat.model.SettlementResearch;
import org.iesalixar.bluisrochag.neomat.model.SettlementTroup;
import org.iesalixar.bluisrochag.neomat.model.Troup;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.service.SettlementBuildingService;
import org.iesalixar.bluisrochag.neomat.service.SettlementResearchService;
import org.iesalixar.bluisrochag.neomat.service.SettlementService;
import org.iesalixar.bluisrochag.neomat.service.SettlementTroupService;
import org.iesalixar.bluisrochag.neomat.service.TroupService;
import org.iesalixar.bluisrochag.neomat.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UpgradeController {

	@Autowired
	SettlementService settlementService;

	@Autowired
	SettlementResearchService settlementResearchService;

	@Autowired
	SettlementBuildingService settlementBuildingService;

	@Autowired
	SettlementTroupService settlementTroupService;

	@Autowired
	TroupService troupService;

	@Autowired
	UserService userService;

	final static Logger logger = LoggerFactory.getLogger(UpgradeController.class);

	@RequestMapping(value = { "/user/preUpgradeBuilding" }, method = { RequestMethod.POST })
	public String preBuildingUpgrade(@RequestParam(value = "sbId") String id, Model model, HttpSession session)
			throws ParseException, InterruptedException {
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			Settlement s = this.settlementService.findFirstByUser(authUser);
			SettlementBuilding sb = this.settlementBuildingService.findFirstById(Long.parseLong(id));
			logger.warn("upgradeBuilding");

			if (s.getwQuantity() >= sb.getReqWQuantity() && s.getgQuantity() >= sb.getReqGQuantity()
					&& s.getcQuantity() >= sb.getReqCQuantity() && s.getsQuantity() >= sb.getReqSQuantity()
					&& s.getrQuantity() >= sb.getReqRadQuantity() && s.geteQuantity() >= sb.getReqEQuantity()) {

				session.setAttribute("timer", sb.getBuildTime());
				s.setwQuantity(s.getwQuantity() - sb.getReqWQuantity());
				s.setgQuantity(s.getgQuantity() - sb.getReqGQuantity());
				s.setcQuantity(s.getcQuantity() - sb.getReqCQuantity());
				s.setsQuantity(s.getsQuantity() - sb.getReqSQuantity());
				s.setrQuantity(s.getrQuantity() - sb.getReqRadQuantity());
				s.seteQuantity(s.geteQuantity() - sb.getReqEQuantity());

				Double puntos = 0.0;

				puntos = ((Long) Math.round(sb.getReqWQuantity() + sb.getReqGQuantity() + sb.getReqCQuantity()
						+ sb.getReqSQuantity() + sb.getReqRadQuantity())).doubleValue();
				authUser.setBuildingPoints(authUser.getBuildingPoints()+puntos);
				authUser.setPoints(authUser.getPoints()+puntos);

				this.userService.save(authUser);
				this.settlementBuildingService.upgradeBuilding(sb);
				this.settlementService.createSettlement(s);
			}

			return "redirect:/user/buildings";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}

	@RequestMapping(value = { "/user/preUpgradeResearch" }, method = { RequestMethod.POST })
	public String preResearchUpgrade(@RequestParam(value = "srId") String id, Model model, HttpSession session)
			throws ParseException, InterruptedException {
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			Settlement s = this.settlementService.findFirstByUser(authUser);
			SettlementResearch sr = this.settlementResearchService.findFirstById(Long.parseLong(id));
			logger.warn("upgradeResearch");

			if (s.getwQuantity() >= sr.getReqWQuantity() && s.getgQuantity() >= sr.getReqGQuantity()
					&& s.getcQuantity() >= sr.getReqCQuantity() && s.getsQuantity() >= sr.getReqSQuantity()
					&& s.getrQuantity() >= sr.getReqRadQuantity()) {

				session.setAttribute("timerR", sr.getResearchTime());
				s.setwQuantity(s.getwQuantity() - sr.getReqWQuantity());
				s.setgQuantity(s.getgQuantity() - sr.getReqGQuantity());
				s.setcQuantity(s.getcQuantity() - sr.getReqCQuantity());
				s.setsQuantity(s.getsQuantity() - sr.getReqSQuantity());
				s.setrQuantity(s.getrQuantity() - sr.getReqRadQuantity());

				Double puntos = 0.0;

				puntos = ((Long) Math.round(sr.getReqWQuantity() + sr.getReqGQuantity() + sr.getReqCQuantity()
						+ sr.getReqSQuantity() + sr.getReqRadQuantity())).doubleValue();
				authUser.setResearchPoints(authUser.getResearchPoints()+puntos);
				authUser.setPoints(authUser.getPoints()+puntos);

				this.userService.save(authUser);
				this.settlementResearchService.upgradeResearch(sr);
				this.settlementService.createSettlement(s);
			}
			return "redirect:/user/researches";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}

	@RequestMapping(value = { "/user/preCreateTroup" }, method = { RequestMethod.POST })
	public String preTroupCreate(@RequestParam(value = "quantityTroup") String quantityTroup,
			@RequestParam(value = "stId") String id, Model model, HttpSession session)
			throws ParseException, InterruptedException {
		User authUser = (User) session.getAttribute("user");
		
		if(authUser.getRole().equals("user")) {
			Settlement s = this.settlementService.findFirstByUser(authUser);
			Troup t = this.troupService.findFirstById(Long.parseLong(id));
			SettlementTroup st = this.settlementTroupService.findFirstBySettlementIdAndTroupId(s, t);

			logger.warn("upgradeTroup");

			Integer q = Integer.parseInt(quantityTroup);
			if (s.getwQuantity() >= t.getReqWQuantity() * q && s.getgQuantity() >= t.getReqGQuantity() * q
					&& s.getcQuantity() >= t.getReqCQuantity() * q && s.getsQuantity() >= t.getReqSQuantity() * q
					&& s.getrQuantity() >= t.getReqRadQuantity() * q) {

				session.setAttribute("timerT", t.getCreateTime()*q);
				s.setwQuantity(s.getwQuantity() - t.getReqWQuantity() * q);
				s.setgQuantity(s.getgQuantity() - t.getReqGQuantity() * q);
				s.setcQuantity(s.getcQuantity() - t.getReqCQuantity() * q);
				s.setsQuantity(s.getsQuantity() - t.getReqSQuantity() * q);
				s.setrQuantity(s.getrQuantity() - t.getReqRadQuantity() * q);

				Double puntos = 0.0;

				puntos = ((Long) Math.round(t.getReqWQuantity() + t.getReqGQuantity() + t.getReqCQuantity()
						+ t.getReqSQuantity() + t.getReqRadQuantity())).doubleValue()*q;
				authUser.setTroupPoints(authUser.getTroupPoints()+puntos);
				authUser.setPoints(authUser.getPoints()+puntos);

				this.userService.save(authUser);
				this.settlementTroupService.createNewTroup(t, st, q);
				this.settlementService.createSettlement(s);
			}

			return "redirect:/user/troups";
		}else {
			session.invalidate();
			return "redirect:/";
		}
		
	}
}
