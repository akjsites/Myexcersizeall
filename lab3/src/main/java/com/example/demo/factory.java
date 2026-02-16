package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class factory {
   public String []Categories;
   public List<String> products; 
   public Map<String,String> CategoryProduct;
   public Set<String> addpro=new HashSet<>(); 
   public void setCategories(String[] categories) {
	Categories = categories;
   }
   public void setProducts(List<String> products) {
	this.products = products;
   }
   public void setCategoryProduct(Map<String, String> categoryProduct) {
	CategoryProduct = categoryProduct;
   }
   public void display()
   {
	   boolean has=false;
	  Iterator<String> iterator = products.iterator();
	  while(iterator.hasNext())
	  {
		  String next = iterator.next();
		  Set<Entry<String, String>> entrySet = CategoryProduct.entrySet();
		  Iterator<Entry<String, String>> iterator2 = entrySet.iterator();
		  while(iterator2.hasNext())
		  {
			  Entry<String, String> next2 = iterator2.next();
			  if(next2.getValue().equals(next))
			  {
				  has=true;
				  
			  }
			  else {
				  addpro.add(next);
			  }
		  }
	  }
	  if(has) {
		  System.out.println("Work SucessFully");
	  }
	  else
	  {
		  
		  System.out.println(addpro);
	  }
   }
   
}
 


