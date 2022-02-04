package HashMapDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		
		
	//HashMap - Not ThreadSafe, One null key, Multiple null values
	//HashTable - Thread-safe, slow performance. Null key and values are not allowed
	//SynchronizedMap - Thread-safe, slow performance, null key and multiple null values are allowed
	//ConcurrentHashMap - Thread-Safe, Fast Performance, Null key and values not allowed
		
		//synchronizedMap method in collection class:
		
		Map<String, String> map3 = new HashMap<String, String>();
		map3.put("ID1", "value1");
		map3.put("ID2", "value2");
		map3.put("ID3", "value3");
		map3.put("ID4", "value4");
		
		Map<String, String> syncmap = Collections.synchronizedMap(map3); //Method to create Synchronized HashMap
		System.out.println(syncmap);
		
		
		// ConcurrentHashMap : it does not throw any ConcurrentModificationException
		
		ConcurrentHashMap<String, String> concmap = new ConcurrentHashMap<>();
		
		
		concmap.put("ID1", "value1");
		concmap.put("ID2", "value2");
		concmap.put("ID3", "value3");
		concmap.put("ID4", "value4");
		
		System.out.println(concmap.get("ID2"));
	}

}
























