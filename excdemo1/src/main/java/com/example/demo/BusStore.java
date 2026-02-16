package com.example.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BusStore {
	Set<Bus> bus=new HashSet<>();
    Bus b;
    @Bean
    public Bus getbBus()
    {
    	 System.out.println("hello");
    	 
    	 
    	 
    	 
    	 return new Bus();
    }
    public void display(Bus b)
    {
     	bus.add(b);
    	      bus.parallelStream().forEach(s->System.out.println(s));
    	      
    }
}
