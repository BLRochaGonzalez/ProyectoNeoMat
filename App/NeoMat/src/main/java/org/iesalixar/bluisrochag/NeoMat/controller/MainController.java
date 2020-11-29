package org.iesalixar.bluisrochag.neomat.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Scope("session")
public class MainController {
	
	

	@GetMapping(value={"/welcome_page"})
	public String index(Model model) {
		
		return "index";
	}
}
