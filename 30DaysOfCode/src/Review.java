import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-review-loop/problem

public class Review {

	public static void main(String[] args) {
		List<String> input = processInput();
		printFormattedStrings(input);
	}

	private static void printFormattedStrings(List<String> input) {
		for (String i : input) {
			String formattedString = getFormattedString(i);
			System.out.println(formattedString);
		}
	}

	private static String getFormattedString(String str) {
		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				even.append(str.charAt(i));
			}
			else {
				odd.append(str.charAt(i));
			}
		}
		return even.toString() + " " + odd.toString();
	}

	private static List<String> processInput() {
		List<String> input = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String str = in.next();
			input.add(str);
		}
		in.close();
		return input;
	}
}
