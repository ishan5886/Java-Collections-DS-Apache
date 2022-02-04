package HashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map3 = new HashMap<String, Integer>();
		
		map3.put("key1", 100);
		map3.put("key2", 200);
		map3.put("key3", 300);
		map3.put("key4", 400);
		map3.put("key5", 500);
		
		
		Iterator it = map3.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry pairs = (Entry) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
			
		}
		
		
		//Convert hashmap keys to ArrayList
		List<String> alk = new ArrayList<String>(map3.keySet());
		
		for(String t : alk) {
			System.out.println(t);
		}
		
		
		//Convert hashmap keys to ArrayList
		List<Integer> alv = new ArrayList<Integer>(map3.values());
				
		for(Integer t : alv) {
			System.out.println(t);
		}
		
		//Using lambda
		
		map3.forEach((k,v)  ->  System.out.println("key = " +k+ " values = " +v));
		

	}

}
