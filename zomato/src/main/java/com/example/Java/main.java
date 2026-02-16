package com.example.Java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(load.class);
		demo i = a.getBean(demo.class);
        System.out.println(i);
	}

}
