package com.demo.payment;


public class CreditCardPayment implements Payment{

	@Override
	public void payment() {
		System.out.println("Application Started\r\n"
				+ "Credit Card Payment Selected\r\n"
				+ "Processing payment of ₹5000.0 using Credit Card\r\n"
				+ "Payment Successful\r\n"
				+ "");
		
	}

	

}
