package com.java.SetTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DifferenceHashSetAndTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	HashSet arrList = new HashSet<>();
		TreeSet arrList=new TreeSet<>();
		arrList.add("Automation"); // 0
		arrList.add(123); // 1
		arrList.add(true); // 2
		arrList.add(1.25); // 3
		arrList.add("Automation2"); // 4
		arrList.add("Automation3"); // 5
		Iterator itr = arrList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
