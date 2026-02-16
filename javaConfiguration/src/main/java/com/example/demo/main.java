package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com")
public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(main.class);
		OrderService order = a.getBean(OrderService.class);
		order.placeOrder("Aswini", 100);
	}
}
