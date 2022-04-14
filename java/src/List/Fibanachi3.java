package List;

import java.util.Scanner;

public class Fibanachi3 {
	//0-f1,1-f2,1-f3,2,3,5,8,13,21,34,55,89,
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f1=0;
        int f2=1;
        int f3=1;
        System.out.print(f1+","+f2+","); //fibanachini 1 chi va 2 chisini ekranga chiqardm;
        for (int i=2;i<n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(f3+",");
        }
	}

}