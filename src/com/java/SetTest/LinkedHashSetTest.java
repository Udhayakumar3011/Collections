package com.java.SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet sethash = new LinkedHashSet<>();
		sethash.add("B");
		sethash.add("A");
		sethash.add("C");
		sethash.add("D");
		sethash.add("E");

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
