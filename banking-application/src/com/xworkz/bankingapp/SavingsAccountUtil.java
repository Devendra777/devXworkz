package com.xworkz.bankingapp;

public class SavingsAccountUtil {

	public static void main(String[] args) {
    // upcasting
		BankAccount savingsAccount = new SavingsAccount(0.5);
		
		//downcasting
		CurrentAccount account =   (CurrentAccount )savingsAccount;
		account.deductFees();
		
		System.out.println("Balance before deposit " + savingsAccount.getBalance());
		savingsAccount.deposit(20000);
		System.out.println("Balance after the deposit " + savingsAccount.getBalance());

		savingsAccount.withDraw(500);
		System.out.println("Balance after the withdrawal " + savingsAccount.getBalance());

		endofMonth((SavingsAccount) savingsAccount);
		System.out.println("Balance at the  endOfMonth " + savingsAccount.getBalance());
		
		
		// upcasting
		BankAccount currentAcount = new CurrentAccount();
		
		
	   
		
		//  downcasting to CurrentAccount
		 endofMonth((CurrentAccount)currentAcount);

	}

	// task
	public static void endofMonth(SavingsAccount savingsAccount) {
		savingsAccount.addPeriodicInterest();
	}

	
	public static void endofMonth(CurrentAccount currentAccount) {
		currentAccount.deductFees();
	}
	 
}
