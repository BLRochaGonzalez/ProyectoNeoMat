package org.iesalixar.bluisrochag.neomat.controller;

import java.text.ParseException;

import javax.servlet.http.HttpSession;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementBuilding;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.service.SettlementBuildingService;
import org.iesalixar.bluisrochag.neomat.service.SettlementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BuildingController {

	@Autowired
	SettlementBuildingService settlementBuildingService;

	@Autowired
	SettlementService settlementService;

	final static Logger logger = LoggerFactory.getLogger(BuildingController.class);

	@RequestMapping(value = { "/user/preUpgradeBuilding" }, method = { RequestMethod.POST })
	public String preBuildingUpgrade(@RequestParam(value = "sbId") String id, Model model, HttpSession session)
			throws ParseException, InterruptedException {
		User authUser = (User) session.getAttribute("user");
		Settlement s = this.settlementService.findFirstByUser(authUser);
		SettlementBuilding sb = this.settlementBuildingService.findFirstById(Long.parseLong(id));
		logger.warn("upgradeBuilding");
		this.settlementBuildingService.upgradeBuilding(s,sb);
		return "redirect:/user/buildings";
	}
}