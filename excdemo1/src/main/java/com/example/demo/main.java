package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
@Configuration
public class main {

	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(BusStore.class);
		BusStore bus = a.getBean(BusStore.class);

		bus.getbBus();
		bus.display(new Bus("volvo", "1232100AS"));
	}

}
