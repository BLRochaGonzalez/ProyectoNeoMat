package org.iesalixar.bluisrochag.neomat.service;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	@Autowired
	LocationRepository locationRepository;

	public Location createLocation(Location location) {
		return locationRepository.save(location);
	}

	public void deleteLocation(Long locationId) {
		this.locationRepository.deleteById(locationId);
	}

	public Location searchById(Long locationId) {
		return this.locationRepository.findFirstById(locationId);
	}
}
