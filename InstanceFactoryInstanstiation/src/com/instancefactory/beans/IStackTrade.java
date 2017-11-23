package com.instancefactory.beans;

public interface IStackTrade {

	/**
	 * This is Interface will be provided by BSEExchange people to ICICIDirect people
	 * They will not share class files.this is also called remote interface sharability
	 * on this they are going to call those controlled methods
	 *
	 */
double getStackPrice(String stackName);
}
