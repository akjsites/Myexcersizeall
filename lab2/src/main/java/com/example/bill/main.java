package com.example.bill;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("NewFile1.xml");
          bill az = a.getBean("bil",bill.class);
          double display = az.display();
          System.out.println("Your Bill Is "+display);
	}

}
