package com.example.project2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
public class main {
   public static void main(String[] args) {
	AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(main.class);
	user user = a.getBean(user.class);
	user.check("Hello I am Aswini");
}
}
