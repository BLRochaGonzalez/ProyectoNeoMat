package org.iesalixar.bluisrochag.neomat.repository;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementResearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettlementResearchRepository extends JpaRepository<SettlementResearch, Long>{
	
	public List<SettlementResearch> findAllBySettlementId(Settlement settlement);
	
	@SuppressWarnings("unchecked")
	public SettlementResearch save(SettlementResearch sr);

	public SettlementResearch findFirstById(Long id);
	
}
