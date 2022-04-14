package practice2;

import java.util.Scanner;

public class Matritsa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int mat[][] = new int[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] += sc.nextInt();
			}
		}
		int a[] = new int[m];
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < mat.length; i++) {
				a[j] += mat[i][j];

			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
