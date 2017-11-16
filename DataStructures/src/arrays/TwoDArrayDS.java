package arrays;

import java.util.Scanner;

public class TwoDArrayDS {

	private static final int HOURGLASS_WIDTH = 3;
	private static final int HOURGLASS_HEIGHT = 3;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int arr_i = 0; arr_i < 6; arr_i++) {
			for (int arr_j = 0; arr_j < 6; arr_j++) {
				arr[arr_i][arr_j] = in.nextInt();
			}
		}
		in.close();
		int maxSum = getMaxSum(arr);
		System.out.println(maxSum);
	}

	private static int getMaxSum(int[][] arr) {

		if (arr == null || arr.length < HOURGLASS_HEIGHT || arr[0].length < HOURGLASS_WIDTH) {
			return 0;
		}
		int totalRow = arr.length;
		int totalCol = arr[0].length;
		int maxSum = Integer.MIN_VALUE;
		
		for (int row = 0; row <= totalRow - HOURGLASS_HEIGHT; row++) {
			for (int col = 0; col <= totalCol - HOURGLASS_WIDTH; col++) {
				int sum = getHourglassSum(arr, row, col);
				if (maxSum < sum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}

	private static int getHourglassSum(int[][] arr, int row, int col) {

		int topRow = arr[row][col] + arr[row][col + 1] + arr[row][col + 2];
		int midRow = arr[row + 1][col+1];
		int bottomRow = arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
		return topRow + midRow + bottomRow;
	}
}
