package com.example.demo;

import java.beans.beancontext.BeanContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
   public static void main(String[] args) {
	 ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
	 list bean = a.getBean(list.class);
	 bean.display();
}
}
