package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.example.demo")
public class main {

	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(main.class);
        Manage be = a.getBean(Manage.class);
        be.add();
	}

}
