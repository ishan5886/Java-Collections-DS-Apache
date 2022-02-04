package LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		 //default class in Java
		// it can be used as List,stack,Queue
	   // it allows null entry
	  //dynamic collection
	 // contain duplicate elements
	// not synchronized(not thread safe)
   // manipulation is fast because we dont need any shifting
		
		
		// LL Constructors : LinkedList();   ;  LinkedList(Collection c);
		
		LinkedList<String> names = new LinkedList<String>();
		System.out.println(names.size());
		names.add("I1");
		names.add("I2");
		names.add("I3");
		names.add("I4");
		
//		System.out.println(names);
//		System.out.println(names.get(1));
//		
//		Iterator<String> it1 = names.iterator();
//		while(it1.hasNext()) {
//			System.out.println(it1.next());
//		}
//		
//		names.add(4, "I5");
//		System.out.println(names);
//		
//		names.remove(2);
//		System.out.println(names);
		

		Iterator<String> it2 = names.descendingIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
	}
	
	}

}
