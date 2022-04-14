package List;

import java.util.LinkedList;
import java.util.List;

public class List2 {
	
	public static void main(String [] args) {
		List <Integer> ml = new LinkedList<Integer>();
		ml.add(23);
		ml.add(12);
		//ml.remove(1);
		ml.set(1, 11);
		ml.add(1,13);
		
		
		
		
		System.out.println(ml);
	}

}
