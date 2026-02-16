package com.example.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.example.task1")
public class main {

	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(main.class);
		orderservi order = a.getBean(orderservi.class);
		order.validamount();
        order.printdispaly();
	}

}
