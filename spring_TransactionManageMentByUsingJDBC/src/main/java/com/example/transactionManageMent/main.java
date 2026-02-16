package com.example.transactionManageMent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
   public static void main(String[] args) {
	AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(Appconfig.class);
	controller is = a.getBean(controller.class);
//	user u=new user();
//	u.setAccountNumber("UBI123456");
//	u.setCustomerName("Alex");
//	u.setAccountType("Saving");
//	u.setBalance(2000f);
//	String msg = is.contrillerMainInsert(u);
//	System.out.println(msg);
	
//	user u=new user();
//	u.setAccountNumber("UBI123456");
//	user user = is.contrillerMainselect(u);
//	if(user==null)
//	{
//		System.out.println("This Request Denied");
//	}
//	else {
//		System.out.println(user.getAccountNumber()+" "+user.getCustomerName()+" "+user.getAccountType()+" "+user.getBalance());
//	}
	
	is.contrillerMaintrans("UBI123456", "UBI123457", 600f);
	
}
}
