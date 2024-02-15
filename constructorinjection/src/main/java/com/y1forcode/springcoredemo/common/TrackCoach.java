package com.y1forcode.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
//@Lazy
@Component
public class TrackCoach implements Coach{

    public  TrackCoach(){
        System.out.println("In Constructor: " +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Track ne demek dayi";
    }
}
