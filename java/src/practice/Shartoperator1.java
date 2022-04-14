package practice;

public class Shartoperator1 {
	
	public static void main(String [] args) {
		String cod = "+998";
		String cod2 = "91";
		String cod3 ="425";
		int cod4 = 0;
		
		for(int i=cod4; i<10000; i++) {
			if(i<10) {
              System.out.println(cod + cod2 + cod3 + "000"+i);
			
		}
			else if(i>9 && i<100) {
			System.out.println(cod + cod2 + cod3 + "00" + i);
			
			}
			else if(i>99 && i<1000) {
			System.out.println(cod + cod2 + cod3 + "0" + i);
		}
			else if(i>999 && i<10000) {
			System.out.println(cod + cod2 + cod3 + i);
		}
		}
	}
	
	

	
}

