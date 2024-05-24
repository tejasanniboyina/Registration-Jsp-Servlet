package com.teja.registration.self.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.teja.registration.self.model.EmployeeSelf;

public class EmployeeDaoSelf {
	
	public int registerEmployeeDetails(EmployeeSelf employee) throws ClassNotFoundException {
		
		String url = "jdbc:mysql://localhost/phpmyadmin/employees";
		String uname = "root";
		String pword = "";
		String updateQuery = "INSERT INTO employee" +"(id,firstName,secondName,username,password,address,contact) VALUES"+"(?,?,?,?,?,?,?);";
		int rowsUpdated = 0;
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection connection = DriverManager.getConnection(url, uname, pword);
				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)){
			preparedStatement.setInt(1,1);
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getSecondName());
			preparedStatement.setString(4, employee.getUsername());
			preparedStatement.setString(5, employee.getPassword());
			preparedStatement.setString(6, employee.getAddress());
			preparedStatement.setString(7, employee.getContact());
			
			 rowsUpdated = preparedStatement.executeUpdate();
				
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return rowsUpdated;
	}
	}
	
