package org.iesalixar.bluisrochag.neomat.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Scope("session")
public class MainController {
	
	final static Logger logger = LoggerFactory.getLogger(MainController.class);

	@GetMapping({"/"})
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping({"/logOut"})
	public String logOut(Model model, HttpSession session) {
		session.removeAttribute("user");
		session.setMaxInactiveInterval(0);
		session.invalidate();
		return "redirect:/";
	}
}
