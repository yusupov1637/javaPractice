package MassiveSort;

public class Sort2 {
	
	public static void main(String [] args) {
		int a[] = {12,22,2,11,33,14};
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
