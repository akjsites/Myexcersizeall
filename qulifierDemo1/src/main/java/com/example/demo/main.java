package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
     public static void main(String[] args) {
		AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(qulifierconstructor.class);
		qulifierconstructor std = a.getBean(qulifierconstructor.class);
		std.show();
	}
}
