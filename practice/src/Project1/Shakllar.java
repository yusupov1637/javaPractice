package Project1;

public class Shakllar {
	static String a= "*";
	private static int N;
	public static void main(String[] args) {
		//tortburchak();
	//	uchburchak();
		printARightTriangle( N);
		
	}
//	public static void tortburchak() {
//		for (int i = 1; i <= 5; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for (int i = 1; i <= 5; i++) {
//			if(i==1 || i==5) {
//				System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//		}
//		
//		System.out.println();
//		for (int i = 1; i <= 5; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	public static void uchburchak() {
//		for (int i = 1; i <=5; i++) {
//			if(i==3) {
//				System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//		}
//		
//		for (int i = 1; i <=5; i++) {
//			if(i==2 || i==3 || i==4) {
//				System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//		}
//		for (int i = 1; i <=5; i++) {
//			
//				System.out.print("*");
//			
//				
//			}
//		}
//	
	public static String printARightTriangle(int N) {
	    StringBuilder result = new StringBuilder();
	    for (int r = 1; r <= N; r++) {
	        for (int j = 1; j <= r; j++) {
	            result.append("*");
	        }
	        result.append(System.lineSeparator());
	    }
	    return result.toString();
	}
	}
	


