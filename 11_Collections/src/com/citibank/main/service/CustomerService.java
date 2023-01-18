package com.citibank.main.service;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.repository.CustomerRepository;

public class CustomerService implements CustomerServiceInterface {
	
	private CustomerRepository customerRepository = new CustomerRepository();

	@Override
	public boolean addNewCustomer(Customer customer) {
		return customerRepository.addNewCustomer(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		
		return customerRepository.getCustomerByCustomerId(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		return customerRepository.addNewCustomer(customer);
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		return customerRepository.deleteCustomerByCustomerId(customerId);
	}
}