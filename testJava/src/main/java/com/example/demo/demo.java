package com.example.demo;

import java.io.File;
class PrintStream
{
	 public   void Show(String args)
	 {
		 System.out.println(args);
	 }
}

class system
{
	  
	 public static  PrintStream p=new PrintStream();
	
}
public class demo {
    public static void main(String[] args) {
		system.p.Show("Hello");
	}
}
