package com.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public class JDBCConnectionProvider {
	public static Connection connection=null;
    public static Connection getConnection() {
    	System.out.println("getConnection method called");
    	 
    	 if(connection == null) {
    		 System.out.println("inside if block checking null");
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    	}
    	return connection;
    }
}
