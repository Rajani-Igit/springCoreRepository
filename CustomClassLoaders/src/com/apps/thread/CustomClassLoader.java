package com.apps.thread;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CustomClassLoader extends ClassLoader {
	 public Class<?> findClass(String name) throws ClassNotFoundException {
		 ClassLoader classLoader = getSystemClassLoader();
		// System.out.println(CustomClassLoader.class);
		 System.out.println("custom class loader loaded by "+this.getClass().getClassLoader());
		 System.out.println("Parent class loader of custom class loader  "+getClass().getClassLoader().getParent());
		 System.out.println("Parent of Parent class loader  "+getClass().getClassLoader().getParent().getParent());
		 /*this method is used for checking weather parent class loader is loaded or not
		   try {
	            return findSystemClass(name);
	        } catch (Exception e) {
	        }*/
		// return classLoader.loadClass(name);
         byte[] bt = loadClassData(name);
         return defineClass(name, bt, 0, bt.length);
      }
      private byte[] loadClassData(String className) {
    	System.out.println("Custom ClassLoader class is loaded by "+getClass().getClassLoader());
    	System.out.println("System ClassLoader  "+getSystemClassLoader());
        InputStream is = getClass().getClassLoader().getResourceAsStream(className.replace(".", "/")+".class");
        ByteArrayOutputStream byteSt = new ByteArrayOutputStream();
        int len =0;
        try {
              while((len=is.read())!=-1){
                   byteSt.write(len);
                   }
                } catch (IOException e) {
                     e.printStackTrace();
               }
        //convert into byte array
        return byteSt.toByteArray();
     }   
}
