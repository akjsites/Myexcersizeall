package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("NewFile.xml");
		factory bean = a.getBean("factory",factory.class);
         System.out.println(bean);
	}

}
