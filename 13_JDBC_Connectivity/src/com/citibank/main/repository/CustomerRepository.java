package com.citibank.main.repository;

 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;

 

public class CustomerRepository implements CustomerRepositoryInterface {
    private List<Customer> customerList = new ArrayList<>();

    private String sql;
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private int rowCount;

 

    @Override
    public boolean addNewCustomer(Customer customer) {
        connection = new ConnectionFactory().getConnection();
        sql = "insert into customer_details(name,address) value(?,?)";
        try {
        	preparedStatement = connection.prepareStatement(sql);
        	preparedStatement.setString(1, customer.getName());
        	preparedStatement.setString(2, customer.getAddress());
        	
        	rowCount = preparedStatement.executeUpdate();
        	if(rowCount > 0)
        		return true;
        }
        catch (SQLException e) {
        	System.out.println("Exception while Executing query");
        	System.out.println(e.getMessage());
        	return false;
        }
        
        finally {
        	try {
        		connection.close();
        	}
        	catch(SQLException e) {
        		e.printStackTrace();
        	}
        	}
        }

 

    @Override
    public Customer getCustomerByCustomerId(int customerId) {
        connection = new ConnectionFactory().getConnection();
        sql="select * from customer_details where customer_id = ?";
        try {
            preparedStatement =connection.prepareStatement(sql);
            preparedStatement.setInt(1,customerId);
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next()) {
                customerId = resultSet.getInt("customer_id");
                String name =resultSet.getString("name");
                String Address =resultSet.getString("Address");

                Customer customer =new Customer(customerId,name,Address);
                return customer;
//                customerList.add(customer);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Exception in Query");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println("Error while closing Connection");
                e.printStackTrace();
            }
        }
//        System.out.println(customerList);
        return null;
    }

 

    @Override
    public List<Customer> getCustomer() {


            return customerList;
    }

 

    @Override
    public boolean updateCustomerByCustomerId(Customer customer) {

 

        for (Customer c : customerList) {
            if (c.getCustomerId() == customer.getCustomerId()) {
                c.setCustomerName(customer.getCustomerId());
                c.setAddress(customer.getAddress());
                System.out.println("customer details are updated successfully");
                return true;

 

            }
        }

 

        System.out.println("No Customer found for this id");
        return false;

 

    }

 

 

    @Override
    public boolean deleteCustomerByCustomerId(int customerId) {
        for (Customer customer : customerList) {
            if (customer.getCustomerId() == customerId) {
                customerList.remove(customer);
                System.out.println("Delete successful");
                return true;
            }
        }
        return false;
    }



	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

 

}