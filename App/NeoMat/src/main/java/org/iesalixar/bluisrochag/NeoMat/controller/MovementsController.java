//package org.iesalixar.bluisrochag.neomat.controller;
//
//import java.text.ParseException;
//
//import javax.servlet.http.HttpSession;
//
//import org.iesalixar.bluisrochag.neomat.model.Location;
//import org.iesalixar.bluisrochag.neomat.model.Settlement;
//import org.iesalixar.bluisrochag.neomat.model.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class MovementsController {
//
//	Boolean error = false;
//
//	@GetMapping(value = { "/user/movements/chosen" })
//	public String movementsView(@RequestParam(value = "sbId") String id, Model model, HttpSession session) throws ParseException {
//		User authUser = (User) session.getAttribute("user");
//		Settlement s = this.settlementService.findFirstByUser(authUser);
//		Location l = this.locationService.searchById(s.getLocation().getId());
//		model.addAttribute("w", Math.round(Math.floor(s.getwQuantity())));
//		model.addAttribute("g", Math.round(Math.floor(s.getgQuantity())));
//		model.addAttribute("c", Math.round(Math.floor(s.getcQuantity())));
//		model.addAttribute("s", Math.round(Math.floor(s.getsQuantity())));
//		model.addAttribute("r", Math.round(Math.floor(s.getrQuantity())));
//		model.addAttribute("e", Math.round(Math.floor(s.geteQuantity())));
//		model.addAttribute("continent", l.getContinent());
//		model.addAttribute("country", l.getCountry());
//		model.addAttribute("region", l.getRegion());
//		model.addAttribute("error", error);
//		error=false;
//		return "movements";
//	}
//}
