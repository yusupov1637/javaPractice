package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Massiv1 {

	public static void main(String[] args) {
		LinkedList<Integer> linkedlistA = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		int count=0;

		Integer[] array = { 12, 22, 11, 1, 6, 8  };

		List<Integer> list = Arrays.asList(array);

		linkedlist.addAll(list);

		System.out.println(linkedlist);
		
		LinkedList<Integer> linkedlist2 = new LinkedList<Integer>();
		
		Integer[] array2 = {6, 12, 10, 31, 1, 3, 8 };
		
		List<Integer> list2=Arrays.asList(array2);
		
		linkedlist2.addAll(list2);
		System.out.println(linkedlist2);
				
		for (int i = 0; i < linkedlist.size(); i++) {
			for (int j = 0; j < linkedlist2.size(); j++) {
				count++;
				if(linkedlist.get(i)==linkedlist2.get(j)) {
					linkedlistA.add(linkedlist.get(i));
					linkedlist.remove(i);
					linkedlist2.remove(j);
					i-=1;
					break;
				}
			}
			
		}
		System.out.println(linkedlistA);
		System.out.println("iteratsiyalar soni"+count);

	}

}
