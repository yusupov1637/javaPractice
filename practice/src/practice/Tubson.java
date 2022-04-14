package practice;

import java.util.Scanner;

public class Tubson {

	static Scanner sc = new Scanner(System.in);
	static int a = sc.nextInt();
	static int b = sc.nextInt();

	public static void TubSon() {

		int count = 0;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (a % i == 0 || b % j == 0) {
					count++;
				}
			}

		}
		if (count == 2) {
			System.out.println("tubson");
		} else {
			System.out.println("tubson emas");
		}
	}

	public void Ekub() {

		System.out.print("EKUB(" + a + "," + b + ") = ");
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		System.out.println(a);
	}

	public void Ekuk() {

		int summ = 0;
		System.out.print("EKUK(" + a + "," + b + ") = ");
		if (a < b) {
			a = b - a;
			b = b - a;
			a = a + b;
		}
		while (true) {
			summ = a + summ;
			if (summ % b == 0) {
				System.out.println(summ);
				break;
			}
		}
	}

}
