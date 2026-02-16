package com.example.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class ServiceLoan {
    @Autowired
	Loan loan;
    String applydiscount=null;
    public void validamount()
    {
    	     loan=new Loan("133", "Aswini", 12000, 12000.00, 30000.00, 100);
    	     if(loan.getCreditScore()<0)
    	     {
    	    	     System.exit(0);
    	     }
    	     
    }
    public void printdispaly()
    {
    	    applydiscount = loan.applydiscount(); 
    }
    public void print()
    {
    	   System.out.println("Applicant ID: "+loan.getApplicantId()+"\r\n"
    	   		+ "Name: Neha "+loan.getRequestedLoanAmount()+"\r\n"
    	   		+ "Credit Score: "+loan.getRequestedLoanAmount()+"\r\n"
    	   		+ "Annual Income: ₹"+loan.getRequestedLoanAmount()+"\r\n"
    	   		+ "Requested Loan: ₹"+loan.getRequestedLoanAmount()+"\r\n"
    	   		+ "Emi: ₹"+applydiscount+"\r\n"
    	   		+ "Tenure: 5 years\r\n"
    	   		+ "");
    }
    
}
