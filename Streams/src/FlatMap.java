import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(10,20,30,35,25,65,45,70,75,95,85,90,100,95); //Declare Arrays in single line without multiple add methods
		List<Integer> aleven = new ArrayList<Integer>();
		
		
		aleven = al.stream().map(n->n+10).collect(Collectors.toList());
		System.out.println(aleven);
		
		
		//FlatMap
		
		List<Integer> lst1 = Arrays.asList(10,20);
		List<Integer> lst2 = Arrays.asList(30,40);
		List<Integer> lst3 = Arrays.asList(50,60);
		
		
		List<List<Integer>> fl = Arrays.asList(lst1,lst2,lst3);
		
		List<Integer> fl2 = fl.stream().flatMap(x-> x.stream().map(n->n*5)).collect(Collectors.toList());
		System.out.println(fl2);
	}

}
