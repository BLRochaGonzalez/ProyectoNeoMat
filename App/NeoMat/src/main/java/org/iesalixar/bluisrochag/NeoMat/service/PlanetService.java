package org.iesalixar.bluisrochag.neomat.service;

import org.iesalixar.bluisrochag.neomat.model.Planet;
import org.iesalixar.bluisrochag.neomat.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanetService {
	
	@Autowired
	static
	PlanetRepository planetRepository;

	public Planet search(String name) {
		return planetRepository.findByName(name);
	}
}
