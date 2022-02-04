package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("ID1");
		ar1.add("ID2");
		ar1.add("ID3");
		ar1.add("ID4");
		ar1.add("ID5");
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("ID6");
		ar2.add("ID7");
		ar2.add("ID8");
		ar2.add("ID9");
		ar2.add("ID10");
		
		ar1.addAll(ar2);  //add all contents of ar2 into ar1
		System.out.println(ar1);
		
		
		ar1.addAll(2, ar2); // add all contents of ar2 into ar1 from specific index 
		ar1.clear(); //clear arraylist values
		
		
		ArrayList<String> ar12 = (ArrayList<String>)ar1.clone();  //Cloning arraylist
		System.out.println(ar12);
		
		System.out.println(ar1.contains("ID1")); //Check if AL contains values
		System.out.println(ar1.indexOf("ID4"));
		
		
		ArrayList<String> ar3 = new ArrayList<String>();
		
		ar3.add("ID11");
		ar3.add("ID12");
		ar3.add("ID13");
		ar3.add("ID14");
		ar3.add("ID11");
		
		int i = ar3.lastIndexOf("ID11"); //Print last index of ID11 value
		System.out.println(i);  //if value not present in AL it will print value -1
		
		ar3.remove(1);  // Index at [1] will be reoved from AL
		ar3.remove("ID13");  //Remove value ID13
		
		ar3.removeIf(val -> val.contains("ID14"));  // Remove value from AL based on condition
		System.out.println(ar3);
		
		ar3.retainAll(Collections.singleton("ID11")); //Retain all values with value ID11
		
		ArrayList<String> ar4 = new ArrayList<String>(ar3.subList(1,2));  // create sublist based on index values
		System.out.println(ar4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
