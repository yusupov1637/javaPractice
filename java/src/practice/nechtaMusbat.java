package practice;


public class nechtaMusbat {
	private static int toq = 0;
	private static int juft = 0;

	public static void main(String[] args) {

		int massiv[] = { 12,  13, 23, 14, 45, 66, 17 };
		for (int i = 0; i < massiv.length; i++) {
			if (massiv[i] % 2 == 1) {
				toq++;
			} else {
				juft++;
			}
		}
		System.out.println("toq= " + toq + " ta");
		System.out.println(juft + " ta");
	}
}
