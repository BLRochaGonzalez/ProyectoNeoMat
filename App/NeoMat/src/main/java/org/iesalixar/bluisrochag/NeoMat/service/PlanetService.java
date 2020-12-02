package org.iesalixar.bluisrochag.neomat.service;

import org.iesalixar.bluisrochag.neomat.model.Planet;
import org.iesalixar.bluisrochag.neomat.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanetService {
	
	@Autowired
	PlanetRepository planetRepository;

	public Planet searchById(Long id) {
		return this.planetRepository.findFirstById(id);
	}
	
	public Planet updatePlanet(Planet planet) {
		return this.planetRepository.save(planet);
	}

}
