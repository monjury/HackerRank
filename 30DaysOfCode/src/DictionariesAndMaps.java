import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

public class DictionariesAndMaps {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phonebook = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			phonebook.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			Integer phone = phonebook.get(s);
			if (phone == null) {
				System.out.println("Not found");
			}
			else {
				System.out.println(s + "=" + phone);
			}
		}
		in.close();
	}
}
