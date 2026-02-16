package com.demo.payment;


public class DebitCardPayment implements Payment{

	@Override
	public void payment() {
		System.out.println("Application Started\r\n"
				+ "Debit Card Payment Selected\r\n"
				+ "Processing payment of ₹5000.0 using Debit Card\r\n"
				+ "Payment Successful\r\n"
				+ "");
		
	}

}
