package com.example.practice.setterInjection$javaCofiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(appCponfig.class);
		product product = a.getBean(product.class);
		System.out.println(product);

	}

}
