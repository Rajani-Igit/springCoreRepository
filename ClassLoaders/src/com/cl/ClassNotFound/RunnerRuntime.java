package com.cl.ClassNotFound;

public class RunnerRuntime {
		public static void main(String[] args)throws Exception {
			String name = "com.cl.ClassCast.MessageRuntime";
			Class clazz = Class.forName(name);
			MessageRuntime obj =(MessageRuntime) clazz.newInstance();
			System.out.println("This Runner class is loaded by  "+RunnerRuntime.class.getClassLoader());
			obj.main();
		}
}
