package com.java.ArrayListTest;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// Array-Collection of similar data type-fixed memory-object array
		// ArrayList-dynamic memory-no memory waste
		// 5 size
		// <> Generic Type
		// <>-Not Present-Non Generic type
		// {""""""}
		ArrayList arrList = new ArrayList();
		arrList.add("Selenium");
		arrList.add(123);
		arrList.add("Testing");

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

	}
}
