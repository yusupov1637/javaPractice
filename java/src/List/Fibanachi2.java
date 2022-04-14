package List;

import java.util.Scanner;

public class Fibanachi2 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
	    System.out.println(fib(i));
	   // int i=sc.nextInt();
	}
	static int fib(int i) {
		
		if(i<=1)
			return i;
		return (fib(i-2) + fib(i-1));
		
	}

}
