package com.example.demo;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
   public static void main(String[] args) {
	 ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
	 factory b = a.getBean(factory.class);
	 b.display();
}
}
