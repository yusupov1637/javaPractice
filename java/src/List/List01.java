package List;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List01 {
	
	public static void main(String [] args) {
		
		List<Integer> Person = new ArrayList<Integer>();
		
		Person.add(23);
		Person.add(33);
		Person.add(43);
		Person.set(0, 11);
		Person.add(22);
		Person.add(34);
		
		//Collections.sort(Person.Collections.reverseOrder());
		
		Collections.sort(Person);
		
	  //  System.out.println(Person);
	    
	   // Person.add(2);
		Person.remove(2);
	
		
		
		
		System.out.println(Person);
	}
	

}
