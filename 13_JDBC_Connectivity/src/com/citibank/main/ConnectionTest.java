package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.PreparedQuery;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import com.mysql.cj.xdevapi.PreparableStatement;

public class ConnectionTest {

	public static void main(String[] args) {
		System.out.println("Main start");
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver loaded Successfully");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb","root","root");
			
			System.out.println("Connection Successfull");
			String Sql = "insert into cutomer_details(name,address) values(?,?)";
			PreparedStatement preparadStatement = connection.prepareStatement(Sql);
//			preparadStatement.setString(1,"Bharat Yadav");
//			preparadStatement.setString(2,"Pune");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter second name");
			String name = scanner.next();
			System.out.println("Enter second address");
			String address = scanner.next();
			preparadStatement.setString(1,name);
			preparadStatement.setString(2,address);
						
			int rowCount = preparadStatement.executeUpdate();
			if(rowCount > 0) {
				System.out.println("Record inserted Successfully");
			    System.out.println(rowCount);
		}
			    else
			    {
			    	System.out.println("No rows inserted");
			    }
		
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Driver not Found");System.out.println(e.getMessage());
		}
		finally {
			try {
			connection.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main End");
	}

}}
