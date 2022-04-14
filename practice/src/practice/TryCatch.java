package practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("son ");
		try {
			int n = Integer.parseInt(sc.nextLine());

			if (99 % n == 0)
				System.out.println(n + " soni 99 ga bo`linadi ");
			else
				System.out.println("bu son 99ga qoldiqli bo`linadi");
		} catch (InputMismatchException e) {
			System.out.println("Arithmetic " + e);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic " + e);
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception " + e);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException..");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out Of Bounds");
		} catch (RuntimeException e) {
			System.out.println("IOException  ");
		} catch (Exception e) {
			System.out.println("Arithmetic " + e);
		}
	}
}
