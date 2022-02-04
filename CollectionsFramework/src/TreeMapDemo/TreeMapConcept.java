package TreeMapDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,Integer> tm = new TreeMap<>(Comparator.reverseOrder()); //sort descending order
		
		tm.put("k1", 100);
		tm.put("k2", 200);
		tm.put("k4", 400);
		tm.put("k3", 300);
		
		
		TreeMap<Integer,String> tm1 = new TreeMap<>();
		
		tm1.put(100, "A");
		tm1.put(200,"B");
		tm1.put(400,"C");
		tm1.put(300,"D");
		
		System.out.println(tm);  //TreeMap prints keys in sorted order
		
		System.out.println(tm.lastKey());
		System.out.println(tm.firstKey());
		
		
		Set<Integer> k3 = tm1.headMap(300).keySet();
		System.out.println(k3);

		Set<Integer> k4 = tm1.tailMap(300).keySet();
		System.out.println(k4);
	}

}
