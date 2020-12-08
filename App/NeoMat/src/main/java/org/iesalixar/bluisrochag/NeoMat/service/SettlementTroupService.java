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
	
	@Autowired
	SettlementService settlementService;

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
	public void createNewTroup(Settlement s, Troup t, SettlementTroup st, String quantity) throws InterruptedException {
		Integer q = Integer.getInteger(quantity);
		if (s.getwQuantity() >= t.getReqWQuantity()*q && s.getgQuantity() >= t.getReqGQuantity()*q
				&& s.getcQuantity() >= t.getReqCQuantity()*q && s.getsQuantity() >= t.getReqSQuantity()*q
				&& s.getrQuantity() >= t.getReqRadQuantity()*q) {
			
			Thread.sleep(t.getCreateTime()*q* 1000);
			
			s.setwQuantity(s.getwQuantity()-t.getReqWQuantity()*st.getQuantity());
			s.setgQuantity(s.getgQuantity()-t.getReqGQuantity()*st.getQuantity());
			s.setcQuantity(s.getcQuantity()-t.getReqCQuantity()*st.getQuantity());
			s.setsQuantity(s.getsQuantity()-t.getReqSQuantity()*st.getQuantity());
			s.setrQuantity(s.getrQuantity()-t.getReqRadQuantity()*st.getQuantity());
			
			st.setQuantity(st.getQuantity()+q);
			
			this.settlementService.createSettlement(s);
			this.createSettlementTroup(st);
			
			
			}
	}

}
