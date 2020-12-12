package org.iesalixar.bluisrochag.neomat.repository;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementTroup;
import org.iesalixar.bluisrochag.neomat.model.Troup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettlementTroupRepository extends JpaRepository<SettlementTroup, Long>{

	public List<SettlementTroup> findAllBySettlementId(Settlement settlement);
	
	@SuppressWarnings("unchecked")
	public SettlementTroup save(SettlementTroup st);

	public SettlementTroup findFirstById(Long id);

	public SettlementTroup findFirstBySettlementIdAndTroupId(Settlement s, Troup t);
}
