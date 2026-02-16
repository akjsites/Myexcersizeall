package com.example.practice.setterInjection$javaCofiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appCponfig {
     @Bean
     public product getproduct()
     {
    	 product product = new product("HighSpeedRun", "AKJ011111", 1000009);
//    	 product.setName("Moter");
//    	 product.setId("1001");
//    	 product.setPrice(1000);
    	 return product;
     }
}
