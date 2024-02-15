package com.y1forcode.springcoredemo.rest;

import com.y1forcode.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;
    @Autowired
    /* public DemoController(@Qualifier("cricketCoach") Coach theCoach,
                          @Qualifier("cricketCoach") Coach theAnotherCoach){
        System.out.println("In Constructor: "+getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }     */
    public DemoController(@Qualifier("boyledekullanilabilir") Coach theCoach                          ){
        System.out.println("In Constructor: "+getClass().getSimpleName());
        myCoach = theCoach;

    }


    @GetMapping("/dailyworkout2")
    public String getDailyWorkout2(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach , " + (myCoach == anotherCoach);
    }

    // asagidaki kod primary anotasyonu ile calisir yukardakinda ise qualifier belirlenmistir
   /* @Autowired
    public void DemoController2(Coach theCoach2){
        myCoach = theCoach2;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    } */
}
