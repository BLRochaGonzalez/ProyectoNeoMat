package org.iesalixar.bluisrochag.neomat.service;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementBuilding;
import org.iesalixar.bluisrochag.neomat.model.SettlementResearch;
import org.iesalixar.bluisrochag.neomat.model.Troup;
import org.iesalixar.bluisrochag.neomat.repository.SettlementBuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SettlementBuildingService {
	
	@Autowired
	SettlementBuildingRepository settlementBuildingRepository;
	
	@Autowired
	SettlementService settlementService;
	
	@Autowired
	TroupService troupService;
	
	@Autowired
	SettlementResearchService settlementResearchService;

	public List<SettlementBuilding> findAllBySettlementId(Settlement settlement) {
		return this.settlementBuildingRepository.findAllBySettlementId(settlement);
	}

	public void createSettlementBuilding(SettlementBuilding sb) {
		this.settlementBuildingRepository.save(sb);
	}

	public SettlementBuilding findFirstById(Long id) {
		return this.settlementBuildingRepository.findFirstById(id);
	}

	@Async
	public void upgradeBuilding(Settlement s, SettlementBuilding sb) throws InterruptedException {
		
		if (s.getwQuantity() >= sb.getReqWQuantity() && s.getgQuantity() >= sb.getReqGQuantity()
				&& s.getcQuantity() >= sb.getReqCQuantity() && s.getsQuantity() >= sb.getReqSQuantity()
				&& s.getrQuantity() >= sb.getReqRadQuantity() && s.geteQuantity() >= sb.getReqEQuantity()) {
			
			Thread.sleep(sb.getBuildTime() * 1000);
			s.setwQuantity(s.getwQuantity()-sb.getReqWQuantity());
			s.setgQuantity(s.getgQuantity()-sb.getReqGQuantity());
			s.setcQuantity(s.getcQuantity()-sb.getReqCQuantity());
			s.setsQuantity(s.getsQuantity()-sb.getReqSQuantity());
			s.setrQuantity(s.getrQuantity()-sb.getReqRadQuantity());
			s.seteQuantity(s.geteQuantity()-sb.getReqEQuantity());
			
			
			
			Integer bid = sb.getBuildingIds().getId().intValue();
			switch (bid) {
				case 1:
					sb.setBuildLevel(sb.getBuildLevel()+1);
					sb.setReqWQuantity(((Long)Math.round(sb.getReqWQuantity()*1.5)).doubleValue());
					sb.setReqGQuantity(((Long)Math.round(sb.getReqGQuantity()*1.5)).doubleValue());
					sb.setReqCQuantity(((Long)Math.round(sb.getReqCQuantity()*1.5)).doubleValue());
					sb.setReqSQuantity(((Long)Math.round(sb.getReqSQuantity()*1.5)).doubleValue());
					sb.setReqRadQuantity(((Long)Math.round(sb.getReqRadQuantity()*1.5)).doubleValue());
					sb.setReqEQuantity(((Long)Math.round(sb.getReqEQuantity()*1.5)).doubleValue());
					sb.setResourceQuantity(((Long)Math.round(10*sb.getBuildLevel()*(1.1*sb.getBuildLevel()))).doubleValue());
					sb.setBuildTime(((Long)Math.round(sb.getBuildTime()*1.5)).intValue());
					break;
				case 2:
					sb.setBuildLevel(sb.getBuildLevel()+1);
					sb.setReqWQuantity(((Long)Math.round(sb.getReqWQuantity()*1.4)).doubleValue());
					sb.setReqGQuantity(((Long)Math.round(sb.getReqGQuantity()*1.4)).doubleValue());
					sb.setReqCQuantity(((Long)Math.round(sb.getReqCQuantity()*1.4)).doubleValue());
					sb.setReqSQuantity(((Long)Math.round(sb.getReqSQuantity()*1.4)).doubleValue());
					sb.setReqRadQuantity(((Long)Math.round(sb.getReqRadQuantity()*1.4)).doubleValue());
					sb.setReqEQuantity(((Long)Math.round(sb.getReqEQuantity()*1.4)).doubleValue());
					sb.setResourceQuantity(((Long)Math.round(15*sb.getBuildLevel()*(1.15*sb.getBuildLevel()))).doubleValue());
					sb.setBuildTime(((Long)Math.round(sb.getBuildTime()*1.5)).intValue());
					break;
				case 3:
					sb.setBuildLevel(sb.getBuildLevel()+1);
					sb.setReqWQuantity(((Long)Math.round(sb.getReqWQuantity()*1.4)).doubleValue());
					sb.setReqGQuantity(((Long)Math.round(sb.getReqGQuantity()*1.4)).doubleValue());
					sb.setReqCQuantity(((Long)Math.round(sb.getReqCQuantity()*1.4)).doubleValue());
					sb.setReqSQuantity(((Long)Math.round(sb.getReqSQuantity()*1.4)).doubleValue());
					sb.setReqRadQuantity(((Long)Math.round(sb.getReqRadQuantity()*1.4)).doubleValue());
					sb.setReqEQuantity(((Long)Math.round(sb.getReqEQuantity()*1.4)).doubleValue());
					sb.setResourceQuantity(((Long)Math.round(15*sb.getBuildLevel()*(1.15*sb.getBuildLevel()))).doubleValue());
					sb.setBuildTime(((Long)Math.round(sb.getBuildTime()*1.5)).intValue());
					break;
				case 4:
					sb.setBuildLevel(sb.getBuildLevel()+1);
					sb.setReqWQuantity(((Long)Math.round(sb.getReqWQuantity()*1.3)).doubleValue());
					sb.setReqGQuantity(((Long)Math.round(sb.getReqGQuantity()*1.3)).doubleValue());
					sb.setReqCQuantity(((Long)Math.round(sb.getReqCQuantity()*1.3)).doubleValue());
					sb.setReqSQuantity(((Long)Math.round(sb.getReqSQuantity()*1.3)).doubleValue());
					sb.setReqRadQuantity(((Long)Math.round(sb.getReqRadQuantity()*1.3)).doubleValue());
					sb.setReqEQuantity(((Long)Math.round(sb.getReqEQuantity()*1.3)).doubleValue());
					sb.setResourceQuantity(((Long)Math.round(20*sb.getBuildLevel()*(1.2*sb.getBuildLevel()))).doubleValue());
					sb.setBuildTime(((Long)Math.round(sb.getBuildTime()*1.5)).intValue());
					break;
				case 5:
					sb.setBuildLevel(sb.getBuildLevel()+1);
					sb.setReqWQuantity(((Long)Math.round(sb.getReqWQuantity()*1.3)).doubleValue());
					sb.setReqGQuantity(((Long)Math.round(sb.getReqGQuantity()*1.3)).doubleValue());
					sb.setReqCQuantity(((Long)Math.round(sb.getReqCQuantity()*1.3)).doubleValue());
					sb.setReqSQuantity(((Long)Math.round(sb.getReqSQuantity()*1.3)).doubleValue());
					sb.setReqRadQuantity(((Long)Math.round(sb.getReqRadQuantity()*1.3)).doubleValue());
					sb.setReqEQuantity(((Long)Math.round(sb.getReqEQuantity()*1.3)).doubleValue());
					sb.setResourceQuantity(((Long)Math.round(5*sb.getBuildLevel()*(1.05*sb.getBuildLevel()))).doubleValue());
					sb.setBuildTime(((Long)Math.round(sb.getBuildTime()*1.5)).intValue());
					break;
				case 6:
					sb.setBuildLevel(sb.getBuildLevel()+1);
					sb.setReqWQuantity(((Long)Math.round(sb.getReqWQuantity()*1.4)).doubleValue());
					sb.setReqGQuantity(((Long)Math.round(sb.getReqGQuantity()*1.4)).doubleValue());
					sb.setReqCQuantity(((Long)Math.round(sb.getReqCQuantity()*1.4)).doubleValue());
					sb.setReqSQuantity(((Long)Math.round(sb.getReqSQuantity()*1.4)).doubleValue());
					sb.setReqRadQuantity(((Long)Math.round(sb.getReqRadQuantity()*1.4)).doubleValue());
					sb.setReqEQuantity(((Long)Math.round(sb.getReqEQuantity()*1.4)).doubleValue());
					sb.setResourceQuantity(((Long)Math.round(75+15*sb.getBuildLevel()*(1.15*sb.getBuildLevel()))).doubleValue());
					sb.setBuildTime(((Long)Math.round(sb.getBuildTime()*1.5)).intValue());
					break;
				case 7:
					sb.setBuildLevel(sb.getBuildLevel()+1);
					sb.setReqWQuantity(((Long)Math.round(sb.getReqWQuantity()*2)).doubleValue());
					sb.setReqGQuantity(((Long)Math.round(sb.getReqGQuantity()*2)).doubleValue());
					sb.setReqCQuantity(((Long)Math.round(sb.getReqCQuantity()*2)).doubleValue());
					sb.setReqSQuantity(((Long)Math.round(sb.getReqSQuantity()*2)).doubleValue());
					sb.setReqRadQuantity(((Long)Math.round(sb.getReqRadQuantity()*2)).doubleValue());
					sb.setBuildTime(((Long)Math.round(sb.getBuildTime()*1.5)).intValue());
					List<Troup> trList = this.troupService.findAll();
					for(Troup tr: trList) {
						tr.setCreateTime(((Long)Math.round(tr.getCreateTime()*0.6)).intValue());
						this.troupService.save(tr);
					}
					break;
				case 8:
					sb.setBuildLevel(sb.getBuildLevel()+1);
					sb.setReqWQuantity(((Long)Math.round(sb.getReqWQuantity()*2)).doubleValue());
					sb.setReqGQuantity(((Long)Math.round(sb.getReqGQuantity()*2)).doubleValue());
					sb.setReqCQuantity(((Long)Math.round(sb.getReqCQuantity()*2)).doubleValue());
					sb.setReqSQuantity(((Long)Math.round(sb.getReqSQuantity()*2)).doubleValue());
					sb.setReqRadQuantity(((Long)Math.round(sb.getReqRadQuantity()*2)).doubleValue());
					sb.setBuildTime(((Long)Math.round(sb.getBuildTime()*1.5)).intValue());
					List<SettlementResearch> srList = this.settlementResearchService.findAll();
					for(SettlementResearch sr: srList) {
						sr.setResearchTime(((Long)Math.round(sr.getResearchTime()*0.6)).intValue());
						this.settlementResearchService.save(sr);
					}
					break;
					
			}
			
			this.settlementService.createSettlement(s);
			this.createSettlementBuilding(sb);
			
			
		}
	}


}
