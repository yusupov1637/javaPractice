package List;

import java.util.ArrayList;
import java.util.List;

public class List07 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String text = "sdsaasd sfdfdffe";
		String arr[] = text.split("");
		for (int i = 0; i < text.length(); i++) {
			boolean isFound = false;

			for (int j = 0; j < list.size(); j++) {
				if (arr[i].equalsIgnoreCase(list.get(j))) {
					isFound = true;
					break;
				}
				if (!isFound) {
					list.add(arr[i]);
				}
			}

		}

		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (list.get(i).equalsIgnoreCase(arr[j])) {
					count++;
				}
				System.out.println(list.get(i) + " " + count);
			}
		}

	}

}
