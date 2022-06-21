package com.java.HashTabletTest;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableKeyAndValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable table = new Hashtable();
		           //key         //value
		table.put("username", "abc@gmail.com");
		table.put("Password", "Password@123");
		table.put("RememberMe", "java123@gmail.com");
		//table.put(null, "Checkbox");
		//table.put("Checkbox", null);
	//	table.put("Clicklogin", "LinkText");
	//	table.put("username", "selenium@gmail.com");
	//	table.put("username", "collections@gmail.com");
		
		
		//System.out.println(table.get("username"));
		//System.out.println(table.get("Password"));
		//System.out.println(table.get("RememberMe"));
		//System.out.println(table.get("Clicklogin"));
		// System.out.println(table.get("username"));
		
		Enumeration e=table.keys();
		while(e.hasMoreElements()) {
		//	System.out.println(e.nextElement());

			//type Casting-Store different data type
		String key=	(String) e.nextElement();
		System.out.println(key+"-- "+table.get(key));
		
		}
		
	}

}
