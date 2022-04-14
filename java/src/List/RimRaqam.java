package List;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RimRaqam {

	public static String convertIntegerToRomam(int num) {

		Map<String, Integer> mp = new LinkedHashMap<>();
		mp.put("ming", 1000);
		mp.put("toqqizyuz", 900);
		mp.put("beshyuz", 500);
		mp.put("tortyuz", 400);
		mp.put("yuz", 100);
		mp.put("to'qson", 90);
		mp.put("ellik", 50);
		mp.put("qirq", 40);
		mp.put("o'n", 10);
		mp.put("to'qqiz", 9);
		mp.put("besh", 5);
		mp.put("tort", 4);
		mp.put("bir", 1);

		StringBuilder sb = new StringBuilder();

		for (Map.Entry<String, Integer> entry : mp.entrySet()) {

			while (num >= entry.getValue()) {
				num = num - entry.getValue();
				sb.append(entry.getKey());

			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.println("son kirit - ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String result = convertIntegerToRomam(num);
		System.out.println(result);
	}
}
