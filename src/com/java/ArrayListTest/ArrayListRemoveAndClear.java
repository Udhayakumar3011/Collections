package com.java.ArrayListTest;

import java.util.ArrayList;

public class ArrayListRemoveAndClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrList = new ArrayList();
		arrList.add("Automation"); // 0
		arrList.add("Selenium"); // 1
		arrList.add("Testing"); // 2
		arrList.add("Java"); // 3
		arrList.add("AutoIT"); // 4
		arrList.add("Automation"); // 5
		//System.out.println(arrList.remove(2));
		//System.out.println(arrList.remove("Testing"));

		// System.out.println(arrList.clone());
		arrList.clear();
		System.out.println(arrList.clone());
	}

}
