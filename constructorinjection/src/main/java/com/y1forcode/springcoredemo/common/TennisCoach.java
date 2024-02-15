package com.y1forcode.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In Constructor: " +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Raketleri unutma yegen";
    }
}
