package List;

import java.util.Scanner;

public class IntegerToRoman1 {
	
	public static void main(String [] args) {
		
		String[] units = {" " , "I", "II", "III","IV", "V", "VI", "VII", "VII", "IX" };
		String[] tens = {" ", "X","XX", "XXX", "XL", "L","LX","LXX","LXXX","XC"};
		String[] hundreds = {"", "C", "CC", "CCC", "CD", "D","DC", "DCC","DCCC", "CM"};
		String[] thousands= {" ", "M", " MM", "MMM" };
		System.out.println("son kiriting-");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=n/1000;
		int b=n%1000/100;
		int c=n%100/10;
		int d = n%10;
		if(n<4000) {
			System.out.println( n + "rim raqamda = " + thousands[a] + hundreds[b] + tens[c] + units[d]);
			
		}else {
			System.out.println("4000 dan kichik son kirit");
		}
	}

}
