package practice;


public class ArrayMax {
	
	public static void main(String [] args) {
		
		int array[] = {54,5,44,88,55,55,44};
		
		//int[] array1 = new int[7]; //massiv obyektini yarata
		int max = array[0];//1-elementni max deb olamiz
		for (int i = 1; i < array.length; i++) {     //for siklini 2- element bn boshlaymiz massiv uzunligigacha tekshiramiz
			if(array[i]>max) {
				max = array[i];			//shart bajarilsa max ga o'zlashtiramiz
						}
		}
		System.out.println("eng kattasi" + " "+ max);
		
	}

}
