package MassiveSort;

public class Sort3 {
	
	public static void main(String[] args) {
		int a[] = {22,34,54,3,23,16};
		int b=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	 

}
