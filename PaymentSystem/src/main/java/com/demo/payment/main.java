package com.demo.payment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(AppConfig.class);
		PaymentService payment = a.getBean(PaymentService.class);
		payment.display();
	}
}
