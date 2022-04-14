package MiniStore;

import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<Product> selectedSection;
	private static Scanner sc = new Scanner(System.in);
	private static DataBase database = new DataBase();
	private static int xatoSection = 0;
	private static int xatoMaxsulot = 0;
	
	public static void main(String[] args) {

		System.out.println("Menu bilan tanishing:\n\nKerakli bo'lim xos raqamini bosing.");
		System.out.println("\n1 - Mevalar.\n2 - Sabzavotlar.\n3 - Ichimliklar.\n4 - Kitoblar.\n");
		tanlashSection();

	}

	private static void tanlashSection() {
		int userInput = sc.nextInt();

		switch (userInput) {
		case 1:
			selectedSection = database.getMevalar();
			selectMaxsulot();
			break;
		case 2:
			selectedSection = database.getSabzavotlar();
			selectMaxsulot();
			break;
		case 3:
			selectedSection = database.getIchimliklar();
			selectMaxsulot();
			break;
		case 4:
			selectedSection = database.getKitoblar();
			selectMaxsulot();
			break;
		default:
			xatoSection++;

			if (xatoSection < 3) {
				System.out.println("Iltimos yana bir marta urining :(\n1-4 oraliqdagi sonlarni kiriting!");
				tanlashSection();
			}else{
				System.out.println("Tugadi :)");
			}
		}
	}

	private static void selectMaxsulot() {

		System.out.println("\nKerakli maxsulotni tanlang:\n");

		int counter = 1;
		for (Product maxsulot : selectedSection) {
			System.out.println(counter + " - " + maxsulot.toString());
			counter++;
		}

		System.out.println();
		int userInputProduct = sc.nextInt();
		System.out.println();
		
		if(xatoMaxsulot < 3){
		
		if (userInputProduct <= selectedSection.size()) {
			Product selectedProduct = selectedSection.get(userInputProduct - 1);
			System.out.println(selectedProduct.getNomi() + " " + selectedProduct.getPuli() + " so'mga sotib olindi.");
		} else {
			System.out.println("Noto`g`ri raqam kiritildi.\nYana bir marta urinib ko'ring.");
			xatoMaxsulot++;
			selectMaxsulot();
		}
		}else{
			System.out.println("Buguna yetadi sanga");
		}
	}
}
