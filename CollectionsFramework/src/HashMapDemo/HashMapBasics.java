package HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		
		//Does not maintain order or indexing
		//Stores in format of key value pairs
		//key cannot be duplicate
		// can store n number of null values but only one null key
		// hashmap is not thread safe
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		
		map1.put("key1", "value1");
		map1.put("key2", "value2");
		map1.put("key3", "value3");
		map1.put("key4", "value4");
		map1.put("key5", "value5");
		map1.put(null, "value11");
		map1.remove("key4");  //Remove key4 from HashMap
		
//		System.out.println(map1.get("key2"));
//		System.out.println(map1.get(null));
		
		
		// Iterating HashMap : Over keys using keySet()
		
		Iterator<String> it = map1.keySet().iterator();
		while(it.hasNext()) {
			
			String key = it.next();
			String value = map1.get(key);
			System.out.println(value);
		}
		
		System.out.println("-----------------------------------------------------------------");
		// Iterating HashMap : Over pair using entrySet()
		
		Iterator<Entry<String, String>> it1 = map1.entrySet().iterator();
		while(it1.hasNext()) {
			
			Entry<String, String> entry = it1.next(); //will give key value pair 
			System.out.println("key = " + entry.getKey() + "  and value  = " + entry.getValue());
			
			
		}
		
		System.out.println("--------------------------------------");
		
		//Iterating HashMap using foreach and lambda
		
		map1.forEach((k,v) -> System.out.println("key = " +k+ " and value = " +v ));
		
	}

}















