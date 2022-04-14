package Market2;

import java.util.List;
import java.util.Scanner;

import MiniStore.Product;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static DataBase database = new DataBase();
	private static List<Products> selectedSection;
	private static int xatoSection = 0;
	private static int xatoMaxsulot = 0;

	public static void main(String[] args) {

		System.out.println("Menyuni son orqali tanlang: ");
		System.out.println("1. Mevalar");
		System.out.println("2. Ichimliklar");
		System.out.println("3. Sabzavotlar");
		BolimTanlash();

	}

	public static void BolimTanlash() {
		int tanlov = sc.nextInt();
		switch (tanlov) {
		case 1:
			selectedSection=database.getMevalar();
			selectMaxsulot();
			break;
		case 2:
			selectedSection=database.getIchimliklar();
			selectMaxsulot();
			break;
		case 3:
			selectedSection=database.getSabzavotlar();
			selectMaxsulot();
			break;

		default:
			xatoSection++;

			if (xatoSection > 3) {
				System.out.println("Iltimos yana bir marta urining :(\n1-4 oraliqdagi sonlarni kiriting!");
				selectMaxsulot();
			} else {
				System.out.println("Tugadi :)");
			}
		}

	}

	private static void selectMaxsulot() {

		System.out.println("\nKerakli maxsulotni tanlang:\n");

		int counter = 1;
		for (Products maxsulot : selectedSection) {
			System.out.println(counter + " - " + maxsulot.toString());
			counter++;
		}

		System.out.println();
		int userInputProduct = sc.nextInt();
		System.out.println();

		if (xatoMaxsulot < 3) {

			if (userInputProduct <= selectedSection.size()) {
				Products selectedProduct = selectedSection.get(userInputProduct - 1);
				System.out.println(
						selectedProduct.getName() + " " + selectedProduct.getPrice() + " so'mga sotib olindi.");
			} else {
				System.out.println("Noto`g`ri raqam kiritildi.\nYana bir marta urinib ko'ring.");
				xatoMaxsulot++;
				selectMaxsulot();
			}
		} else {
			System.out.println("Buguna yetadi sanga");
		}
	}
}
