package com.spring.SpringCore.rest;

import com.spring.SpringCore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for dependency
    private Coach myCoach;

  //  private Coach anotherCoach;


    // Constructor Injection
 /*   @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

  */

    @Autowired
    public DemoController(
            @Qualifier("swimCoach") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


    // check the bean scopes
/*    @GetMapping("/check")
    public String check() {
        // true for singleton , false for prototype
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach==anotherCoach);
    }

 */


}
