package practice2;

public class Satr18 {

	public static void main(String[] args) {
		String a = "sacd dvbfbd fdmmmmmmmm";
		String b[] = a.split(" ");
		int max = 0;
		for (int i = 0; i <= b.length; i++) {

			if (b[i].length() > max) {
				max = b[i].length();
			}
			System.out.println(b[i] + " " +max);
		}

	}

}
