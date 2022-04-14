package List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class List04 {
	
	public static void main(String[] args) {
		String b ="jam jam aziz aziz jasur jasur otabek otabek";
		String[] a=b.split("\\s");
		
        Set<String>set=new HashSet<String>(Arrays.asList(a));
        System.out.println(set);
        List<String>list=new LinkedList<>(set);
        System.out.println(list);
	}
	
}
