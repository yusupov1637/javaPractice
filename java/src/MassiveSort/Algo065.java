package MassiveSort;

import java.util.Scanner;

public class Algo065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("x=");
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s = i / Math.pow(x, 2 * n);
		}
		System.out.println(s);
	}

}
