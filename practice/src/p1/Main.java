package p1;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public Person person= new Person();
	
	public static void main(String[] args) {
		
	System.out.println("1. Yangi Hodim kiritish");
	System.out.println(" 2. tizimdan ciqish");
	int tanlov=sc.nextInt();
	
	switch (tanlov) {
	case 1:
		HodimKiritish();
	case 2:
		System.out.println("tamom");


	}
	

}
	public static void HodimKiritish() {
		
	}
	
}
