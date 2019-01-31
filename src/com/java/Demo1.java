package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*jdbc:mysql://<host>:<port>/<database_name>
*/public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	/*	Driver driver= new com.mysql.jdbc.Driver();*/
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://mysql.c2e2sfgq1rjp.ap-south-1.rds.amazonaws.com:3306/mysql123", "mysql123", "mysql12345");
		Statement statement=connection.createStatement();){
			System.out.println("connection obtained");
		statement.execute("create table Employee (id INTEGER primary key, name varchar(200)");
		
		}
	}
}
//Driver: used to connect to database
//try with resource block