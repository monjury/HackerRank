import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem

public class ExceptionsStringToInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		try {
			int x = Integer.parseInt(s);
			System.out.println(x);
		}
		catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}
}
