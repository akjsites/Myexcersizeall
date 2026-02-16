package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration

public class allmaintainservice {
     public static void main(String[] args) {
    	 ApplicationContext a=new AnnotationConfigApplicationContext(adressservice.class);
         student std = a.getBean(student.class);
         System.out.println(std);
	}
}
