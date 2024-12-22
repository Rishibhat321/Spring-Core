package com.spring.SpringCore.config;

import com.spring.SpringCore.common.Coach;
import com.spring.SpringCore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        // here the bean id refers to the method name swimCoach (also when we injected in the controller) here
        return new SwimCoach();
    }


}
