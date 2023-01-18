package com.citibank.main;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerMainv2 {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		
		Customer customer1 = new Customer(101,"A","Mumbai");
		Customer customer2 = new Customer(102,"B","Jaipur");
		Customer customer3 = new Customer(103,"C","Delhi");
		Customer customer4 = new Customer(104,"D","Bikaner");
		Customer customer5 = new Customer(105,"E","Pune");
		
		System.out.println("Addint First Customer ::" + customerService.addNewCustomer(customer1));
		System.out.println("Addint Second Customer ::" + customerService.addNewCustomer(customer2));
		System.out.println("Addint Third Customer ::" + customerService.addNewCustomer(customer3));
		System.out.println("Addint Fourth Customer ::" + customerService.addNewCustomer(customer4));
		System.out.println("Addint Fifth Customer ::" + customerService.addNewCustomer(customer5));
		System.out.println("-------------------------------------");
		System.out.println("Reading All Customers from Database");
		List<Customer> customerList = customerService.getAllCustomers();
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Read One customer from database");
		Customer customer = customerService.getCustomerByCustomerId(101);
		System.out.println(customer);
		
		System.out.println("-------------------------------------");
		System.out.println("Update Customer Details");
		Customer customerUpdated = new Customer(101,"A", "Chennai");
		boolean result = customerService.updateCustomerByCustomerId(customerUpdated);
		if(result)
			System.out.println("updated Successfully");
		else
			System.out.println("No Customer Found");
		
		}
		
		
	}
	


