package com.java.ArrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNullTest {

	// static String str;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(str.length());
		ArrayList arrList = new ArrayList();
		arrList.add("Automation2"); // 0
		arrList.add("Automation1"); // 1
		arrList.add("Automation3"); // 2
		arrList.add("Automation4"); // 3
		arrList.add("Automation5"); // 4
		arrList.add("Automation6"); // 5
		arrList.add(null); // 6

		// arrList.get(0);
		// sort-ascending order
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("Fetching the all values" + " " + arrList.get(i));
		}

	}

}
