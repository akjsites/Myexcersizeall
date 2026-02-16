package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("NewFile.xml");
		user bean = a.getBean(user.class);
        bean.show();
		
	}

}
