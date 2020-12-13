package org.iesalixar.bluisrochag.neomat.repository;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{

	@SuppressWarnings("unchecked")
	public Location save(Location l);

	public Location findLocationFirstByContinentAndCountryAndRegion(Integer cont, Integer coun, Integer regi);

	public Location searchBySettlement(Long settlementId);

	public Location findFirstById(Long locationId);

	public List<Location> findAllByContinentAndCountry(Integer c, Integer p);


}
