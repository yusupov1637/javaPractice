package practice2;

import java.util.Random;
import java.util.Scanner;

public class Game {

	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();

	public static void main(String[] args) {

		oyin();
		System.out.println("Yana oynaysizmi \n 1.ha \n 2.yoq");
		int tanlov=sc.nextInt();
		switch (tanlov) {
		case 1:
			oyin();
			break;
		case 2:
			System.out.println("TAMOM");
			break;
		}

	}

	public static void oyin() {

		System.out.print("1. tosh");
		System.out.println("\n2. qaychi");
		System.out.println("3.qogoz");
		System.out.println("sonni tanlang:");
		int user = sc.nextInt();
		int comp = 1 + rn.nextInt(2);
		System.out.println("user=" + user);
		System.out.println("comp=" + comp);

		if (user == comp) {
			System.out.println("durrang");
		} else if (user == 1 && comp == 2) {
			System.out.println("user wins");
		} else if (user == 3 && comp == 2) {
			System.out.println("comp wins");
		}

	}
}
