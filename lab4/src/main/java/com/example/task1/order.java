package com.example.task1;

import org.springframework.stereotype.Component;

@Component
public class order {

	String orderId;

	String customerName;

	Double totalAmount;

	Integer itemsCount;

	String membershipType;
	public order() {}
	public order(String orderId, String customerName, Double totalAmount, Integer itemsCount, String membershipType) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.totalAmount = totalAmount;
		this.itemsCount = itemsCount;
		this.membershipType = membershipType;
	}
     
	public String getOrderId() {
		return orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public Integer getItemsCount() {
		return itemsCount;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void applydiscount()
	{
		if (membershipType.equalsIgnoreCase("PRIME")){
			Double primeDiscount= (totalAmount/100)*10;
		   if(itemsCount>5)
		   {
			   Double bulkDiscount= (totalAmount/100)*5;
			   Double  FinalAmount= totalAmount - (primeDiscount+bulkDiscount);
			   
				System.out.println("Order ID: "+orderId);
				System.out.println("Customer: "+customerName);
				System.out.println("Items Count: "+itemsCount);
				System.out.println("Membership: "+membershipType);
				System.out.println("Original Amount: "+totalAmount);
				System.out.println("Prime Discount "+primeDiscount);
				System.out.println("Bulk Item Discount "+bulkDiscount);
				System.out.println("Total Discount: ₹"+FinalAmount);
				System.out.println("Order processed successfully!");
		   }
		}
		else
		{
			System.out.println("You Have No Discount");
			System.out.println("Order ID: "+orderId);
			System.out.println("Customer: "+customerName);
			System.out.println("Items Count: "+itemsCount);
			System.out.println("Membership: "+membershipType);
			System.out.println("Original Amount: "+totalAmount);
			System.out.println("Prime Discount No");
			System.out.println("Bulk Item Discount No");
			System.out.println("Total Discount: No");
			System.out.println("Total Discount: No");
			System.out.println("Order processed successfully!");
			
			
			
			
			
			
			
			
			

		}
				
				

	}

}
