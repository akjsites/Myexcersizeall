package com.example.demo;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) throws IOException {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		database db = a.getBean(database.class);
		db.adddata();

	}

}
