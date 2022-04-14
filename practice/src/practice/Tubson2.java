package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tubson2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int num = 0;
		List list =new ArrayList();

		
		System.out.println("Son kiriting: ");
		int n = scanner.nextInt();
		scanner.close();
		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
		//		primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to n are :");
//		System.out.println(primeNumbers);

		
		//	list.add(primeNumbers);
			System.out.println(list);
			System.out.println(list.get(n));
			
		
		
		

	}

}
