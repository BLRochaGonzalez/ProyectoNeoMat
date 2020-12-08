package org.iesalixar.bluisrochag.neomat.service;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementResearch;
import org.iesalixar.bluisrochag.neomat.repository.SettlementResearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SettlementResearchService {
	
	@Autowired
	SettlementResearchRepository settlementResearchRepository;
	
	@Autowired
	SettlementService settlementService;

	public void createSettlementResearch(SettlementResearch sr) {
		this.settlementResearchRepository.save(sr);
	}

	public SettlementResearch findFirstById(Long id) {
		return this.settlementResearchRepository.findFirstById(id);
	}
	
	public List<SettlementResearch> findAllBySettlementId(Settlement settlement) {
		return this.settlementResearchRepository.findAllBySettlementId(settlement);
	}

	@Async
	public void upgradeResearch(Settlement s, SettlementResearch sr) throws InterruptedException{
		if (s.getwQuantity() >= sr.getReqWQuantity() && s.getgQuantity() >= sr.getReqGQuantity()
				&& s.getcQuantity() >= sr.getReqCQuantity() && s.getsQuantity() >= sr.getReqSQuantity()
				&& s.getrQuantity() >= sr.getReqRadQuantity()) {
			Thread.sleep(sr.getResearchTime() * 1000);
			s.setwQuantity(s.getwQuantity()-sr.getReqWQuantity());
			s.setgQuantity(s.getgQuantity()-sr.getReqGQuantity());
			s.setcQuantity(s.getcQuantity()-sr.getReqCQuantity());
			s.setsQuantity(s.getsQuantity()-sr.getReqSQuantity());
			s.setrQuantity(s.getrQuantity()-sr.getReqRadQuantity());
			
			sr.setResearchLevel(sr.getResearchLevel()+1);
			sr.setReqWQuantity(((Long)Math.round(sr.getReqWQuantity()*2)).doubleValue());
			sr.setReqGQuantity(((Long)Math.round(sr.getReqGQuantity()*2)).doubleValue());
			sr.setReqCQuantity(((Long)Math.round(sr.getReqCQuantity()*2)).doubleValue());
			sr.setReqSQuantity(((Long)Math.round(sr.getReqSQuantity()*2)).doubleValue());
			sr.setReqRadQuantity(((Long)Math.round(sr.getReqRadQuantity()*2)).doubleValue());
			sr.setResearchTime(((Long)Math.round(sr.getResearchTime()*1.8)).intValue());
				
			
			this.settlementService.createSettlement(s);
			this.createSettlementResearch(sr);
			
			
			}
	}

	public List<SettlementResearch> findAll() {
		return this.settlementResearchRepository.findAll();
	}

	public void save(SettlementResearch sr) {
		this.settlementResearchRepository.save(sr);
		
	}

	
}
