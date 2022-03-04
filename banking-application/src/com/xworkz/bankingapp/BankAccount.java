package com.xworkz.bankingapp;

public class BankAccount {
	
	
	public double balance ;
	
	// zero balance account
	public BankAccount() {
		balance  = 0.00;
	}
	
	// initial balance account
	public BankAccount(double initialBalance) {
		balance  = initialBalance;
	}
	
	

	public  void withDraw(double amount) {
	
	balance = balance - amount ; 
	}
	
	
	// deposit the amount 
	public void deposit(double amount) {
		
		balance += amount;
		
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	
	public void transfer(BankAccount other , double amount) {
		withDraw(amount);
		other.deposit(amount);
	}

}
