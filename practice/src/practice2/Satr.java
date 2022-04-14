package practice2;

public class Satr {
	public static void main(String[] args) throws Exception {
		String a = "Lorem ipsum dol yusupnaov@gmail.com axceptena sint occaecat cupidatat.ru non otabek@gmail.com proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		String[] b = a.split("\\s");
		for (int i = 0; i < b[i].length(); i++) {
			
			if(b[i].contains("na")) {
				System.out.println(b[i]);
			}



		}

	}
}
