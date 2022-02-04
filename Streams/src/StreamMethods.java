
public class StreamMethods {

	public static void main(String[] args) {
		
		// distinct -->> list.stream().distinct.collect(Collectors.toList()) - Return unique values
		//  list.stream().distinct.forEach(value->Syso(value))
		
		
		//count -->> list.stream().distinct.count();
		
		//limit  -limit number of values to get  -- list.stream().limit(3).collect(Collectors.toList())

		
		// min()  Optional <Integer> min1 =listname.stream().min((val1,val2)->{
		//																		return val1.compareTo(val2);
		//																		});
	
		//sorted :- list.stream().sorted.collect(Collectors.toList())  ascending order
		// list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())  descending order
		
		
		// anyMatch - list.stream().anyMatch(value-> {return value.startWith("one");}); -return boolean value
		
		// allMatch - list.stream().allMatch(value-> {return value.startWith("one");}); -return boolean value - all values in data set should start with the given string else return false
	
		// anyMatch - list.stream().noneMatch(value-> {return value.startWith("one");}); -return boolean value - if no value has mentioned string it will return true else false
	
		// findAny() - list.stream().findAny() - will return any value and store it in Optional<String> object - .get method to get value of object
		
		//findFirst() - Find the first value in the list
	}

}
