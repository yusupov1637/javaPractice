package practice;

import java.util.Arrays;

public class Siklsiz {

	public static void main(String[] args) {

		int[] s1 = { 5, 4, 6, 1, 2, 7 };

		int[] s2 = { 1, 2, 3, 4, 5, 7, 6 };

		Arrays.sort(s1);
		Arrays.sort(s2);
		if (Arrays.equals(s1, s2)) {
			System.out.println("massiv elemetlari bir xil");
		} else {
			System.out.println("massiv elemetlari bir xil emas");
		}
	}
}
