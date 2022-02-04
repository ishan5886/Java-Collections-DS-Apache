package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisedArrayList {

	public static void main(String[] args) {
		
		
		List<String> ar1 = Collections.synchronizedList(new ArrayList<String>());
		ar1.add("A");
		ar1.add("B");
		ar1.add("C");
		
		
		//add, remove - we dont need explicit synchronization
		
		//to fetch/traverse values - we need to use explicit synchronization using synchronized keyword
		
		
		synchronized(ar1){
			Iterator<String> it = ar1.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		
		
		// copyOnWriteArrayList  - its a class
		//add,remove,traverse, by default synchronised
		
		CopyOnWriteArrayList<String> emp1 = new CopyOnWriteArrayList<String>();
		{
			emp1.add("A");
			emp1.add("B");
		}
		
		Iterator<String> it = emp1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}
