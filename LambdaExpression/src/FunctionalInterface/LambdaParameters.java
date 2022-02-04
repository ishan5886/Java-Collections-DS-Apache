package FunctionalInterface;


interface Cab1{
	
	public void bookcab(String source, String destination);
			}



public class LambdaParameters {

	public static void main(String[] args) {
	
//		Ola cab = new Ola();// creating object using ClassName
//		cab.bookcab();
//		
//		Cab cab1 = new Ola(); // creating object using iNTERFACEName
//		cab1.bookcab();


	// Using Lambda
	
		Cab1 cab = (source, destination)->System.out.println("........cab is booked..........from  "+source+" destination "+destination);
		cab.bookcab("Delhi","Faridabad");
	
	}

}
