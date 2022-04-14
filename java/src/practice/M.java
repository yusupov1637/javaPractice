package practice;

public class M {
	
	public static void main(String [] args) {
		
		ArifmetikAmallar l = new Qoshish(22 , 12);
		ArifmetikAmallar c = new Ayirish(21 ,13);
		ArifmetikAmallar d = new Bolish(14 ,2);
		ArifmetikAmallar f = new Kopaytirish(3,4);
		
		ArifmetikAmallar [] massiv = {l, c, d, f};
		double a=0;
		for (int i = 0; i < massiv.length; i++) {
			a = a + massiv[i].amallar();
		}
		double ortachaQiymat = a/massiv.length;
		System.out.println(ortachaQiymat);
		
	}

}
