package com.aswini;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
		AnnotationConfigApplicationContext aa=new AnnotationConfigApplicationContext(Appconfig.class);
		student std = aa.getBean(student.class);
		System.out.println(std);
	}
}
