package com.y1forcode.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: " +getClass().getSimpleName());
    }

   /* @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("in domystartupstuff() :  " +getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("in domyCleanupstuff() :  " +getClass().getSimpleName());
    }
*/
    @Override
    public String getDailyWorkout() {
        return "pratik basliyor yegen 15 dakika icinde avluda ol";
    }
}
