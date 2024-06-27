package com.demo.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	String insert="insert into"
			+ " tblEmployee values(102,'Joe','hyd',4848)";
	String url="jdbc:mysql://localhost:3306/j55";
	String userString="root";
	String password="1234";

	void dbOperation() throws SQLException
	{
		Connection con=DriverManager .getConnection(url,userString,password);
		Statement statement=con.createStatement();
		statement.executeUpdate(insert);
		System.out.println("Data inserted ");



	}
}
