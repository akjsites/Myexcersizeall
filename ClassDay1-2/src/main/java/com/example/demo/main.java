package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {

		ApplicationContext a=new AnnotationConfigApplicationContext(mainconfig.class);
		bus bus = a.getBean(bus.class);
		bus.display();
	}

}
