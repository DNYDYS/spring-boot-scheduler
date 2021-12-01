package com.dnydys.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class SchedulerTask {

    private int count=0;

    @Scheduled(cron = "0 36 22 * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }

}
