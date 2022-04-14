package MassiveSort;

import java.util.Scanner;

public class Algo07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		double s = 0;
		for (int i = 1; i <= n; i++) {
			double p=1;
			for(int j=1;j<=i*2-1;j++) {
				p*=j;
			}
			s +=(Math.pow(-1,i-1)*Math.pow(x,2 * i - 1) /p);
		}
		System.out.println(s);

	}
}
