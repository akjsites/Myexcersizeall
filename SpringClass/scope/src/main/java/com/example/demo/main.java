package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("NewFile.xml");
		 Book bean = a.getBean(Book.class);
		 System.out.println(bean.hashCode());
		 
		 Book bean1 = a.getBean(Book.class);
		 System.out.println(bean1.hashCode());

	}

}
