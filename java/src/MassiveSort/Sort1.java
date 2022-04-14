package MassiveSort;


public class Sort1 {

	static int a[] = { 12, 32,3, 42, 2, 4 };
	static int b = 0;

	public static void main(String[] args) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
