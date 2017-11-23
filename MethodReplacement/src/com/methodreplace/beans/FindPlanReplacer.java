package com.methodreplace.beans;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlanReplacer implements MethodReplacer {
    public FindPlanReplacer() {
		// TODO Auto-generated constructor stub
    	System.out.println("FindPlanReplacer Constructor");
	}
    /**
     * This method is comming from MethodReplacer interface and it is genric
     * to every method but this method will be called by Proxy genrated runtime class internally
     * but it seems like we are calling this method
     * we can write any number of methods to replace at a time
     * but it is not recommended to do so
     * rules to implement Method Replacement
     * 1)The class Should not be final
     * 2)method that you want to replace should not be final and static
     * if you have over loaded methods you have to provide arg type tag inside replace-method tag
     * other wise Parent class methods will call proxy methods will never call
     *
     */
	@Override
	public Object reimplement(Object obj, Method method, Object[] objArr) throws Throwable {
		//This methods are helpfull for getting the current method so that we can compare that 
		//method with required method for processing
		//Internally Proxy class will call thos method so it will provide all these arguments
		//i.e Method it will get the Method information in this way
		System.out.println("Parameter Object Name is "+obj.getClass().getName());
		System.out.println("reimplement method called");
		StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
		for(StackTraceElement stElement : stackTraceElement) {
			System.out.println("Elements are "+stElement);
		}
		
		System.out.println(method.getName());
		String[] plans = {"plan1","plan2"};
		if(method.getName().equals("findPlan")) {
			if(objArr.length>3) {
				int age = (Integer)objArr[0];
				String gender= (String)objArr[1];
				int networkType = (Integer)objArr[2];
				String coverageType= (String)objArr[3];
				int copay = (Integer)objArr[4];	
			}else {
				int age = (Integer)objArr[0];
				String gender= (String)objArr[1];
				int networkType = (Integer)objArr[2];
			}
			
		}else if(method.getName().equals("m1")){
			System.out.println("Method Details are "+PlanFinder.class.getMethod("m1",String.class).hashCode());
		}
		else {
			throw new Exception("This is not appropriate method to replace please check it once"); 
		}
		
		Method m1 = PlanFinder.class.getMethod("m1", String.class);
		System.out.println("Test method object "+m1.hashCode());
		Method method1 = PlanFinder.class.getMethod("findPlan",Integer.TYPE,String.class,Integer.TYPE,String.class,Integer.TYPE);
		System.out.println("Argumented  Method "+method.hashCode());
		System.out.println("Enclosing Method  "+method1.hashCode());
		System.out.println("method parameters count "+method.getParameterCount());
		System.out.println("method1 parameters count "+method1.getParameterCount());
		return plans;
	}

}
