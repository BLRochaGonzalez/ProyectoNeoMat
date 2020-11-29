package org.iesalixar.bluisrochag.neomat.repository;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long>{

	@SuppressWarnings("unchecked")
	public Location save(Location l);

	public boolean findByContinentAndCountryAndRegion(Integer cont, Integer coun, Integer regi);

	public static void createLocation(Location l, Settlement settlement) {
		l.setSettlement(settlement);
		return;
	}	
}
