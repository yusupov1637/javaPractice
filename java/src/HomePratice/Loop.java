package HomePratice;

public class Loop {

	public static void main(String[] args) {

		int n = 10;
		double y = 0;

		for (int i = 1; i < n; i++) {

			y += 1 / i;
		}

		// System.out.println(y);
		// int n = 7;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// System.out.println("*_*");
			}
			// System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 5 || j == 0) {
					// System.out.println("(" + i + " , " + j + ")");
				}

			}
			// System.out.println();

		}
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == 0 || i==9 || j==0) {
					System.out.println("(" + i + "," + j +")");	
				}
				System.out.println();
			}
			
		}

	}
}