package practice2;

import java.util.Scanner;

public class parol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		String a[]=password.split("");
		System.out.println(a); 
	}
}
