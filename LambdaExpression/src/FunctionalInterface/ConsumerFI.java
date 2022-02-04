package FunctionalInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;



class Employee1{
	String ename;
	int salary;
	String gender;


	Employee1(String ename, int salary, String gender){
		this.ename=ename;
		this.salary=salary;
		this.gender=gender;
	}



}


public class ConsumerFI {

	public static void main(String[] args) {
		
		
//		Consumer<String> c = s->System.out.println(s);
//		
//		c.accept("solo");
		
//		
//		ArrayList<Employee1> al = new ArrayList<Employee1>();
//		
// 		al.add(new Employee1("Phoebe", 10000, "Female"));
// 		al.add(new Employee1("Phoebe1", 20000, "Male"));
// 		al.add(new Employee1("Phoebe2", 30000, "Female"));
// 		al.add(new Employee1("Phoebe3", 40000, "Male"));
// 		al.add(new Employee1("Phoebe4", 50000, "Male"));
// 		al.add(new Employee1("Phoebe5", 60000, "Female"));
// 		
// 		
// 		//Function
// 		Function<Employee1, Integer> f = emp->(emp.salary*10)/100;
// 		
// 		//Predicate
// 		Predicate<Integer> p=b->b>=5000;
// 		
// 		//Consumer
// 		Consumer<Employee1> c = emp->{
// 			
// 							System.out.println(emp.ename);
// 							System.out.println(emp.salary);
// 							System.out.println(emp.gender);
// 			
// 									};
//
// 			for(Employee1 e:al) {
// 				
// 				int bonus = f.apply(e);
// 				if(p.test(bonus)) {
// 					c.accept(e);
// 					System.out.println(bonus);
// 				}
// 				
// 				
// 			}
 			
 			
 			//---------Consumer Chaining
 			
 			
 			Consumer<String> cc =s->System.out.println(s+"  Sysoooooo  "+"  Sysosysosyso  ");
 			
 			Consumer<String> cc2 =s->System.out.println(s+"  Char Chavanni  "+"  Ghode Pe  ");
 			
 			cc2.andThen(cc).accept("Cowwwwwww");
 			
	}

}
