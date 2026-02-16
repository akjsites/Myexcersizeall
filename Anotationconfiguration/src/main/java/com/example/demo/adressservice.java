package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class adressservice {
    @Bean
	public adress getadress()
    {
    	   adress a=new adress();
    	   a.setAdress("Hydrabad");
    	   a.setPno("12000");
    	   a.setPin("2345");
    	   return a;
    }
    @Bean
	public student getstudent()
	{
		student s=new student();
		s.setName("Aswini");
		s.setPhno("2999");
		return s;
	}

}
