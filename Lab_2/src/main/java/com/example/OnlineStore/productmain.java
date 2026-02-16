package com.example.OnlineStore;

public class productmain {
     onlinestore on=new onlinestore();
	public productmain(String productId,String name,String brand)
	{
		on.productId=productId;
		on.name=name;
		on.brand=brand;
	}
	public void dispplay()
	{
		on.dispaly();
	}
}
