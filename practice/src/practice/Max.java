package practice;

import java.util.Scanner;

public class Max {
	
	public static void main(String[] args) {

		int[] a = {12,2, 32, 44, 111};
		int max=a[0];
		int i=0;
		while (i<a.length	) {
			
			if (a[i]>max) {
				max=a[i];
			}
			i++;
	
			
		}
		System.out.println(max);
	}

}
//Scanner in = new Scanner(System.in);
//int m = in.nextInt(), n = in.nextInt();
//
//int r;
//
//while (n != 0) {
//
//	r = m % n;
//	m = n;
//	n = r;
//}
//
//System.out.println("EKUB = " + m);
//}
//
//for (int i = b; a-b<b; i++) {
//if(a-b<b) {
//	int c = b-(a-b);
//	System.out.println("ekub =" + c );
//}
//}
//Scanner sc = new Scanner(System.in);
//int a = sc.nextInt();
//int b = sc.nextInt();
