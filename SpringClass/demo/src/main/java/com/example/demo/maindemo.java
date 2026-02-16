package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class maindemo {

	public static void main(String[] args) {
      ApplicationContext a=new AnnotationConfigApplicationContext(maindemo.class);
      airoplane bean = a.getBean(airoplane.class);
      bean.display();
	}

}
