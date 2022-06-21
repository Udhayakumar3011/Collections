package com.java.ArrayListTest;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList sethash = new LinkedList();
		sethash.add("B");
		sethash.add("A");
		sethash.add("C");
		sethash.add("D");
		sethash.add("E");
		sethash.add(null);
		sethash.add("B");
		sethash.add("A");
		sethash.add("C");
		sethash.add("D");
		sethash.add("E");

		Iterator itr = sethash.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
