package practice2;

import java.util.Random;
import java.util.Scanner;

public class robocontest342 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		Random rn =new Random();

		
		int count=0;
		for (int i = 0; i < 1000; i++) {

			int a = (int) (Math.random() * 10);
			int b = (int) (Math.random() * 10);
			int c = (int) (Math.random() * 10);
			int d = (int) (Math.random() * 10);
			if(a+b+c+d==x) {
				if(a<=b && b<=c && c<=d) {
					System.out.println(a+" "+b+" "+c+" "+d);
					count++;	
				}
				
				
			}
			
		}
		
		System.out.println(count);
	}

}
