package cn.bdqn.service.impl;

import cn.bdqn.service.DBBackUpService;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DBBackUpServiceImpl implements DBBackUpService, SchedulingConfigurer {

    private String timeCorn = "*/10 * * * * ?";

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.addTriggerTask(new Runnable() {
            public void run() {
                System.out.println("备份数据库");
            }
        }, new Trigger() {
            public Date nextExecutionTime(TriggerContext triggerContext) {
                String cron = timeCorn;
                CronTrigger trigger = new CronTrigger(cron);
                Date nextExec = trigger.nextExecutionTime(triggerContext);
                return nextExec;
            }
        });
    }
}
