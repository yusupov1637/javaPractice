package practice2;

public class Unli {
	
	public static void main(String[] args) {
		String a =  "Aecafdev fb actcterw utre";
		String b[] =a.split("");
		//System.out.println(b[1]);
		int count=0;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			if(b[i].equalsIgnoreCase("a")) {
				count++;
			}
		}
		System.out.println(" "+count);

	}

}
