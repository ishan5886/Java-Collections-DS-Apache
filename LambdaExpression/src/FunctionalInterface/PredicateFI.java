package FunctionalInterface;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.function.Predicate;




class Employee{
	String ename;
	int salary;
	int experience;


	Employee(String name, int sal, int exp){
		ename=name;
		salary=sal;
		experience=exp;
	}



}


public class PredicateFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//-------------------------------------------
//		Predicate<Integer> p = i->(i>10);
//		System.out.println(p.test(20));//true
//		System.out.println(p.test(5)); //false
//		
//
//		//--------------------------------------------
//		
//		Predicate<String> ps = s->(s.length()>4);
//		System.out.println(ps.test(("nkfkfksfkskfnksnfkskd"))); //true
//		System.out.println(ps.test(("nkf"))); //false
//	
//		
//		//---------------------------------------------
//		
//		String names[] = {"AAAA","BBBBB", "CCCCC","DDDDD","EEE"};
//	
//		for(String name : names) {
//			if (ps.test(name)) {
//
//				System.out.println(name);
//			}
//		}
		
		

//		//---------------------------------------------
//		
//		Employee emp = new Employee("Dhali",60000,7);
//		
//		Predicate<Employee> pr = e->(e.salary>30000 && e.experience>5);
//		System.out.println(pr.test(emp));
		
		//---------------------------------------------
		
		
//		ArrayList<Employee> al = new ArrayList<Employee>();
//		
// 		al.add(new Employee("Phoebe", 10000, 3));
// 		al.add(new Employee("Phoebe1", 20000, 4));
// 		al.add(new Employee("Phoebe2", 30000, 2));
// 		al.add(new Employee("Phoebe3", 40000, 1));
// 		al.add(new Employee("Phoebe4", 50000, 5));
// 		al.add(new Employee("Phoebe5", 60000, 7));
// 		
// 		
// 		for(Employee e: al) {
// 			
// 			if (e.salary>30000 && e.experience>2) {
// 				
// 				System.out.println(e.ename+"   "+e.salary+"   "+e.experience);
//				
//			}
// 			
// 		}
 		
 		
		
 		//---------------------------------------------
 		
 		// Joining Predicates
 		
 		
		int a[] = {2,3,4,5,6,7,8,9,10,11,12};
		
		Predicate<Integer> p1 = i->i%2==0;
		
		Predicate<Integer> p2 = i->i>5;
		
		for(int n:a) {
			
//			if (p1.and(p2).test(n)) {
//				
//				System.out.println(n);
//				
//			}
			
			if (p1.or(p2).test(n)) {
				
				System.out.println(n);
				
			}

		}
		
		
		
	}
	
	

}
