package com.java.SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSetTestWithoutWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set sethash = new HashSet();
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
		sethash.add(null);
		Iterator itr = sethash.iterator();
		/*
		 * System.out.println(itr.next()); System.out.println(itr.next());
		 * System.out.println(itr.next()); System.out.println(itr.next());
		 * System.out.println(itr.next()); System.out.println(itr.next());
		 */

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
