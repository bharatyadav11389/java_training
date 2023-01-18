package com.citibank.main.repository;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerRepositoryInterface {
	
	public boolean addNewCustomer(Customer customer);
	{
		connection = new ConnectionFactory().getconnection();
		sql = "insert into the customer_details(name.address) value(?,?)";
		try {
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setstring(1, customer.getname());
		preparedStatement.setstring(2, customer.getname());
		
	}
	public Customer getCustomerByCustomerId(int customerId);
	public List<Customer> getAllCustomers();
	public boolean updateCustomerByCustomerId(Customer customer);
	public boolean deleteCustomerByCustomerId(int customerId);
	List<Customer> getCustomer();
	
	
	
}
