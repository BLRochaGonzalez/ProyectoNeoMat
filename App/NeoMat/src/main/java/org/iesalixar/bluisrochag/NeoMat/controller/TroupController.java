package org.iesalixar.bluisrochag.neomat.controller;

import java.text.ParseException;

import javax.servlet.http.HttpSession;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementTroup;
import org.iesalixar.bluisrochag.neomat.model.Troup;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.service.SettlementService;
import org.iesalixar.bluisrochag.neomat.service.SettlementTroupService;
import org.iesalixar.bluisrochag.neomat.service.TroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TroupController {
	
	@Autowired
	SettlementService settlementService;
	
	@Autowired
	SettlementTroupService settlementTroupService;
	
	@Autowired
	TroupService troupService;

	final static Logger logger = LoggerFactory.getLogger(TroupController.class);

	@RequestMapping(value = { "/user/preCreateTroup" }, method = { RequestMethod.POST })
	public String preTroupCreate(@RequestParam(value = "quantity") String quantity, @RequestParam(value = "srId") String id, Model model, HttpSession session)
			throws ParseException, InterruptedException {
		User authUser = (User) session.getAttribute("user");
		Settlement s = this.settlementService.findFirstByUser(authUser);
		SettlementTroup st = this.settlementTroupService.findFirstById(Long.parseLong(id));
		Troup t = this.troupService.findFirstById(Long.parseLong(id));
		logger.warn("upgradeResearch");
		this.settlementTroupService.createNewTroup(s, t, st, quantity);
		return "redirect:/user/researches";
	}
}
