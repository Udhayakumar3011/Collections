package com.java.ArrayListTest;

import java.util.ArrayList;

public class ArrayListIndexPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrList = new ArrayList();
		arrList.add("Automation"); // 0
		arrList.add(0,"Selenium"); // 1
		arrList.add(3, "Testing"); // 2
		arrList.add(2, "Testing1"); // 3 //It allows Duplicate Value
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}

}
