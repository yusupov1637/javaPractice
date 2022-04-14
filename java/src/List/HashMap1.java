package List;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<String, String> poytaxt = new HashMap<String, String>();

		poytaxt.put("UZB", "Tashkent");
		poytaxt.put("UK", "London");
		// poytaxt.remove("UK");
		// poytaxt.clear();
		poytaxt.put("Usa", "New York");
		poytaxt.put("Qazakiston", "Almata");
		poytaxt.put("Korea", "Seul");

		for (String i : poytaxt.keySet()) {
			System.out.println(i + " " + poytaxt.get(i));
		}
		// for(String i : poytaxt.values()) {
		// System.out.println(i);
		// }

		System.out.println(poytaxt);

	}
}