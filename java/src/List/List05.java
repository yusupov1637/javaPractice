package List;


import java.util.List;

public class List05 {
	
	public static void main(String [] args) {
		
		String a[] = {"0","1","2","3","4","5","6","7"};
		
		//List<String> list = new LinkedList<>();
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}else {
				System.out.println("");
			}
			
		}
	}

}
