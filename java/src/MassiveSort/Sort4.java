package MassiveSort;

import java.util.Scanner;

public class Sort4 {
	
	public static void main(String[] args) {
		int a[] = {21,2,12,33,11};
		int b=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
			System.out.println(a[i]);
		}
	
	}

}
