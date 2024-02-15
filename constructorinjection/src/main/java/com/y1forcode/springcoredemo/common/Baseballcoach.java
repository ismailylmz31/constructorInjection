package com.y1forcode.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class Baseballcoach implements Coach {


    public Baseballcoach(){
        System.out.println("In Constructor: " +getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "bu gun beyzbol sopasini getir yegen";
    }
}
