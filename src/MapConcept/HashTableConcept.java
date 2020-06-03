package MapConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable<Integer,String> tb = new Hashtable<Integer,String>();
		
		tb.put(1, "Harry");
		tb.put(2, "Hermoine");
		tb.put(3, "Roger");
		tb.put(4, "Roger");
	
		
		
//		System.out.println(tb.hashCode());
//		
//		
//		System.out.println(tb.get(2));
//		
//		for(Entry m: tb.entrySet()){
//			
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
//		
//		Enumeration e= tb.elements();
//		 while(e.hasMoreElements()){
//			 System.out.println("values are "+ e.nextElement());
//		 }
//		 
		
		Hashtable<Integer,Integer> tb2 = new Hashtable<Integer,Integer>();
		tb2.put(1,null);
		System.out.println(tb2);

	}

}
