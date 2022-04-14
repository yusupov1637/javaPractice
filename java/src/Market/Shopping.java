package Market;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Shopping {
	static double a = 0;
	static Scanner sc = new Scanner(System.in);
	static boolean isShoppingGoingOn = true;

	public static void main(String[] args) {
		bolimTanlash();

	}

	public static void Meva() {
		System.out.println("Qaysi mahsulotni tanlaysiz");
		HashMap<Integer, Integer> mevalarSumma = new HashMap<Integer, Integer>();
		mevalarSumma.put(1, 18000);
		mevalarSumma.put(2, 10000);
		mevalarSumma.put(3, 800);
		HashMap<Integer, String> mevalar = new HashMap<Integer, String>();
		mevalar.put(1, "banan");
		mevalar.put(2, "limon");
		mevalar.put(3, "kiwi");
		for (Integer i : mevalar.keySet()) {
			System.out.println(i + ". " + mevalar.get(i) + " " + mevalarSumma.get(i) + " summ");

		}
		int tanlov = sc.nextInt();
		switch (tanlov) {
		case 1:
			System.out.println("1. " + mevalar.get(1) + " " + mevalarSumma.get(1) + " summ");
//			mevalar.get(1);
			break;
		case 2:
			System.out.println("2. " + mevalar.get(2) + " " + mevalarSumma.get(2) + " summ");
			break;
		case 3:
			System.out.println("3. " + mevalar.get(3) + " " + mevalarSumma.get(3) + " summ");
			break;

		}
		System.out.println("yana davom ettirasizmi?\n1 - Ha\n0 - Yo'q");
		int davomEttirish = sc.nextInt();
		if (davomEttirish == 0) {
			isShoppingGoingOn = false;

		} else {
			bolimTanlash();

		}

	}

	public static void Gosht() {
		System.out.println("Qaysi mahsulotni tanlaysiz");
		HashMap<Integer, Integer> goshtSumma = new HashMap<Integer, Integer>();
		goshtSumma.put(1, 18000);
		goshtSumma.put(2, 30000);
		goshtSumma.put(3, 800);
		HashMap<Integer, String> gosht = new HashMap<Integer, String>();
		gosht.put(1, "mol goshti");
		gosht.put(2, "qoy goshti");
		gosht.put(3, "baliq");
		for (Integer i : gosht.keySet()) {
			System.out.println(i + ". " + gosht.get(i) + " " + goshtSumma.get(i) + " summ");

		}
		int tanlov = sc.nextInt();
		switch (tanlov) {
		case 1:
			System.out.println("1. " + gosht.get(1) + " " + goshtSumma.get(1) + " summ");
//			
			break;
		case 2:
			System.out.println("2. " + gosht.get(2) + " " + goshtSumma.get(2) + " summ");
			break;
		case 3:
			System.out.println("3. " + gosht.get(3) + " " + goshtSumma.get(3) + " summ");
			break;

		}

		System.out.println("yana davom ettirasizmi?\n1 - Ha\n0 - Yo'q");
		int davomEttirish = sc.nextInt();
		if (davomEttirish == 0) {
			isShoppingGoingOn = false;

		} else {

			bolimTanlash();

		}

	}

	public static void bolimTanlash() {

		System.out.println("salom Xush kelibsiz");
		System.out.println("1. mevalar");
		System.out.println("2.gosht mahsulotlari");

		while (isShoppingGoingOn) {
			int tanlov = sc.nextInt();
			switch (tanlov) {
			case 1:
				Meva();
				break;
			case 2:
				Gosht();
				break;

			}

		}

	}
}
