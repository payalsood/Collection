package MapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import ListConcept.Employee;

public class HashMapConcept {
	
	public static void main(String[] args) {
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(1, "test");
		
		m.put(1, "t");
		
		for(Entry hm: m.entrySet()){
			System.out.println(hm.getKey()+ " " + hm.getValue());
			
		}
		
		Employee e1 = new Employee("Payal", 30, 23000);
		Employee e2 = new Employee("Harry", 20, 41000);
		Employee e3 = new Employee("Tom", 35, 50000);
		
		HashMap<Integer, Employee> m2 = new HashMap<Integer, Employee>();
		
		m2.put(1, e1);
		m2.put(2, e2);
		m2.put(3, e3);
		
		for(Entry<Integer, Employee> hm2: m2.entrySet()){
			int key = hm2.getKey();
			Employee e = hm2.getValue();
			
			System.out.println(e.name  + e.age  + e.salary);
			
		}
		
		
		
		
		HashMap m1 = new HashMap();
		
		
		
		m1.put("p","payal");
		
		m.putAll(m1);
		
		boolean b = m.containsKey("p");
		
		
//		System.out.println(m.keySet());
//		System.out.println(m.entrySet());
//		
//		System.out.println(b);
		
		
		
		

	}

}
