package practice;

import java.io.*;

public class Email {

	public static void main(String[] args) throws Exception {
		String a = "Lorem ipsum dol yusupov@gmail.com Excepteur sint occaecat cupidatat.ru non otabek@gmail.com proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		String[] b = a.split("\\s");
		for (int i = 0; i < b.length; i++) {

			if (b[i].contains("@gmail.com")) {
				System.out.println(b[i]);

			}else if(b[i].contains(".ru")){
				System.out.println(b[i]);
			}

		}

	}

}
