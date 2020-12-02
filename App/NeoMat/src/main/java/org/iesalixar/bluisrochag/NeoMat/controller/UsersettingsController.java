package org.iesalixar.bluisrochag.neomat.controller;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.model.Planet;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.service.LocationService;
import org.iesalixar.bluisrochag.neomat.service.PlanetService;
import org.iesalixar.bluisrochag.neomat.service.SettlementService;
import org.iesalixar.bluisrochag.neomat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersettingsController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SettlementService settlementService;
	
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private PlanetService planetService;
	
	
	@GetMapping(value = { "/admin/users" })
	public String allUsersAdmin(Model model) {

		return findPaginated(1, model);
	}
	
	@RequestMapping(value = { "/admin/deleteUser" }, method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
	public String deletePatient(@RequestParam(value = "id") Long id, Model model) {
		User u = this.userService.searchById(id);
		Long pid = 1L;
		Planet p = this.planetService.searchById(pid);
		List<Settlement> settlements = this.settlementService.readAllSettlements(u);
		for (Settlement settlement : settlements) {
			Settlement s = this.settlementService.searchById(settlement.getId());
			Location l =  this.locationService.searchById(s.getLocation().getId());
			this.settlementService.deleteSettlement(s.getId());
			this.locationService.deleteLocation(l.getId());
		}
		this.userService.deleteUser(u.getId());
		p.setNumPlayers(p.getNumPlayers()-1);
		p.setNumSettlements(p.getNumSettlements()-1);
		this.planetService.updatePlanet(p);
		return "redirect:/admin/users";
	}
	
	@GetMapping("/page/{numPage}")
	public String findPaginated(@PathVariable (value = "numPage") int numPage, Model model) {
		int pageSize = 7;
		Page<User> page = userService.findPaginated(numPage, pageSize);
		List<User> listUser = page.getContent();
		
		model.addAttribute("currentPage", numPage);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		model.addAttribute("listUser", listUser);
		
		return "user_settings";
	}
}
