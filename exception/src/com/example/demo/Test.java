package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) throws SQLException {
		String user="root";
		String pass="1234";
		String url="jdbc:mysql://localhost:3306/dd";
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,user,pass);
			System.out.println("Hello Connection done ");	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Sql Exception");
		}

		finally {
			connection.close();
			System.out.println("Connection close");
		}
	}
}
