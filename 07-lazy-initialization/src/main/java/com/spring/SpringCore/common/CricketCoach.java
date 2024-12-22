package com.spring.SpringCore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


// marks the class as a spring bean
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }

}
