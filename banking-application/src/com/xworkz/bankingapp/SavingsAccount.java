package com.xworkz.bankingapp;

public class SavingsAccount extends BankAccount{
	
	
	public    double interestRate ; 
	
	 public SavingsAccount(double interestRate) {
		
		this.interestRate  = interestRate;
	}
	 
	 
	 public SavingsAccount(double intialAmount , double interestRate ) {
			super(intialAmount) ;
			this.interestRate = interestRate;
			
	}
	 
	public void  addPeriodicInterest() {
		double amount =    getBalance() * interestRate/100.00;
		deposit(amount);
	}
	 
	 
		 
	

}
