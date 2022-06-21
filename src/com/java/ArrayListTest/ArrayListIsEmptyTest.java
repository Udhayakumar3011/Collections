package com.java.ArrayListTest;

import java.util.ArrayList;

public class ArrayListIsEmptyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrList = new ArrayList();
		arrList.add("Automation"); //0
		arrList.add("Selenium"); //1
		arrList.add("Testing"); //2
		 //!=
		 
		if (!arrList.isEmpty()) {
			for (int i = 0; i < arrList.size(); i++) {
				System.out.println(arrList.get(i));
			}
		} else {
			System.out.println("List is Empty");
		}
	}
}
