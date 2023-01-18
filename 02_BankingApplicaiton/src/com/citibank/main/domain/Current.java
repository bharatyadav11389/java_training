package com.citibank.main.domain;

public abstract class Current extends Account {
    private double overdraftLimit;
   
  
    public Current() {
    	
    }
	public Current(int accountNumber, String name, double balance,double overdraftLimit) {
		super(accountNumber, name, balance);
		// TODO Auto-generated constructor stub
	}

	public Current(double overdraftLimit) {
		super();
		this.overdraftLimit = overdraftLimit;
	}
   public void setOverdraftLimit(double overdraftLimit) {
	   this.overdraftLimit = overdraftLimit;
   }
   public boolean withdraw(double amount) {
	   if(amount > 0 ) { 
	   }
		   if (amount <= getBalance()) {
			   setBalance(getBalance() - amount);
			   return true;
		   }
		   if ( amount > getBalance() && amount < getBalance()+ overdraftLimit )
			   amount = amount - getBalance();
			   setBalance(0);
			   overdraftLimit = overdraftLimit - amount;
			   return true;
   
	 
   }
   public boolean deposit(double amount) {
	 return false;
 }
public String getOverdraftLimit() {
	// TODO Auto-generated method stub
	return null;
}
	
}
