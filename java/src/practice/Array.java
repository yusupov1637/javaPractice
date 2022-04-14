package practice;
 import java.util.Scanner;

public class Array {
	public static void main(String [] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("elementlar sonini kiriting");
		int e_soni = S.nextInt();
		
		int x[] = new int[e_soni];
		int y=0;
		System.out.println(e_soni + " ta element kiriting");
		for (int i = 0; i < x.length; i++) {
			x[i] = S.nextInt();
			y = y +x[i];
			
			
		}
		System.out.println(y/x.length);
		//System.out.println(y/x.length);
		//for (int i = 0; i < x.length; i++) {

		//}
		//
		
	}

}
