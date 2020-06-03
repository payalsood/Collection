package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(30);
		ar.add("Payal");
		
		//System.out.println(ar.size());
		//System.out.println(ar.get(2));
		
//		for(int i=0; i< ar.size(); i++){
//			System.out.println(ar.get(i));
//		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Payal", 30, 23000);
		Employee e2 = new Employee("Harry", 20, 41000);
		Employee e3 = new Employee("Tom", 35, 50000);
		

		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		Iterator<Employee> it = ar2.iterator();
		while(it.hasNext()){
			Employee e = it.next();
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.salary);
		}
		
	}

}
