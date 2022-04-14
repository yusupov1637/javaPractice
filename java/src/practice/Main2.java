package practice;

import java.util.Scanner;

public class Main2 {

	boolean yakunlash = true;
	static Scanner sc = new Scanner(System.in);
	private static Person p;

	public static void main(String[] args) {
		Person person;
		while (true) {
			int number = menu();
			switch (number) {
			
			case 1: insertPersonData();
			System.out.println("ism kiriting");
			p.setName(sc.nextLine());
			break;
			case 2: insertProjectData();
			break;
			case 3: showPersonData();
			break;
			case 0: System.exit(-1);

			}
		}

	}

	private static int menu() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void showPersonData() {
		// TODO Auto-generated method stub
		
	}

	private static void insertProjectData() {
		// TODO Auto-generated method stub
		
	}

	private static void insertPersonData() {
		// TODO Auto-generated method stub
        		
		
		
	}
}