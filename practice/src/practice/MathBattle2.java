package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MathBattle2 {
	
	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		Scanner sc = new Scanner(System.in);
		int x=(int)(Math.random()*10);
		int y=(int)(Math.random()*10);
		System.out.println(x);
		System.out.println(y);
		map.put(1,x*y);
	
		map.put(2,x+y);
		map.put(3,x-y);
		map.put(4,x/y);
		int a=sc.nextInt();
		for (Integer i :map.keySet()) {
			if(a==map.get(i)) {
				System.out.println("togri");
			}else {
				System.out.println("xato");
			}
		}
		
		
	}

	

	
	

}
