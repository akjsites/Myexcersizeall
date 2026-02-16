package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mainconfig {
    bus b=new bus();
    @Bean
	public bus getdta()
	{
		b.setName("volvo");
		return b;
	}
    public flight getflight()
    {
    	   return new flight(b);
    }
	
}
