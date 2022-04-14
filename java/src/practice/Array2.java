package practice;

public class Array2 {
	public static void main(String [] args) {
		int a[] = {12,44,2,5,68,7,9,8};
		int  min = 2;
		for (int i = 0; i < a.length; i++) {
			
			if(i>=2 && i<=5) {
				System.out.print(1.*a[i]/min+ " ");
			}else {
				System.out.print(a[i] + " ");
			}
		}
		
	}


}
