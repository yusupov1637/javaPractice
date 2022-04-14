package TTTTT;

import java.util.Scanner;



public class Person {
    private static String loyihaKiritish;
    private String name;
    private String surname;
   
    private String age;
    private String bankCard;
    private String jobPosition;
    
    public static Scanner sc = new Scanner(System.in);
    public static void MenuChiqarish() {
    	System.out.println("1. Xodim kiriting");
    	System.out.println("2. loyiha kiritish");
    	System.out.println("3. chop qilish");
		
	}
    public static void setloyihaKiritish(String message) {
    	loyihaKiritish = message;
    }
    public static String getloyihaKiritish() {
    	return loyihaKiritish;
    }
    public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}


}


