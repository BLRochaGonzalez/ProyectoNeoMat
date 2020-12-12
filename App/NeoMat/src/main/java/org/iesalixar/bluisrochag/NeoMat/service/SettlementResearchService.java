package org.iesalixar.bluisrochag.neomat.service;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementBuilding;
import org.iesalixar.bluisrochag.neomat.model.SettlementResearch;
import org.iesalixar.bluisrochag.neomat.model.Troup;
import org.iesalixar.bluisrochag.neomat.repository.SettlementResearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SettlementResearchService {

	@Autowired
	SettlementResearchRepository settlementResearchRepository;
	
	@Autowired
	SettlementBuildingService settlementBuildingService;
	
	@Autowired
	TroupService troupService;

	public void createSettlementResearch(SettlementResearch sr) {
		this.settlementResearchRepository.save(sr);
	}

	public SettlementResearch findFirstById(Long id) {
		return this.settlementResearchRepository.findFirstById(id);
	}

	public List<SettlementResearch> findAllBySettlementId(Settlement settlement) {
		return this.settlementResearchRepository.findAllBySettlementId(settlement);
	}
	
	public List<SettlementResearch> findAll() {
		return this.settlementResearchRepository.findAll();
	}

	public void save(SettlementResearch sr) {
		this.settlementResearchRepository.save(sr);

	}

	@Async
	public void upgradeResearch(SettlementResearch sr) throws InterruptedException {

		Thread.sleep(sr.getResearchTime() * 1000);
		
		sr.setResearchLevel(sr.getResearchLevel() + 1);
		sr.setReqWQuantity(((Long) Math.round(sr.getReqWQuantity() * 2)).doubleValue());
		sr.setReqGQuantity(((Long) Math.round(sr.getReqGQuantity() * 2)).doubleValue());
		sr.setReqCQuantity(((Long) Math.round(sr.getReqCQuantity() * 2)).doubleValue());
		sr.setReqSQuantity(((Long) Math.round(sr.getReqSQuantity() * 2)).doubleValue());
		sr.setReqRadQuantity(((Long) Math.round(sr.getReqRadQuantity() * 2)).doubleValue());
		sr.setResearchTime(((Long) Math.round(sr.getResearchTime() * 1.8)).intValue());
		
		Integer sid = sr.getResearchIds().getId().intValue();
		switch (sid) {
		case 1:
			List<SettlementBuilding> sbList = this.settlementBuildingService.findAll();
			for (SettlementBuilding sb : sbList) {
				sb.setResourceQuantity(((Long) Math.round(sb.getResourceQuantity() * 1.04)).doubleValue());
				this.settlementBuildingService.save(sb);
			}
			break;
		case 2:
			List<SettlementBuilding> sbList2 = this.settlementBuildingService.findAll();
			for (SettlementBuilding sb : sbList2) {
				sb.setBuildTime(((Long) Math.round(sb.getBuildTime() * 0.85)).intValue());
				this.settlementBuildingService.save(sb);
			}
			break;
		case 4:
			List<Troup> trList = this.troupService.findAll();
			for (Troup tr : trList) {
				tr.setLife(((Long) Math.round(tr.getLife() * 1.1)).doubleValue());
				this.troupService.save(tr);
			}
			break;
		case 5:
			List<Troup> trList2 = this.troupService.findAll();
			for (Troup tr : trList2) {
				tr.setShield(((Long) Math.round(tr.getShield() * 1.1)).doubleValue());
				this.troupService.save(tr);
			}
			break;
		case 6:
			List<Troup> trList3 = this.troupService.findAll();
			for (Troup tr : trList3) {
				tr.setDamage(((Long) Math.round(tr.getDamage() * 1.1)).doubleValue());
				this.troupService.save(tr);
			}
			break;
		}

		this.createSettlementResearch(sr);

	}

}
