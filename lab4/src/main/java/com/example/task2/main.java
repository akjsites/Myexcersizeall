package com.example.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.example.task2")
public class main {

	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(main.class);
		ServiceLoan loan = a.getBean(ServiceLoan.class);
		loan.validamount();
		loan.printdispaly();
		loan.print();
	}

}
