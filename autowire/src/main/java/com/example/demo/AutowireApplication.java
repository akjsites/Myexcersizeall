package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AutowireApplication {

	public static void main(String[] args) {
	      AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(app_config.class);
	      
	      applyclass std = a.getBean(applyclass.class);
	      std.show();
	}

}
