package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer = new Customer(101,"A","Mumbai");
		Customer customer1 = new Customer(102,"B","Jaipur");
		Customer customer2 = new Customer(103,"C","Delhi");
		Customer customer3 = new Customer(104,"D","Bikaner");
		Customer customer4 = new Customer(105,"E","Pune");
		
		List<Customer> customerList = new ArrayList<>();
		
		customerList.add(customer4);
		customerList.add(customer3);
		customerList.add(customer2);
		customerList.add(customer1);
		customerList.add(customer);
		
		printAllCustomers(customerList);
		
		Scanner scanner = new Scanner(System.in);
//		int CustomerId;
//		System.out.println("Enter Customer ::");
//		CustomerId = scanner.nextInt();
//		
//		printCustomerByCustomerId(customerList, CustomerId);
		
		int CustomerId;
		String name,Address;
		System.out.println("Enter Customer ::");
		CustomerId = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter New Name");
		name = scanner.nextLine();
		
		System.out.println("Enter New Address");
		Address = scanner.nextLine();
		
		Customer updateCustomer = new Customer(CustomerId ,name , Address);
		updateCustomerByCustomerId(customerList, updateCustomer);
		
		printAllCustomers(customerList);
	}
		
		private static void updateCustomerByCustomerId(List<Customer> customerList, Customer customer) {
			boolean flag = false;
			for(Customer c : customerList) {
				if(c.getCustomerId() == customer.getCustomerId()) {
					c.setName(customer.getName());
					c.setAddress(customer.getAddress());
					
					
				}
			}
		
		
	
	
//	private static void	printCustomerByCustomerId(List<Customer> customerList, int CustomerID) {
			boolean flag = false;
			for (Customer customer : customerList) {
				if(customer.getCustomerId() == CustomerID) {
					System.out.println(customer);
					flag = true;
					break;
//				}
//			}
//			if(flag == false) {
//				System.out.println("No Customer found for given CustomerID");
//			
//			}
	}
	private static void printAllCustomers(List<Customer> customerList) {
		System.out.println("All Customers");
//		for (Customer customer : customerList) {
//			System.out.println(customer);
			
		}
	}
}
