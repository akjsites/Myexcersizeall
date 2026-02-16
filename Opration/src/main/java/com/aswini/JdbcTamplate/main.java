package com.aswini.JdbcTamplate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(AppConfig.class);
	operation std = a.getBean(operation.class);
//	std.insertdata(new student("1000"));
	std.selectData("111111");
//	std.update("1000", new student("111111"));
	
//	std.delete(new student("111111"));
}
}
