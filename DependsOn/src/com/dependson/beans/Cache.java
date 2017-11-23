package com.dependson.beans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This class is acts like data structure to store any kind of data insted of loading
 * reading the data again and again.This class is ment for storeing the data and acessing the data but not for
 * loaing the data by its own we should not make cache class to load the data by its own.there are problems.
 * if you provide the loading code inside constructor
 * if you change the data base column name then you have to modify this class
 * if you modify this class we have to perform the testing on the classes which are all refering to this class
 * and it seems to loading the data not to store and acessing the data
 * if you write the entire technologys dependent logic at one place.whenever you are changing this will be a problem for you 
 */
public class Cache {
private static Cache instance;

/**
 * this Map object is used for storeing the Data inside it.it is concurrent hash map not normal hashmap
 * bcz in this case only one lock will be available.but in case of ConcurrentHashMap for one entry one lock will be there
 */
private Map<String,Object> dataMap;

/**
 * This constructor used to intilize the datamap
 */
private Cache() {
	dataMap = new ConcurrentHashMap<String,Object>();
}

/**
 *This is static factory method used for creating only one object to the class
 */
public static synchronized Cache getInstance() {
	if(instance == null) {
		instance = new Cache();
	}
	return instance;
}

/**
 *This method is used to put the data into the DataHashMap object
 */
public void put(String key,Object value) {
	dataMap.put(key, value);
}

/**
 *This method is used to Get the object from DataMap
 */
public Object get(String key) {
	return dataMap.get(key);
}

/**
 *This method is used to verify weather the data present in dataMap Object or not
 */
public boolean containsKey(String key) {
	return dataMap.containsKey(key);
}

/**
 *This method is used to put the entire Map object in it bcz if you trying to put 
 *all the Acessor objects one by one it has to aquired the object multiple times so that performence will be degraded
 *so better to put all the Map objects at one shot 
 */
public void putAll(Map map) {
	dataMap.putAll(map);
	System.out.println("Concurrent HashMap from Cache is "+dataMap);
}
}
