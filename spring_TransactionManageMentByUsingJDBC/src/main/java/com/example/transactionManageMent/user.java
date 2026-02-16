package com.example.transactionManageMent;

public class user {
	String accountNumber;

	String customerName;

	String accountType;

	float Balance;
	
	public user()
	{}
	
	 
	


	 public String getAccountNumber() {
		 return accountNumber;
	 }


	 public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	 public void setCustomerName(String customerName) {
		 this.customerName = customerName;
	 }


	 public void setAccountType(String accountType) {
		 this.accountType = accountType;
	 }


	 public void setBalance(float balance) {
		 Balance = balance;
	 }


	 public String getCustomerName() {
		 return customerName;
	 }


	 public String getAccountType() {
		 return accountType;
	 }


	 public float getBalance() {
		 return Balance;
	 }





	 @Override
	 public String toString() {
		return "user [accountNumber=" + accountNumber + ", customerName=" + customerName + ", accountType="
				+ accountType + ", Balance=" + Balance + "]";
	 }
	 
     
     
}
