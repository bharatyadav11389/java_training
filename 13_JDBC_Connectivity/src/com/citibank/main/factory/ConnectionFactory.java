package com.citibank.main.factory;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;

public class ConnectionFactory {
	
	private List<Customer> customerList = new ArrayList<>();
	private String driverName = "com.mysql.cj.jdbc.Driver";
    private String URL = "jdbc:mysql://localhost:3306/citibankdb";
	private String userId = "root";
	private String password = "root";
	private Connection connection;

	public Connection getConnection() {
		try {
			Class.forName(driverName);
			connection = DriverManager
		}
		
	}
}
