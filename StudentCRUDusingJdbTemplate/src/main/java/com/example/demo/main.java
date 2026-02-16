package com.example.demo;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.operation.MysqlDb;
import com.example.operation.insert;
import com.example.operation.select;

@ComponentScan("com.example.operation")
public class main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext aa = new AnnotationConfigApplicationContext(main.class);
		insert bean = aa.getBean(insert.class);
		select bean1 = aa.getBean(select.class);
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number ");
			switch (sc.nextInt()) {
			case 1 -> {
				bean.InsertData("AKJ001", "Aswini", 70f);

			}
			case 2 -> {
				bean1.SelectData();

			}
			}

		}
	}
}
