package org.iesalixar.bluisrochag.neomat.controller;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Building;
import org.iesalixar.bluisrochag.neomat.model.Research;
import org.iesalixar.bluisrochag.neomat.model.Troup;
import org.iesalixar.bluisrochag.neomat.service.BuildingService;
import org.iesalixar.bluisrochag.neomat.service.ResearchService;
import org.iesalixar.bluisrochag.neomat.service.TroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Scope("session")
public class GamesettingsController {
	
	@Autowired
	private ResearchService researchService;
	
	@Autowired
	private BuildingService buildingService;
	
	@Autowired
	private TroupService troupService;
	
	@GetMapping(value = { "/admin/game" })
	public String wiki(Model model) {
		return findPaginated(1, "all", model);
		
//		
//		return "game_settings";
	}
	
	@GetMapping("/page/{tipo}/{numPage}")
	public String findPaginated(@PathVariable (value = "numPage") int numPage, @PathVariable (value = "tipo") String tipo, Model model) {
		
		switch (tipo) {
		case "all":
			int pageSize = 5;
			Page<Troup> page = troupService.findPaginated(numPage, pageSize);
			Page<Research> page2 = researchService.findPaginated(numPage, pageSize);
			Page<Building> page3 = buildingService.findPaginated(numPage, pageSize);
			List<Troup> listTroup = page.getContent();
			List<Research> listResearch = page2.getContent();
			List<Building> listBuilding = page3.getContent();
			
			model.addAttribute("planetCont", 5);
			model.addAttribute("planetCoun", 10);
			model.addAttribute("planetRegi", 25);
			
			model.addAttribute("troupCurrentPage", numPage);
			model.addAttribute("troupTotalPages", page.getTotalPages());
			model.addAttribute("troupTotalItems", page.getTotalElements());
			model.addAttribute("listTroup", listTroup);
			
			
			model.addAttribute("researchCurrentPage", numPage);
			model.addAttribute("researchTotalPages", page2.getTotalPages());
			model.addAttribute("researchTotalItems", page2.getTotalElements());
			model.addAttribute("listResearch", listResearch);
			
			model.addAttribute("buildingCurrentPage", numPage);
			model.addAttribute("buildingTotalPages", page3.getTotalPages());
			model.addAttribute("buildingTotalItems", page3.getTotalElements());
			model.addAttribute("listBuilding", listBuilding);
			
			break;
			
		case "tropas":
			pageSize = 5;
			page = troupService.findPaginated(numPage, pageSize);
			page2 = researchService.findPaginated(1, pageSize);
			page3 = buildingService.findPaginated(1, pageSize);
			listTroup = page.getContent();
			listResearch = page2.getContent();
			listBuilding = page3.getContent();
			
			model.addAttribute("planetCont", 5);
			model.addAttribute("planetCoun", 10);
			model.addAttribute("planetRegi", 25);
			
			model.addAttribute("troupCurrentPage", numPage);
			model.addAttribute("troupTotalPages", page.getTotalPages());
			model.addAttribute("troupTotalItems", page.getTotalElements());
			model.addAttribute("listTroup", listTroup);
			
			
			model.addAttribute("researchCurrentPage", 1);
			model.addAttribute("researchTotalPages", page2.getTotalPages());
			model.addAttribute("researchTotalItems", page2.getTotalElements());
			model.addAttribute("listResearch", listResearch);
			
			model.addAttribute("buildingCurrentPage", 1);
			model.addAttribute("buildingTotalPages", page3.getTotalPages());
			model.addAttribute("buildingTotalItems", page3.getTotalElements());
			model.addAttribute("listBuilding", listBuilding);
			
			break;
			
		case "research":
			pageSize = 5;
			page = troupService.findPaginated(1, pageSize);
			page2 = researchService.findPaginated(numPage, pageSize);
			page3 = buildingService.findPaginated(1, pageSize);
			listTroup = page.getContent();
			listResearch = page2.getContent();
			listBuilding = page3.getContent();
			
			model.addAttribute("planetCont", 5);
			model.addAttribute("planetCoun", 10);
			model.addAttribute("planetRegi", 25);
			
			model.addAttribute("troupCurrentPage", 1);
			model.addAttribute("troupTotalPages", page.getTotalPages());
			model.addAttribute("troupTotalItems", page.getTotalElements());
			model.addAttribute("listTroup", listTroup);
			
			
			model.addAttribute("researchCurrentPage", numPage);
			model.addAttribute("researchTotalPages", page2.getTotalPages());
			model.addAttribute("researchTotalItems", page2.getTotalElements());
			model.addAttribute("listResearch", listResearch);
			
			model.addAttribute("buildingCurrentPage", 1);
			model.addAttribute("buildingTotalPages", page3.getTotalPages());
			model.addAttribute("buildingTotalItems", page3.getTotalElements());
			model.addAttribute("listBuilding", listBuilding);
			
			break;
			
		case "building":
			pageSize = 5;
			page = troupService.findPaginated(1, pageSize);
			page2 = researchService.findPaginated(1, pageSize);
			page3 = buildingService.findPaginated(numPage, pageSize);
			listTroup = page.getContent();
			listResearch = page2.getContent();
			listBuilding = page3.getContent();
			
			model.addAttribute("planetCont", 5);
			model.addAttribute("planetCoun", 10);
			model.addAttribute("planetRegi", 25);
			
			model.addAttribute("troupCurrentPage", 1);
			model.addAttribute("troupTotalPages", page.getTotalPages());
			model.addAttribute("troupTotalItems", page.getTotalElements());
			model.addAttribute("listTroup", listTroup);
			
			
			model.addAttribute("researchCurrentPage", 1);
			model.addAttribute("researchTotalPages", page2.getTotalPages());
			model.addAttribute("researchTotalItems", page2.getTotalElements());
			model.addAttribute("listResearch", listResearch);
			
			model.addAttribute("buildingCurrentPage", numPage);
			model.addAttribute("buildingTotalPages", page3.getTotalPages());
			model.addAttribute("buildingTotalItems", page3.getTotalElements());
			model.addAttribute("listBuilding", listBuilding);
			
			break;
			
		}
		
		return "game_settings";
	}
}
