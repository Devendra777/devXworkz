package com.xworkz.bankingapp;

public class TimeDepositAccount extends SavingsAccount{
	
	
	
	  public int elapsedPeriod;
	  public int maturityPeriod ; 
	  double interestPenaltyRate;
	  
	
	public TimeDepositAccount(double intialAmount, double interestRate) {
	  super(intialAmount, interestRate); // TODO Auto-generated constructor stub }
	  
	}
	
	
	public TimeDepositAccount(int maturityPeriod,double interestRate,
			double initialAmount, double interestPenaltyRate) {
		// TODO Auto-generated constructor stub
		super(initialAmount , interestRate) ; 
		this.elapsedPeriod = 0;
		  this.maturityPeriod = maturityPeriod;
		  this.interestPenaltyRate = interestPenaltyRate;
	}
	
	// add periodic interest , keeping the track of number of elapsedPeriod
	@Override
	public void addPeriodicInterest(){
		 this.elapsedPeriod++;
		 super.addPeriodicInterest();
		 
	 }
	 
	 //WithDraw , but charge the penalty for early withdrawal if neccessory
	// Note that the penalty is with whole balance  , not with  the amount withDrawn
	public void  withDraw(double amount){
		 if(elapsedPeriod < maturityPeriod) 
		super.withDraw( getBalance() * (interestPenaltyRate/100.00) * elapsedPeriod); 
	super.withDraw(amount);
		
	 }
	
	  

	/*
	 * public TimeDepositAccount(double interestRate) { super(interestRate); // TODO
	 * Auto-generated constructor stub }
	 */
	  
	  
	
	

	
}
