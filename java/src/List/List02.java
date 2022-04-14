package List;


import java.util.LinkedList;
import java.util.List;

public class List02 {
	
	public static void main(String [] args) {
		
		String a ="jam jam aziz aziz Jasur jasur Otabek otabek";
		
		String[] b=a.split("\\s");
		
		List<String> list = new LinkedList<>();
		
		for(int i=0; i<b.length;i++) {
			int count = 0;
			for(int j=i;j<b.length;j++) {
				if(b[i].equalsIgnoreCase(b[j])) {
					count++;
				}
			}
			if(count>=2) {
				continue;
			}else {list.add(b[i]);}
			
		}
		System.out.println(list);
		
		
		
		}
		
		
		
		
		
	}

