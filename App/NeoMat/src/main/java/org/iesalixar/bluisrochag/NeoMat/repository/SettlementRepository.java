package org.iesalixar.bluisrochag.neomat.repository;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettlementRepository extends JpaRepository<Settlement, Long>{

	@SuppressWarnings("unchecked")
	public Settlement save(Settlement s);

	public List<Settlement> findByUser(User u);

	public Settlement findFirstById(Long settlementId);

	public Settlement findFirstByName(String string);

	public Settlement findFirstByUser(User authUser);


}