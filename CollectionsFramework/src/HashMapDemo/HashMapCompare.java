package HashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		
		
			HashMap<String, String> map1 = new HashMap<String, String>();
		
				map1.put("key1", "value1");
				map1.put("key2", "value2");
				map1.put("key3", "value3");
				
				
			HashMap<String, String> map2 = new HashMap<String, String>();
				
				map2.put("key3", "value3");
				map2.put("key2", "value2");
				map2.put("key1", "value1");
				
			HashMap<String, String> map3 = new HashMap<String, String>();
				
				map3.put("key3", "value3");
				map3.put("key1", "value1");
				map3.put("key2", "value2");
				map3.put("key4", "value4");

			HashMap<Integer, String> map4 = new HashMap<Integer, String>();
				
				map4.put(1, "value1");
				map4.put(2, "value2");
				map4.put(3, "value3");
				
				

			HashMap<Integer, String> map5 = new HashMap<Integer, String>();
					
					map5.put(4, "value1");
					map5.put(5, "value2");
					map5.put(6, "value3");
					

			HashMap<Integer, String> map6 = new HashMap<Integer, String>();
							
							map6.put(4, "value1");
							map6.put(5, "value2");
							map6.put(6, "value3");
							map6.put(7, "value3");
		//1. On basis of key value pair : use equals method
				
				System.out.println(map1.equals(map2));//true
	
	
		//2. Compare hashmaps for the same keys : keySet():
			
				System.out.println(map1.keySet().equals(map2.keySet())); //true
				
		//3. Combine keys from both hashmaps: using HashSet
				HashSet<String> combinekeys = new HashSet<>(map1.keySet()); //add all keys from map1
				combinekeys.addAll(map3.keySet()); 
				
				//add all unique keys from map3 as duplicate keys between map1 and map3 will be removed by HashSet 
				//because HashSet does not include duplicate values
				combinekeys.removeAll(map1.keySet());
				System.out.println();
				System.out.println(combinekeys);
				
				
		//4. Compare maps by values
				
			//duplicates are not allowed : Using ArrayList
				
				System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map5.values())));
				
			
			//duplicates are not allowed : Using HashSet
				
				System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
