package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	private double num1;
	private double num2;
	private double result;
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		try {
	 System.out.println("Enter the first number");
	 num1 = scanner.nextInt();
	 System.out.println("Enter the Second number");
	 num2 = scanner.nextInt();
//		}
//		catch(InputMismatchException e) {
//			System.out.println("invalid input from user");
//			System.out.println("program will continuew its execution");
//			System.out.println(e.getMessage());
//		}
//		catch (Exception e) {
//			System.out.println("Exception in code");
//			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("thank you");
			scanner.close();
		}
	}
	public void calulate() {
		System.out.println("calculating result");
	  result = num1/num2;
	}
	public void display() {
		System.out.println("Result is ::" + result);
	}
}
