package com.example.practice.com.example.practice.setterInjection$Field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
   public static void main(String[] args) {
	ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
	appConfig app = a.getBean(appConfig.class);
	app.display();
}
}
