package org.iesalixar.bluisrochag.neomat.quartz;

import java.util.List;

import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.SettlementBuilding;
import org.iesalixar.bluisrochag.neomat.service.SettlementBuildingService;
import org.iesalixar.bluisrochag.neomat.service.SettlementService;
import org.iesalixar.bluisrochag.neomat.service.UserService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ResourcesUpdateJob implements Job {

	@Autowired
	SettlementBuildingService settlementBuildingService;

	@Autowired
	UserService userService;

	@Autowired
	SettlementService settlementService;

	final static Logger logger = LoggerFactory.getLogger(ResourcesUpdateJob.class);

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {

		logger.warn("Helouda");
		for (Settlement s : this.settlementService.findAll()) {
			List<SettlementBuilding> sbList = this.settlementBuildingService.findAllBySettlementId(s);
			Double e=0.0;
			for (SettlementBuilding sb : sbList) {
				e += sb.getReqEQuantity();
				switch ((sb.getBuildingIds().getId()).intValue()) {
				case 1:
					s.setwQuantity(s.getwQuantity() + sb.getResourceQuantity() / 240);
					this.settlementService.save(s);
					break;
				case 2:
					s.setgQuantity(s.getgQuantity() + sb.getResourceQuantity() / 240);
					this.settlementService.save(s);
					break;
				case 3:
					s.setcQuantity(s.getcQuantity() + sb.getResourceQuantity() / 240);
					this.settlementService.save(s);
					break;
				case 4:
					s.setsQuantity(s.getsQuantity() + sb.getResourceQuantity() / 240);
					this.settlementService.save(s);
					break;
				case 5:
					s.setrQuantity(s.getrQuantity() + sb.getResourceQuantity() / 240);
					this.settlementService.save(s);
					break;
				case 6:
					s.seteQuantity(sb.getResourceQuantity()-e);
					this.settlementService.save(s);
					break;
				}
			}
		}
	}
}