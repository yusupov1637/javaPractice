package HomePratice;

public class Loop1 {
	
	public static void main(String [] args) {
		int n = 10;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 0 || i==9 || j==0) {
					System.out.println("(" + i + "," + j +")");	
				}else {
					System.out.println("     ");
				}
				System.out.println();
			}
			
		}
	}

}
