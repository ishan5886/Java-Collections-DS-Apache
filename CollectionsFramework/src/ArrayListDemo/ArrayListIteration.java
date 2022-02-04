package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("ID1");
		ar2.add("ID2");
		ar2.add("ID3");
		ar2.add("ID4");
		ar2.add("ID5");
		
		//First Method
		
		for(int i=0;i<ar2.size();i++) {
			
			System.out.println(ar2.get(i));
		}
		
		System.out.println("**********************************************************************");
		
		//for each loop
		for(String s : ar2) {
			System.out.println(s);
		}
		
		
		System.out.println("**********************************************************************");
		
		//JDK 8 - streams with lambda:
		
		ar2.stream().forEach(ele -> System.out.println(ele));
		
		// iterator
		
		Iterator<String> it = ar2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//AL with another collection
		
		ArrayList<Integer> ar3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(ar3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
