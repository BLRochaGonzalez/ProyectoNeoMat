package org.iesalixar.bluisrochag.neomat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WikiController {
	
	@GetMapping(value = { "/wiki" })
	public String wiki(Model model) {
		return "wiki";
	}
}
