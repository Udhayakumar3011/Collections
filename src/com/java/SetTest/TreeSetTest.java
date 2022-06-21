package com.java.SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet treeSet = new TreeSet();
		// Set sethash = new HashSet();
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("D");
		treeSet.add("E");

		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("D");
		treeSet.add("E");
	//	treeSet.add(null);
		Iterator itr = treeSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
