package org.iesalixar.bluisrochag.neomat.service;

import org.iesalixar.bluisrochag.neomat.model.Location;
import org.iesalixar.bluisrochag.neomat.model.Planet;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.User;
import org.iesalixar.bluisrochag.neomat.repository.SettlementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettlementService {

	@Autowired
	SettlementRepository settlementRepository;

	public Settlement createSettlement(Settlement settlement, User user, Planet planet, Location location) {
		SettlementRepository.createSettlement(settlement, user, planet, location);
		return settlementRepository.save(settlement);
	}
}
