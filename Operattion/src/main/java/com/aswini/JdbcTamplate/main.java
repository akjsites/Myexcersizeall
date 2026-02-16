package com.aswini.JdbcTamplate;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(AppConfig.class);
	operation std = a.getBean(operation.class);
	while(true) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number 1.insert,2 select 3.update,4 .delete 5 exit");
	int num = sc.nextInt();
	switch(num) {
	case 1->{
		System.out.println("Enter id");
	    String  id = sc.next();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter adress");
		String adress = sc.next();
		employees emp=new employees(id, name, adress);
		std.insertdata(emp);
	
	}
	case 2->{
		System.out.println("Enter id");
	    String  id = sc.next();
         std.selectData(id);
	
		
	}
	case 3->{
		System.out.println("Enter id");
	    String  id = sc.next();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter adress");
		String adress = sc.next();
		employees emp1=new employees(id, name, adress);
		std.update(emp1);
		
	}
	case 4->{
		System.out.println("Enter id");
	    String  id = sc.next();
		std.delete("1001");
	}
	case 5->{System.exit(0);}
	}
	
	}
}
}
