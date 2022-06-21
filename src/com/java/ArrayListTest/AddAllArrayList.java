package com.java.ArrayListTest;

import java.util.ArrayList;

public class AddAllArrayList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrList = new ArrayList<>();
		arrList.add("Selenium");
		arrList.add(123);
		arrList.add("Testing");
		
		
		ArrayList arrList1 = new ArrayList();
		arrList1.add("Automation");
		arrList1.add(555);
		arrList1.add("Testin g");

		// addAll-Store Two ArrayList into Single ArrayList
		arrList1.addAll(arrList);
		System.out.println(arrList1);
	}

}
