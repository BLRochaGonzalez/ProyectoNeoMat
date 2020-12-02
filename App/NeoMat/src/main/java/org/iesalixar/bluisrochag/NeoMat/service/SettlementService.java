package org.iesalixar.bluisrochag.neomat.service;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.repository.LocationRepository;
import org.iesalixar.bluisrochag.neomat.repository.SettlementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettlementService {

	@Autowired
	SettlementRepository settlementRepository;
	
	@Autowired
	LocationRepository locationRepository;
	
	@Autowired
	LocationService locationService;

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
}
