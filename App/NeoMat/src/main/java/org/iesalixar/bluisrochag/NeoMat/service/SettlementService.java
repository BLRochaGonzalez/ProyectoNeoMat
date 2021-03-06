package org.iesalixar.bluisrochag.neomat.service;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.repository.SettlementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettlementService {

	@Autowired
	SettlementRepository settlementRepository;

	public Settlement createSettlement(Settlement settlement) {
		return settlementRepository.save(settlement);
	}

	public List<Settlement> readAllSettlements(User u) {
		return this.settlementRepository.findByUser(u);
	}

	public void deleteSettlement(Long settlementId) {
		this.settlementRepository.deleteById(settlementId);
	}

	public Settlement searchById(Long settlementId) {
		return this.settlementRepository.findFirstById(settlementId);
	}

	public List<Settlement> findAll() {
		return this.settlementRepository.findAll();
	}

	public void save(Settlement s) {
		this.settlementRepository.save(s);
		
	}

	public Settlement findFirstById(Long l) {
		return this.settlementRepository.findFirstById(l);
	}

	public Settlement findFirstByName(String string) {
		return this.settlementRepository.findFirstByName(string);
	}

	public Settlement findFirstByUser(User authUser) {
		return this.settlementRepository.findFirstByUser(authUser);
	}

}
