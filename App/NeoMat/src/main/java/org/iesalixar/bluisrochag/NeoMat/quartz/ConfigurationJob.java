package org.iesalixar.bluisrochag.neomat.quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationJob {

	
	@Bean
	public JobDetail jobADetails() {
			
		return JobBuilder.newJob(ResourcesUpdateJob.class).withIdentity("resourcesUpdate").storeDurably().build();
		
	}

	@Bean
	public Trigger jobATrigger(JobDetail jobADetails) {

		return TriggerBuilder.newTrigger().forJob(jobADetails).withIdentity("resourcesUpdateTrigger")
				.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();
	}
}