package practice;

public class Array3 {
	public static void main(String [] args) {
		int a[] = {11,25,45,4,5,84,44,55,2};
		//int min = 4;
		int y=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>15) {
				y = y+a[i];
			}
			
			
		}
		System.out.println(y);
	}


}
