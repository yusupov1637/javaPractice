package TTTTT;

public class Massive1 {

	public static void main(String[] args) {
		int number[] = { 11, 10, 12, 15, 20 };
		int k = 0;
		int y = 0;
		for (int i = 0; i < number.length; i++) {

			if (number[i] % 2 == 0) {
				k++;
				y = y + number[i];
				// System.out.println(y);
			}

		}
		System.out.println(y / k);

	}

}
