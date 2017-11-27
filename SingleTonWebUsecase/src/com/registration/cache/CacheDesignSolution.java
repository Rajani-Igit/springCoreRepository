package com.registration.cache;

import java.util.HashMap;
import java.util.Map;



public class CacheDesignSolution {
	private static CacheDesignSolution instance;
	//In this object any one can insert any kind of data this has to be instantiated only once
	private Map<String, Object> dataMap= null;
	
	
	/**
	 *This constructor will be called only once so Map object will be created only once
	 *
	 */
	private CacheDesignSolution() {
		System.out.println("inside private constructor");
		dataMap = new HashMap<String,Object>();
	}
	
	
	/**
	 * This method will instantiate the Same class Object this is static factory method
	 *
	 */
	public static synchronized CacheDesignSolution getInstance() {
		System.out.println("inside getInstance of cache method");
		if(instance == null) {
			System.out.println("inside if block checking Cache object is not there");
			instance = new CacheDesignSolution();
		}
		return instance;
	}
	
	/**
	 *This method will provide abstraction over Map specific method put and provide encapsulation
	 *
	 */
	
    public synchronized void put(String key,Object value) {
    	System.out.println("inside put method");
	    dataMap.put(key, value);
    }
    

	/**
	 *This method will provide abstraction over Map specific method get  and provide encapsulation
	 *
	 */
	
    public synchronized Object get(String key) {
    	System.out.println("inside get method");
	    return dataMap.get(key);
    }
    

	/**
	 *This method will provide abstraction over Map specific method i.e containsKey and provide encapsulation
	 *
	 */
	
    public synchronized boolean containsKey(String key) {
    	System.out.println("inside contains method");
    	System.out.println("HashMap contains data   "+dataMap);
	    return dataMap.containsKey(key);
    }
}
