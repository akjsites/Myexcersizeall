package com.example.Java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class load {
     @Bean
     public demo main()
     {
    	 return new demo();
     }
}
