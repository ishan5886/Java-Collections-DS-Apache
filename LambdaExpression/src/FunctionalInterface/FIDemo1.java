package FunctionalInterface;

@FunctionalInterface

interface Cab{
	
	public void bookcab();
			}

//class Ola implements Cab{
//	
//	public void bookcab() {
//	System.out.println("........cab is booked..........");
//	}
//}

public class FIDemo1 {

	public static void main(String[] args) {
	
//		Ola cab = new Ola();// creating object using ClassName
//		cab.bookcab();
//		
//		Cab cab1 = new Ola(); // creating object using iNTERFACEName
//		cab1.bookcab();


	// Using Lambda
	
		Cab cab = ()->System.out.println("........cab is booked..........");
		cab.bookcab();
	
	}

}
