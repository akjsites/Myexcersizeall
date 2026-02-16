package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		autowireddemoacess aw = a.getBean(autowireddemoacess.class);
		System.out.println(aw.a);
		

	}

}
