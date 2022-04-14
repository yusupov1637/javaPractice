package practice2;

import java.util.Scanner;

public class Satr17 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("matnni kiriting");
		String a=sc.nextLine();
	
	//	String a = "uzb fdvujysvbj  jkfnkjndkfjjfjnjfdv adahvn j njdnkjna dfvfhjvbjhvbw";
		String[] b=a.split(" ");
		String max=b[0];
		for (int i = 1; i < b.length; i++) {
			if(b[i].length()>max.length()) {
				max=b[i];
			}
			
		}
		System.out.println(max);
	}

}
