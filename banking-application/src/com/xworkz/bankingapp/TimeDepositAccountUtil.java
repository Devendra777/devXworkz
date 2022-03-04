package com.xworkz.bankingapp;

public class TimeDepositAccountUtil {
	
	
	public static void main(String[] args) {
		
		
		
		SavingsAccount savingsAccount  = new SavingsAccount(0.5);
		  TimeDepositAccount timeDeposit= new TimeDepositAccount(5,7,10000.00,0.5);
		  
		  System.out.println("Balance before deposit " + timeDeposit.getBalance());
		  savingsAccount.transfer(timeDeposit, 5000);
		  System.out.println("Balance after the transfer in the BankAccount " +
		  savingsAccount.getBalance()); System.out.println("Balance after trasnfer " +
		  timeDeposit.getBalance());
		  
		  
		  timeDeposit.addPeriodicInterest(); timeDeposit.withDraw(10000);
		  System.out.println("Balance after adding periodic interest " +
		  timeDeposit.getBalance());
		  
		  
		  CurrentAccount currentAccount = new CurrentAccount();
		  currentAccount.deposit(20000.00); currentAccount.withDaw(1000.00);
		  currentAccount.deposit(600.00); currentAccount.deposit(600.00);
		  currentAccount.deposit(12345.00); currentAccount.deposit(11000.00);
		  currentAccount.deposit(12000.00);
		  
		  
		  
		  BankAccount account = new TimeDepositAccount(1000.00,0.9);
		 
		  
		TimeDepositAccount depositAccount = (TimeDepositAccount ) account ; 
		depositAccount.addPeriodicInterest();
		 
	   
	}

}
