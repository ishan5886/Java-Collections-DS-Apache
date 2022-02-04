package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparisonArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,2,2,2,4,4,4,7,5,6,7,8,9,7,89));
		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,2,55,55,2,44,45,4,7,5,6,7,8,9,7));
		
		// 1. First sort and then use equals
		
		Collections.sort(ar1);
		Collections.sort(ar2);
		System.out.println(ar1.equals(ar2)); //false

		
		// Compare two ALs and find additional elements
		
//		ar2.removeAll(ar1);
//		System.out.println(ar2);
//		
		
		// Find out missing element
		
//		ar1.removeAll(ar2);
//		System.out.println(ar1);
		
		//Find out common elements
		
		ar1.retainAll(ar2);
		System.out.println(ar1);

	}

}
