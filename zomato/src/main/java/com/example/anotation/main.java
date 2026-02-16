package com.example.anotation;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.example.anotation")
public class main {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(main.class, args);
        ano g = run.getBean(ano.class);
        System.out.println(g);
	}

}
