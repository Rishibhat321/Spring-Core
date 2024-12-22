package com.spring.SpringCore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

// marks the class as a spring bean
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // define our init method
    @PostConstruct
    public void doStuff() {
        System.out.println("In doStuff(): " + getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doCleanUpStuff() {
        System.out.println("In doCleanUpStuff(): " + getClass().getSimpleName());
    }

    
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }

}
