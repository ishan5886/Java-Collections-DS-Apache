import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		
		List<String> al = Arrays.asList("a","aaa","aaaa","b","bb","bbb","bbbb");
		List<String> alup = new ArrayList<String>();
		
		
		
		alup = al.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(alup);
		
		
		
		//------------------------------------------------------------------
		
		
		List<String> al1 = Arrays.asList("a","aaa","aaaa","b","bb","bbb","bbbb");
		List<Integer> allen = new ArrayList<Integer>();

		
//		allen = al1.stream().map(name->name.length()).collect(Collectors.toList());
//		System.out.println(allen);
		
		
		allen = al1.stream().map(name->name.length()).filter(n->n>=2).collect(Collectors.toList());
		System.out.println(allen);
		
		
	}

}
