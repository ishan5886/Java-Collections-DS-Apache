import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		al.add(30);
//		al.add(20);
//		al.add(50);
//		al.add(60);
//		al.add(55);
//		al.add(65);
//		al.add(75);
//		al.add(80);
//		al.add(120);
		
		
		List<Integer> al = Arrays.asList(10,20,30,35,25,65,45,70,75,95,85,90,100,95); //Declare Arrays in single line without multiple add methods
		List<Integer> aleven = new ArrayList<Integer>();
		
		aleven=al.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(aleven);
		
		
		al.stream().filter(n->n%2==0).forEach(n->System.out.println(n)); //print each even number value
		
		al.stream().filter(n->n%2==0).forEach(System.out::println); 
	
	//Multiple conditions using && in filter method i.e. filter(c1 && c2)
	
	}

}
