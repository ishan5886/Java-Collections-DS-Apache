package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// default class
		// dynamic array
		
//**************************ARRAYLIST DECLARATION**************************************//		
		// default generics
		
//		ArrayList ar = new ArrayList();
//		
//		ar.add(100);
//		ar.add("Vakeel");
//		
		//receiving warning that Array List is raw type...Means data of any data type can be added to the Array List
		//solution - declare Array List with specific data type as parameter
		
		ArrayList<Object> ar = new ArrayList<Object>(); 
		ar.add("Vakeel");
		ar.add(100);
		ar.add(false);
		
		
		System.out.println(ar);
		System.out.println(ar.get(0)); //get value by index value starting from 0 
		System.out.println(ar.size()); //Size of Array List
		
		
		ar.add(600);
		ar.add("chacha");
		

	}

}
