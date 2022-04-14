package practice;

public class Array1 {
	public static void main(String [] args) {
		int array[] = {12,22,58,1,4,14,42};
		int y = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<15) {
				y = y + array[i];
			}
		}
		System.out.println("15 dan kichiklar yig'indisi"+ " " + y);
			
	}

}
