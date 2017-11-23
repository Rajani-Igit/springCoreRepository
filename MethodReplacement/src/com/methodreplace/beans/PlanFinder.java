package com.methodreplace.beans;

public class PlanFinder {
	public PlanFinder(int len) {
		System.out.println("length is "+len);
		System.out.println("PlanFinder constructor called");
	}
	/**
	 *This is the over loaded method if you dont provide arg-type tags inside
	 *configuration file this class methods will be called insted of Poxy-Class method
	 *Proxys are nothing but Runtime BYte code genrators
	 *That class will create at runtime by extending This PlanFinder class
	 *and it will call Method Replacer implemented class from proxy class
	 *This all will taken care by IOC Container 
	 */	
public String[] findPlan(int age,String gender,int networkType,String coverageType,int copay) {
	System.out.println("5-Arg Over loaded method");
	System.out.println("inside PlanFinder class method");
	System.out.println("Age "+age+" Gender "+gender+" networkType "+networkType+" coverageType "+coverageType+" copay "+copay);
	String[] plans = {"HealthCheckUpPlan","HeartPlan"};
	return plans;
}
/**
 *This method is overloaded method with 3 arguments.to call this method specificly
 *we have to provide arg-type tag in replace-method tag
 *Proxy class will over ride all the methods which are present in PlanFinder
 *and it will call reimplement method simply
 */
public String[] findPlan(int age,String gender,int networkType) {
	System.out.println("3-Arg over loaded method");
	System.out.println("inside PlanFinder class method");
	System.out.println("Age "+age+" Gender "+gender+" networkType "+networkType);
	String[] plans = {"HealthCheckUpPlan","HeartPlan"};
	return plans;
}

public void m1(String str) {
	System.out.println("hello this is m1() method for testing "+str);
}
}
