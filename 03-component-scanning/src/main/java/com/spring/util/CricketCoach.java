package com.spring.util;

import org.springframework.stereotype.Component;

// marks the class as a spring bean
@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }

}
