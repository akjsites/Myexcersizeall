package com.example.task2;

import org.springframework.stereotype.Component;

@Component
public class Loan {

	String applicantId;

	String name;

	Integer creditScore;

	Double annualIncome;

	Double requestedLoanAmount;

	Integer loanTenureYears;


	public Loan() {}
	
     
	public Loan(String applicantId, String name, Integer creditScore, Double annualIncome, Double requestedLoanAmount,
			Integer loanTenureYears) {
		super();
		this.applicantId = applicantId;
		this.name = name;
		this.creditScore = creditScore;
		this.annualIncome = annualIncome;
		this.requestedLoanAmount = requestedLoanAmount;
		this.loanTenureYears = loanTenureYears;
	}


	
	public String getApplicantId() {
		return applicantId;
	}


	public String getName() {
		return name;
	}


	public Integer getCreditScore() {
		return creditScore;
	}


	public Double getAnnualIncome() {
		return annualIncome;
	}


	public Double getRequestedLoanAmount() {
		return requestedLoanAmount;
	}


	public Integer getLoanTenureYears() {
		return loanTenureYears;
	}


	public String applydiscount()
	{   String message=null;
		if(this.creditScore<650)
			
		{
			message= "You Are Not EliGible";
		}
		else
		{
			message=""+(requestedLoanAmount * 3 * ((1+3)^loanTenureYears)) / ((1+3)*loanTenureYears - 1);
		}
		return message;

	}

}
