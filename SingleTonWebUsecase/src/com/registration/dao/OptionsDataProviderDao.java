package com.registration.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OptionsDataProviderDao {
	
		/**
		 *This method is used to fetch all the citys information for select controllers in Registration.jsp 
		 *
		 */
public static List<String> getCityList() throws SQLException{
	System.out.println("getCityList Method Called");
	List<String> cities = new ArrayList<String>();
	Connection connection=JDBCConnectionProvider.getConnection();
	Statement statement = connection.createStatement();
	ResultSet resultset = statement.executeQuery("select name from CITY_NAMES");
	while(resultset.next()) {
		cities.add(resultset.getString("name"));
	}
	return cities;
}

/**
 *This method is used to fetch the all the state information for select controllers in Registration.jsp
 *
 */
public static List<String> getStateList() throws SQLException{
	System.out.println("getStateList Method Called");
	List<String> state = new ArrayList<String>();
	Connection connection=JDBCConnectionProvider.getConnection();
	Statement statement = connection.createStatement();
	ResultSet resultset = statement.executeQuery("select name from STATE_NAMES");
	while(resultset.next()) {
		state.add(resultset.getString("name"));
	}
	return state;
}


/**
 *This method is used to fetch the all the Countrys information for select controllers in Registration.jsp
 *
 */
public static List<String> getCountryList() throws SQLException{
	System.out.println("getCountryList Method Called");
	List<String> country = new ArrayList<String>();
	Connection connection=JDBCConnectionProvider.getConnection();
	Statement statement = connection.createStatement();
	ResultSet resultset = statement.executeQuery("select name from COUNTRY_NAMES");
	while(resultset.next()) {
		country.add(resultset.getString("name"));
	}
	return country;
}

}
