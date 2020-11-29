package org.iesalixar.bluisrochag.neomat.service;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	@Autowired
	LocationRepository locationRepository;

	public Location createLocation(Location location, Settlement settlement) {
		LocationRepository.createLocation(location, settlement);
		return locationRepository.save(location);
	}
}
