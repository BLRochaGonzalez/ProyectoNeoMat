package org.iesalixar.bluisrochag.neomat.controller;

import java.text.ParseException;

import javax.servlet.http.HttpSession;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementResearch;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.service.SettlementResearchService;
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
public class ResearchController {

	@Autowired
	SettlementResearchService settlementResearchService;

	@Autowired
	SettlementService settlementService;
	
	final static Logger logger = LoggerFactory.getLogger(ResearchController.class);
	
	@RequestMapping(value = { "/user/preUpgradeResearch" }, method = { RequestMethod.POST })
	public String preResearchUpgrade(@RequestParam(value = "srId") String id, Model model, HttpSession session)
			throws ParseException, InterruptedException {
		User authUser = (User) session.getAttribute("user");
		Settlement s = this.settlementService.findFirstByUser(authUser);
		SettlementResearch sr = this.settlementResearchService.findFirstById(Long.parseLong(id));
		logger.warn("upgradeResearch");
		this.settlementResearchService.upgradeResearch(s,sr);
		return "redirect:/user/researches";
	}
}