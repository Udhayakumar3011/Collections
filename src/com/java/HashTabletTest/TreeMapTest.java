package com.java.HashTabletTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap table = new TreeMap();
		// key //value
		table.put("username", "abc@gmail.com");
		table.put("Password", "Password@123");
		table.put("RememberMe", "java123@gmail.com");
		// table.put(null, "Checkbox");
		//table.put("Checkbox", null);
		//table.put("Checkbox", null);
		// table.put("RabioIcon", null);
		Set s = table.keySet();
		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println(key + " -" + table.get(key));

		}

	}

}
