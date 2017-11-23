package com.hash.pcl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Runner {
	String str1="Aa";
	String str2="Aa";
	 Integer i=123456;
	 Integer i1=123456;
	String str3="i";
	String str4="i1";

public static void main(String[] args) {
	
	
	Runner runner = new Runner();
	System.out.println(runner.i.equals(runner.i1));
	System.out.println("HashCode of Aa  "+runner.str1.hashCode());
	System.out.println("HashCode of Bb  "+runner.str2.hashCode());
	System.out.println("HashCode of i  "+runner.i.hashCode());
	System.out.println("HashCode of i1  "+runner.i1.hashCode());
	System.out.println(runner.str3.hashCode());
	System.out.println(runner.str4.hashCode());
	HashMap hashMap = new HashMap();
	hashMap.put("Aa","This is first Object");
	hashMap.put("Aa","This is second object");
	hashMap.put(runner.i,runner.i+1);
	hashMap.put(runner.i1,runner.i1+2);
	System.out.println(hashMap);
}

}
