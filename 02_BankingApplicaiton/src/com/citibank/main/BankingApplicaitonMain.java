package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApplicaitonMain {

	public static void main(String[] args) {
		System.out.println("main start");
		//object Creation
		Account account = new Account();
//		account.accountNumber = 101;
//		account.name = "Bharat Yadav";
//		account.balance = 1000;
		account.setAccountNumber(1001);
		System.out.println(account.getAccountNumber());
		//Function calling
		account.withdraw(100);;
		System.out.println("main end");
	}

}
