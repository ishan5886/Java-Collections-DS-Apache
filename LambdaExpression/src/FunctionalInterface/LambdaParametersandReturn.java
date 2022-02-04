package FunctionalInterface;


interface Cab2{
	
	public String bookcab(String source, String destination);
			

}



public class LambdaParametersandReturn {

	public static void main(String[] args) {


	// Using Lambda
	
		Cab2 cab = (source, destination)->{
			System.out.println("........cab is booked..........from  "+source+" destination "+destination);
			return("Price is 5000");
		};
		System.out.println(cab.bookcab("Delhi","Faridabad"));
	
	}

}
