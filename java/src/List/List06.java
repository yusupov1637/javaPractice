package List;

import java.util.LinkedList;
import java.util.List;

public class List06 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();

		String a = "Youcanyaun";
		String[] b = a.split("");

		/*
		 * for (int i = 0; i < b.length; i++) { System.out.println(b[i]); }
		 */

		for (int i = 0; i < b.length; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (b[i].equalsIgnoreCase(b[j])) {
					count++;
				}
			}
			if (count <= 0) {
				continue;
			} else {
				list.add(b[i]);
			}
			System.out.println(b[i] + count);
		}
		

	}

}
