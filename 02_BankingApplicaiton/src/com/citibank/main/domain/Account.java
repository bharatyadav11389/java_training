package com.citibank.main.domain;

public abstract class Account {
	
	private int accountNumber;
	private String name;
	private double balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public Account() {
		System.out.println("Default Constructor of my class");
		
	}
	public Account(int accountNumber, String name, double balance) {
		System.out.println("3 Param Consturctor of Account");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean withdraw(double amount) {
		System.out.println("withdraw() called");
		if(amount > 0 && amount <= balance) {
				balance = balance - amount;
				return true;
		}
		return false;
	}
	public boolean deposit(double amount) {
		System.out.println("desposit called");
		if(amount > 0 ) {
			balance = balance + amount;
			return true;
		}
		return false;
	}
}
