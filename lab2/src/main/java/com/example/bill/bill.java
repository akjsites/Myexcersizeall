package com.example.bill;

public class bill {
    private double bill;

	public bill(double bill) {
		super();
		this.bill = bill;
	}
    public double display()
    {
    	double total=0.0;
      if(this.bill<100)
      {
    	    total= this.bill*1.5;
      }
      else  if(this.bill>100 && this.bill<=300)
      {
    	  total= ((this.bill-100)*2.5)+(this.bill-(this.bill-100))*1.5;

      }
      else  if(this.bill>300)
      {
    	  total= (this.bill-300)*4+(this.bill-(this.bill-300)-100)*2.5+(this.bill-(this.bill-300)-200)*1.5;
      }
	  return total;
        
    }
}
