package com.dependson.util;


/**
 * This interface is used to provides a methods which are common for Every AcessorImplemented class
 */
public interface IAcessor {
	
	/**
	 * This method is used to provide the key for particular acesssor 
	 */
   String geyKey();
   /**
    * This method is used to provide Data that is retrived form specific resource(i.e Property File or JDBC or XML file or RMI)
    */
   Object getData();
   
}
