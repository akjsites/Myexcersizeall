package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@ComponentScan(basePackages = "com.example.demo")
public class main {
   public static void main(String[] args) {
	ApplicationContext a=new AnnotationConfigApplicationContext(main.class);
	serViceInjection in = a.getBean(serViceInjection.class);
	in.display();
	
}
}
