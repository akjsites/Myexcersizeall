package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
		AnnotationConfigApplicationContext aa=new AnnotationConfigApplicationContext(AppConfig.class);
		controler user = aa.getBean(controler.class);
		user.transfer(1002, 1001, 1000);
	}
}
