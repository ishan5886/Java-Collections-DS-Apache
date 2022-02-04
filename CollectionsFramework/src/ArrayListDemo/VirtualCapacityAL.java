package ArrayListDemo;

import java.util.ArrayList;

public class VirtualCapacityAL {

	public static void main(String[] args) {
		
		
		ArrayList<Object> ar = new ArrayList<Object>();  
		
		// internally the memory slot allocated to AL gets divided into 10 slots
		// These slots are known as virtual capacity of AL
		//By default the VC of AL is 10
		//Java allocated virtual space for AL but size of AL is 0 and not 10
		
//		ar.add("Vakeel");
//		ar.add(100);
//		ar.add(false);
		
		//** To change VC of AL specify AL size in parameters 
		// ArrayList<Object> ar = new ArrayList<Object>()<20>  Increases VC to 20 from 10  
		
		
		

	}

}
