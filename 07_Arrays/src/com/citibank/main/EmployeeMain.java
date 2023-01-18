package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
//		Employee employee1 = new Employee(101, "A",1000);
//		Employee employee2 = new Employee(102, "B",2000);
//		Employee employee3 = new Employee(103, "C",3000);
//		Employee employee4 = new Employee(104, "D",4000);
//		Employee employee5 = new Employee(105, "E",5000);
//		
//		System.out.println(employee1);
//		System.out.println(employee2);	
//		System.out.println(employee3);
//		System.out.println(employee4);	
//		System.out.println(employee5);
		Employee [] allEmployees = new Employee[5];
		Scanner scanner = new Scanner(System.in);
		
		int employeeID;
		String name;
		double salary;
		
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println("Enter employeeID");
			employeeID = scanner.nextInt();
			System.out.println("Enter Name");
			name = scanner.next();
			System.out.println("Enter Salary");
			salary = scanner.nextInt();
			Employee employee = new Employee ( employeeID,name,salary);
			allEmployees[i]=employee;
			System.out.println();
		}
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
		}

	}


