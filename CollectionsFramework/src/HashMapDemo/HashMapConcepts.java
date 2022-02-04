package HashMapDemo;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapConcepts {
	
	public static Map<String, String> map3;
	
	static {
		map3 = new HashMap<>();
		map3.put("ID1", "value1");
		map3.put("ID2", "value2");
	}

	public static void main(String[] args) {
		
		
		//1. HashMap class
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<>();
		
		
		//2. Static HashMap
		
		System.out.println(HashMapConcepts.map3.get("ID1"));
		
		//3. ImmutableMap with single entry
		
		Map<String, String> map3 = Collections.singletonMap("ID3", "VALUE3");  //Cannot add values
		System.out.println(map3.get("ID1"));

		//4 . JDK 8:
		// creating 2D array of Strings amf collecting in the form Map
		Map<String, String> map4 = Stream.of(new String [][]{
				
				{"Tom", "A Grade"},
				{"Naveen", "A+ Grade"},
			
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(map4.get("Tom"));
		
		//using SimpleEntry
		
		Map<String, String> map5 = Stream.of(new AbstractMap.SimpleEntry<>("A", "AA"), 
				new AbstractMap.SimpleEntry<>("B", "BB") 
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				
		System.out.println(map5.get("A"));
		
		//JDK 1.9
		
		Map<String, String> emptymap = Map.of();  //create empty map ,exception if try to add value
		
		Map<String, String> singletonmap = Map.of("k1", "kk"); 
		
		//Can add only single key value entry...exception if try to add 2nd entry
		
		System.out.println(singletonmap.get("k1"));
		
		
		Map<String, String> multimap = Map.of("k1", "kk","k2", "kkk"); //Can accept max 10 Key value pairs
		System.out.println(multimap.get("k2"));
		
		
		
		// No limit on key value pairs
		
		//Once values declared cannot add values
		Map<String, Integer> map7 = Map.ofEntries(
				
				new AbstractMap.SimpleEntry<>("A",100),
				new AbstractMap.SimpleEntry<>("B",200),
				new AbstractMap.SimpleEntry<>("C",300)
				
				);
		
		System.out.println(map7.get("C"));
		
		//maps using Guava:
		
	//	Map<String, Integer> map8  = ImmutableMap.of("G1", "G11", "A1","A11");
		
		
		
	}

}
























