package com.demo.Engine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
     @Bean
     public PetrolEngine PetrolEngine()
     {
    	 return new PetrolEngine();
     }
     @Bean
     public DiselEngine DiselEngine()
     {
    	 return new DiselEngine();
     }
     @Bean
     public ElectricEngine ElectricEngine()
     {
    	 return new ElectricEngine();
     }
     @Bean
     public Enginemain Enginemain()
     {
    	 return new Enginemain();
     }
}
