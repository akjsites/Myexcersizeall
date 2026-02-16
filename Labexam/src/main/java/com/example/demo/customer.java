package com.example.demo;

public class customer {
	Integer orderid; 

	String customername;
    
	customerService amount;

	

	
	public Integer getOrderid() {
		return orderid;
	}




	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}




	public String getCustomername() {
		return customername;
	}




	public void setCustomername(String customername) {
		this.customername = customername;
	}




	public customerService getAmount() {
		return amount;
	}




	public void setAmount(customerService amount) {
		this.amount = amount;
	}




	public void display()
	{
		
		 
		 System.out.println("Yor Id "+orderid);
		 System.out.println("Yor Name "+customername);
		 System.out.println(amount.getI());
	}
	


}
