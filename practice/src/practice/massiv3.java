package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class massiv3 {
public static void main(String[] args) {
	
			int a = 0;

			        LinkedList<Integer> linkedlist3 = new LinkedList<Integer>();
			        LinkedList<LinkedList<Integer>> linkedlist4 = new LinkedList<>();

			        LinkedList<Integer> linkedlist1 = new LinkedList<Integer>();
			        Integer[] intArray = {4, 5, 6, 7, 8, 9, 4, 5, 6, 4, 2, 9, 4,};

			        List<Integer> list = Arrays.asList(intArray);
			        linkedlist1.addAll(list);
			        System.err.println("LinkedList contains: " + linkedlist1);

			        LinkedList<Integer> linkedlist2 = new LinkedList<Integer>();
			        Integer[] intArray2 = {4, 5, 6, 45, 3, 9, 4, 0, 6, 1, 5, 7, 4, 5, 7, 56};

			        List<Integer> list2 = Arrays.asList(intArray2);
			        linkedlist2.addAll(list2);
			        System.err.println("LinkedList contains: " + linkedlist2);

			        System.out.println("\nlist1 ni uzunliki: " + linkedlist1.size());
			        System.out.println("list2 ni uzunliki: " + linkedlist2.size());

			        for (int i = 0; i < linkedlist1.size(); i++) {
			            for (int j = 0; j < linkedlist2.size(); j++) {
			                a++;
			                if (linkedlist1.get(i) == linkedlist2.get(j)) {
			                    linkedlist3.add(linkedlist1.get(i));
			                    linkedlist1.remove(i);
			                    linkedlist2.remove(j);
			                    i -= 1;
			                    break;
			                }
			            }
			        }

			        System.err.println("\nlist1 = " + linkedlist1);
			        System.err.println("list2 = " + linkedlist2);

			        Collections.sort(linkedlist3);

			        System.err.println("\n--------------------------------------------------------");

			        System.out.println("\niteratsialar soni: " + a);
			        System.out.println("list3 = " + linkedlist3);

			        linkedlist4.add(linkedlist1);
			        linkedlist4.add(linkedlist2);
			        System.out.println("\n \n " + linkedlist4);
}

}
