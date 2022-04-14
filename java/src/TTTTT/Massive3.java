package TTTTT;

import java.util.Scanner;

public class Massive3 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("massive elementlarini kirit");
		int number[] = new int[6];
		
		int y=0;
		for (int i = 0; i < number.length; i++) {
			number[i]=sc.nextInt();
		}
		for (int i = 0; i < number.length; i++) {
			if(number[i]<0) {
				y+=(int) Math.pow( number[i], 2);
			}
			
	}
		System.out.println(y);

}
}