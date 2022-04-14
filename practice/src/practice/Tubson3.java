package practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Tubson3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("son kirit - ");
		int r = sc.nextInt();
		int c = 0;
		int i = 0;
		int num = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (i = 1; i <= 1000; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				list.add(i);
				c++;

			}
		}

		System.out.println(r + " raqami  " + list.get(r - 1));

	}
}
