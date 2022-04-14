package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Massiv {

	public static void main(String[] args) {
		int[] a = { 12, 22, 11, 1, 6, 8 };
		int[] b = { 6, 12, 10, 31, 1, 3, 8 };
		LinkedList list = new LinkedList();
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				count++;
				if (a[i] == b[j]) {
					list.add(a[i]);
					
                   
					break;
				}
			}
		
		}
		System.out.println(list);
		System.out.println(count);

	}

}
