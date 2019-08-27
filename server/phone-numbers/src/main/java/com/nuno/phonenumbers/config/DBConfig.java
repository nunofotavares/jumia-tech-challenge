package com.nuno.phonenumbers.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nuno.phonenumbers.model.Customer;

public class DBConfig {
	private static List<Customer> customers = new ArrayList<Customer>();
	
	public static List<Customer> dbConnect() {
		
		Connection connection = null;
		
	    try{
	      // create a database connection
	      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
	      Statement statement = connection.createStatement();
	      statement.setQueryTimeout(30);  // set timeout to 30 seconds

	      ResultSet rs = statement.executeQuery("select * from customer");
	      while(rs.next())
	      {
	    	Customer newCustomer = new Customer(rs.getLong("id"),rs.getString("name"),rs.getString("phone"));
	        // read the result set
	        addCustomer(newCustomer);
	      }
	    }
	    catch(SQLException e)
	    {
	      // if the error message is "out of memory",
	      // it probably means no database file is found
	      System.err.println(e.getMessage());
	    }
	    finally
	    {
	      try
	      {
	        if(connection != null)
	          connection.close();
	      }
	      catch(SQLException e)
	      {
	        // connection close failed.
	        System.err.println(e.getMessage());
	      }
	    }
	    return getCustomers();
	}
	
	public static void addCustomer(Customer c) {
		customers.add(c);
	}
	
	public static List<Customer> getCustomers() {
		List<Customer> newList = new ArrayList<Customer>(customers);
		return newList;
	}
	
}
