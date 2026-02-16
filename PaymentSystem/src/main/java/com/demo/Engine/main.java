package com.demo.Engine;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(AppConfig.class);
		Enginemain enginee = a.getBean(Enginemain.class);
		enginee.display();
	}
}
