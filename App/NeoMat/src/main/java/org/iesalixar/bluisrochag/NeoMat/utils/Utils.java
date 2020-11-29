package org.iesalixar.bluisrochag.neomat.utils;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Utils {
	
	@Autowired
	static
	LocationRepository locationRepository;

	public static Location generateLocation(Location l) {

		for (int x = 1; x >= 5; x++) {
			for (int y = 1; y >= 10; y++) {
				for (int z = 1; z >= 25; z++) {
					if (!locationRepository.findByContinentAndCountryAndRegion(x, y, z)) {
						l = new Location(x, y, z);
					}
				}
			}
		}
		return l;
	}
}
