package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

	static boolean yakunlash = true;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {

		System.out.println("menyuni son orqali tanlang");
		System.out.println(" 1. hodim qoshish");
		System.out.println(" 0. tizimdan ciqish");

		int tanlov = sc.nextInt();
		switch (tanlov) {
		case 1:
			Hodimkiritish();
			break;

		case 0:
			yakunlash = false;
			break;
		default:
			System.out.println("hato");
			m1();
			break;
		}

	}

	private static void Hodimkiritish() {
		List<String> list = new ArrayList<String>();
		System.out.println("ismingizni kiriting");
		String ism = sc.nextLine();
		list.add(ism);
		System.out.println("familiyangizni kiriting");
		String familya = sc.nextLine();
		list.add(familya);
		System.out.println("telefon raqamingizni kiriting");
		String telRaqam = sc.nextLine();
		list.add(telRaqam);
		System.out.println("manzilingizni kiriting");
		String manzil = sc.nextLine();
		list.add(manzil);

		System.out.println("yana kiritasizmi");
		System.out.println("1.ha" + " " + "2.yoq");
		int tanlov = sc.nextInt();
		switch (tanlov) {
		case 1:
			Hodimkiritish();
		case 2:
			System.out.println(list);
		}

	}

}
