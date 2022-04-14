package practice;



public class PracticeRandom1 {
	
	public static void main(String [] args) {
		
		
		int x =(int)(Math.random()*150);
		System.out.println(x);
		if(x>56 && x<70) {
			System.out.println("super kontraqtga oqishga kirdingiz");
		}if(x>70 && x<100) {
			System.out.println("kontraqt asosida oqishga kirdingiz");
		}else if(x>100) {
			System.out.println("grant asosida oqishga kirdingiz");
		}else {
			System.out.println("kira olmadingiz");
		}
	}

}
