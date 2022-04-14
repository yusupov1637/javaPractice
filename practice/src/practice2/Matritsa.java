package practice2;

import java.util.Scanner;

public class Matritsa {

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
		int a[] = new int[n];

		int min = mat[0][0];
		int max = mat[0][0];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				a[i] += mat[i][j];
				if (min > mat[i][j]) {
					min = mat[i][j];
				}
				if (max < mat[i][j]) {
					max = mat[i][j];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(max + " " + min);

	}

}
