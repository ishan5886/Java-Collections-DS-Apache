package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("A");
		hs.add("Didi");
		hs.add("Mudi");
		
		Set<String> hs2 = new HashSet<String>();
		
		hs2.add("AA");
		hs2.add("Momta");
		hs2.add("MudiZee");
		
		System.out.println(hs);

		System.out.println(hs.contains("Mudi"));
		hs.remove("Mudi");
		
		System.out.println(hs);
		
		hs.addAll(hs2);
		
		System.out.println(hs);
	}
}
