package cn.bdqn.config;

import cn.bdqn.service.impl.DBBackJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail dbBackJobDetail() {
        return JobBuilder.newJob(DBBackJob.class)
                .withIdentity("dbBackJob") // 标识符
                .usingJobData("msg", "Hello Quartz")
                .storeDurably().build();
    }

    @Bean
    public Trigger printTimeJobTrigger() {
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("*/5 * * * * ?");
        return TriggerBuilder.newTrigger().forJob(dbBackJobDetail())
        .withIdentity("quartzTaskService").withSchedule(cronScheduleBuilder).build();
    }
}