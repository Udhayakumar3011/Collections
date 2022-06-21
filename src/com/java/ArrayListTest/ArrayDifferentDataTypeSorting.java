package com.java.ArrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDifferentDataTypeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrList = new ArrayList();
		arrList.add("Automation"); // 0
		arrList.add(123); // 1
		arrList.add(true); // 2
		arrList.add(1.25); // 3
		arrList.add("Automation2"); // 4
		arrList.add("Automation3"); // 5

		// arrList.get(0);
		// sort-ascending order
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("Before Sorting:" + " " + arrList.get(i));
		}
		Collections.sort(arrList);
		System.out.println("------------------");
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("After Sorting:" + " " + arrList.get(i));
		}
	}

}
