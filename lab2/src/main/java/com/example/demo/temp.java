package com.example.demo;

public class temp {
    private int temp;

	public temp(int temp) {
		super();
		this.temp = temp;
	}
    public void display()
    {
    if(this.temp< 10) {
    System.out.println("Wear a heavy jacket");
    }
    else if(this.temp< 10 && this.temp<20) {
        System.out.println("Wear a sweater");
        }
    else  {
        System.out.println("Wear light clothes");
        }
 
    }
}
