package org.iesalixar.bluisrochag.neomat.service;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementTroup;
import org.iesalixar.bluisrochag.neomat.model.Troup;
import org.iesalixar.bluisrochag.neomat.repository.SettlementTroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SettlementTroupService {

	@Autowired
	SettlementTroupRepository settlementTroupRepository;

	public void createSettlementTroup(SettlementTroup st) {
		this.settlementTroupRepository.save(st);
	}

	public List<SettlementTroup> findAllBySettlementId(Settlement settlement) {
		return this.settlementTroupRepository.findAllBySettlementId(settlement);
	}

	public SettlementTroup findFirstById(Long id) {
		return this.settlementTroupRepository.findFirstById(id);
	}

	@Async
	public void createNewTroup(Troup t, SettlementTroup st, Integer q) throws InterruptedException {

		Thread.sleep(t.getCreateTime() * q * 1000);

		st.setQuantity(st.getQuantity() + q);

		this.createSettlementTroup(st);

	}

	public SettlementTroup findFirstBySettlementIdAndTroupId(Settlement s, Troup t) {
		return this.settlementTroupRepository.findFirstBySettlementIdAndTroupId(s, t);
	}

}
