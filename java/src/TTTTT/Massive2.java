package TTTTT;

public class Massive2 {
    public static void main(String [] args) {
		int numbers [] = {11, 20, 3, 15, 16, 30};
		int k=0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]%10==0) {
				k++;
				k = k * numbers[i];
		
			}
			System.out.println(k);
		}
	}
}
