package arrays;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/array-left-rotation/problem

public class LeftRotation {

	static int[] leftRotation(int[] a, int d) {
		
		d %= a.length;
		
		for (int i = 0; i < d; i++) {
			int first = a[0];
			for (int j = 0; j < a.length; j++) {

			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
