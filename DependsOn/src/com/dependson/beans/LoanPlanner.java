package com.dependson.beans;

import java.util.Properties;


/**
 *This class is the main class means request will come to here for calculating the intrest rate
 */
public class LoanPlanner {
	
	/**
	 * This cache attribute is used to acess concurrent hashmap as part of loading 
	 * the data into ConcurrentHashMap 
	 */
private Cache cache;
Properties props;

/**
 *This method is used for calculating the loan with intrest
 *in this we are checking the data weather it is available or not if not throwing exception 
 *or else reading the data.
 *but we should not load the data if data is not available into concurrent hashmap bcz 
 *too many classes we required the data so the duplication of the code will be
 *if we change the name of the file or location of the file
 *if we change the source from properties to jdbc
 *and it seems like we are writing the loading logic with source logic but it is not good
 */

/**
 * @param principleAmount
 * @param tenure
 * @param place
 * @throws Exception
 */
public void calculate(double principleAmount,int tenure,String place) throws Exception {
	if(!(cache.containsKey("intrestRate"))) {
		throw new Exception("Place not found Exception");
	}
	else if(!(cache.containsKey("cityNames"))){
		throw new Exception("City Not Found Exception");
	}
	
	props =(Properties)cache.get("intrestRate");
	Double it_rate = Double.parseDouble(props.getProperty(place));
	System.out.println("Intrest Rate is  "+(principleAmount*tenure*it_rate)/100);
	
	props = (Properties)cache.get("cityNames");
	String cityName = props.getProperty("5");
	System.out.println("CityName foe the give key is  "+cityName);
	
}
public Cache getCache() {
	return cache;
}
public void setCache(Cache cache) {
	this.cache = cache;
}
}
