package com.xworkz.bankingapp;

public class CurrentAccount  extends BankAccount {
	
	public int transactionCount ; 
	public final int FREE_TRASANCTIONS = 6; 
	public double trasanctionFee = 0.5 ; 	
	
	
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CurrentAccount(double initialAmount) {
		
	}
	
	
	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		transactionCount++;
	}
	
	@Override
	public void withDraw(double amount) {
		super.withDraw(amount);
		transactionCount++;
	}
	
	
	
	public void deductFees() {
		if(transactionCount > FREE_TRASANCTIONS) {
			   double fee = trasanctionFee * (  transactionCount - FREE_TRASANCTIONS);
			   super.withDraw(fee);
		}
	}

}
