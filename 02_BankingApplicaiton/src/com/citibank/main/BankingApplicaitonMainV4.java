package com.citibank.main;

//import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Savings;

public class BankingApplicaitonMainV4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Account account = new Account();
		Savings savings;
		
		int accountNumber;
		String name;
		String isSalary;
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
		System.out.println("Enter issalary");
		isSalary = scanner.next();
			
		savings = new Savings(accountNumber, name, balance, false);
		
		System.out.println("Account opened Successfully");    
        System.out.println("Account Number ::" + savings.getAccountNumber());
        System.out.println("Name ::" + savings.getName()  );
        System.out.println("Balance ::" + savings.getBalance());
        
        System.out.println();
        do {
        
        ShowTransactionMenu(scanner, savings);
        System.out.println("Do you Want to continue?(Y/N)");
        continueChoice = scanner.next();
	} while(continueChoice.equals("Y"));
     System.out.println("Thank You!!");
}

	private static void ShowTransactionMenu(Scanner scanner, Savings savings) {
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
			if(savings.withdraw(amount)) 
				System.out.println("Withdraw Succesfull");
			else
			    System.out.println("Withdraw Failed");
		
			break;
		case 2:
			System.out.println("Enter the amount to Deposit");
			amount = scanner.nextDouble();
			if(savings.deposit(amount)) 
				System.out.println("Deposit Succesfull");
			else
			    System.out.println("Deposit Failed");
		
			break;

		case 3:
			System.out.println("Balance :: " + savings.getAccountNumber());
		
			break;
		case 4:
		System.exit(0);
		    break;
		    
		default:
			System.out.println("Invalid Choice");
			break;
	}

}}
