package com.y1forcode.springcoredemo.common;

import org.springframework.stereotype.Component;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "yuzdun yuzdun kuyruguna geldin be cengiz";
    }
}
