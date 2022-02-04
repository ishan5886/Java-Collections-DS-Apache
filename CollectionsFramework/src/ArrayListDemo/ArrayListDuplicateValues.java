package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDuplicateValues {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,2,2,2,4,4,4,7,5,6,7,8,9,7));
		
		//LinkedHashSet
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(ar1);
		
		ArrayList<Integer> ar1noduplicate = new ArrayList<Integer>(lhs);
		System.out.println(ar1noduplicate);
		
		//JDK 8 - stream
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,2,2,2,4,4,4,7,5,6,7,8,9,7));
		List<Integer> ar22 = ar2.stream().distinct().collect(Collectors.toList());
		System.out.println(ar22);
		
	}

}
