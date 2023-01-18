package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Account account = new Account();
		Account account;
		
		int accountNumber;
		String name;
		String continueChoice;
		double balance;
		double amount;
		int choice;
		
		System.out.println("Enter accountNumber");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		
		account = new Account(accountNumber,name,balance);
//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);
		
		System.out.println("Account opened Successfully");    
        System.out.println("Account Number ::" + account.getAccountNumber());
        System.out.println("Name ::" + account.getName()  );
        System.out.println("Balance ::" + account.getBalance());
        
        System.out.println();
        do {
        
        ShowTransactionMenu(scanner, account);
        System.out.println("Do you Want to continue?(Y/N)");
        continueChoice = scanner.next();
	} while(continueChoice.equals("Y"));
     System.out.println("Thank You!!");
}

	private static void ShowTransactionMenu(Scanner scanner, Account account) {
		double amount;
		int choice;
		System.out.println("Transaction Menu");
        System.out.println("Press 1. For Withdraw");
        System.out.println("Press 2. For Deposit");
        System.out.println("Press 3. For Check Balance");
        System.out.println("Press 4. For Exit");
        System.out.println("Enter your Choice");
        
       
		choice = scanner.nextInt();
		
        switch (choice) {
		case 1:
			System.out.println("Enter the amount to Withdraw");
			amount = scanner.nextDouble();
			if(account.withdraw(amount)) 
				System.out.println("Withdraw Succesfull");
			else
			    System.out.println("Withdraw Failed");
		
			break;
		case 2:
			System.out.println("Enter the amount to Deposit");
			amount = scanner.nextDouble();
			if(account.deposit(amount)) 
				System.out.println("Deposit Succesfull");
			else
			    System.out.println("Deposit Failed");
		
			break;

		case 3:
			System.out.println("Balance :: " + account.getAccountNumber());
		
			break;
		case 4:
		System.exit(0);
		    break;
		    
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}
