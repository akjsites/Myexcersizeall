package com.example.springLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean
    public springLifeCycle getBean()
    {
    	    return new springLifeCycle();
    }
}
