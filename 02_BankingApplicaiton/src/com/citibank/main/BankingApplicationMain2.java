package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMain2 {

	public static void main(String[] args) {
		
		
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);
	
        System.out.println("your account is openend Successfully");
       
        System.out.println("Account Number ::" + account.getAccountNumber());
        System.out.println("Name ::" + account.getName()  );
        System.out.println("Balance ::" + account.getBalance());
	}
	

}
