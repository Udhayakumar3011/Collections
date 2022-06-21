package com.java.ArrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrList = new ArrayList();
		arrList.add("Automation2"); // 0
		arrList.add("Automation1"); // 1
		arrList.add("Automation3"); // 2
		arrList.add("Automation4"); // 3
		arrList.add("Automation5"); // 4
		arrList.add("Automation6"); // 5
		
        //arrList.get(0);
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
