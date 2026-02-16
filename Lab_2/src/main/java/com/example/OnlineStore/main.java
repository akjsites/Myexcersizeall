package com.example.OnlineStore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		productmain p = a.getBean(productmain.class);
        p.dispplay();
		
	}

}
