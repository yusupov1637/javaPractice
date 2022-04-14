package practice;

	public class lesson3 {
		private int x;
		private static int y;
		private final static int Z = 108;
		public static void main(String []args) {
			m1();
			lesson3 a1 = new lesson3();
			a1.m2();
			lesson3 a2= new lesson3();
			a2.m3(y, Z);
			System.out.println(a1.m2());
			System.out.println(a2.m3(y, Z));
		}
	
		
		public static void m1() {
			long l=100;
			System.out.println(l*3);
		}
		public int m2() {
			int a=4;
			return (x+7+a);
		}
		public int m3(int a , int b) {

			return a*b;
		}
		

	}
	


