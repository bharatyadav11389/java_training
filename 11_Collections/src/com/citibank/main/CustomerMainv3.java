package com.citibank.main;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.citibank.main.domain.Customer;
public class CustomerMainv3 {

	public static void main(String[] args) {
		Set<Customer> customerSet = new HashSet<>();
		Customer customer1 = new Customer(101,"A","Mumbai");
		Customer customer2 = new Customer(102,"B","Jaipur");
		Customer customer3 = new Customer(103,"C","Delhi");
		Customer customer4 = new Customer(104,"D","Bikaner");
		Customer customer5 = new Customer(105,"E","Pune");
		Customer customer6 = new Customer(105,"T","Pune");
		
		System.out.println("First Customer::" + customer1.hashCode());
		System.out.println("Adding First Customer ::" + customerSet.add(customer1));
//		System.out.println("Adding Second Customer ::" + customerSet.add(customer2));
//		System.out.println("Adding Third Customer ::" + customerSet.add(customer3));
//		System.out.println("Adding Fourth Customer ::" + customerSet.add(customer4));
		System.out.println("Fifth Customer::" + customer5.hashCode());
//		System.out.println("sixth Customer::" + customer6.hashCode());
		System.out.println("Adding Fifth Customer ::" + customerSet.add(customer5));
		System.out.println("sixth Customer::" + customer6.hashCode());
		System.out.println("Adding sixth Customer ::" + customerSet.add(customer6));
		System.out.println("-------------------------------------");
		System.out.println("Reading All Customers from Database");
		System.out.println(customerSet);
		}
	}

		
		

	


