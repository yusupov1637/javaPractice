package Project1;

public class Uchburchak {
//	private static int N=5;

	    public static void main(String[] args) {
	        printAnIsoscelesTriangle(5);
	    }
	    public static String printAnIsoscelesTriangle(int N) {
	    StringBuilder result = new StringBuilder();
	    for (int r = 1; r <= N; r++) {
	        for (int sp = 1; sp <= N - r; sp++) {
	            result.append(" ");
	        }
	        for (int c = 1; c <= (r * 2) - 1; c++) {
	            result.append("*");
	        //    System.out.print(result);
	        }
	        result.append(System.lineSeparator());
	    }
	    return result.toString();
	}
	}


