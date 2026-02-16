package com.example.Bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(userclass.class);
		userclass v = a.getBean(userclass.class);
        bank show = v.show1();
        
	}

}
