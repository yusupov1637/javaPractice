package List;

public class FibanachiSonlari {
	
	static int fib(int n) {
		
		if(n<=1) 
			return n;	
			return (fib(n-2) + fib(n-1));
		
	}
	
	public static void main(String [] args) {
		
		int n=3;
		System.out.println(fib(n));

}
}
