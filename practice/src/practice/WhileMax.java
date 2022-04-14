package practice;

import java.util.Scanner;

public class WhileMax {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("massive uzunligini kiriting");
		int i = 0;
		int a[] = { 12, 33, 11, 22, 43 };
		int max = a[0];

		while (i < a.length) {

			if (a[i] < max) {
				max = a[i];
			}
			i++;

		}
		System.out.println(max);
	}

}
