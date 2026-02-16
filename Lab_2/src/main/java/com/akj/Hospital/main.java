package com.akj.Hospital;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.akj.Hospital")
public class main {

	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(main.class);
		HosHandler hos = a.getBean(HosHandler.class);
		hos.hospitaldataAdd();
		

	}

}
