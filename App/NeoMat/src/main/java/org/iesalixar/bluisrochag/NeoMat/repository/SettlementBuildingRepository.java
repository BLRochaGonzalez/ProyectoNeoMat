package org.iesalixar.bluisrochag.neomat.repository;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementBuilding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettlementBuildingRepository extends JpaRepository<SettlementBuilding, Long>{

	public List<SettlementBuilding> findAllBySettlementId(Settlement settlement);
	
	@SuppressWarnings("unchecked")
	public SettlementBuilding save(SettlementBuilding sb);

	public SettlementBuilding findFirstById(Long id);

}
