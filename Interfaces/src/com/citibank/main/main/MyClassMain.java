package com.citibank.main.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.Myinterface;
import com.citibank.main.domain.YourClass;
import com.citibank.main.factory.MyFactory;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("main start");
		
		MyClass myclass = new MyClass();
		myclass.show();
		
		System.out.println("------------");
		Myinterface myinterface = null;
		myinterface.show();
		System.out.println("------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. MyClass Object");
		System.out.println("1. YourClass Object");
		System.out.println("Enter your Choice");
		int choice = scanner.nextInt();
		
		myinterface = MyFactory.getobject(choice);
		
		if (myinterface !=null)
			myinterface.show();
		else 
			System.out.println("Invalid Choice");
		
		System.out.println("main end");
	}

}
