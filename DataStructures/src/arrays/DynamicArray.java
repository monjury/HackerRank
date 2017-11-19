package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/dynamic-array/problem

public class DynamicArray {

	private List<List<Integer>> seqList;
	private int lastAnswer;
	private int n;

	public DynamicArray(List<List<Integer>> seqList) {
		this.seqList = seqList;
		n = (seqList == null) ? 0 : seqList.size();
		lastAnswer = 0;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		List<List<Integer>> seqList = initSeqList(n);
		DynamicArray da = new DynamicArray(seqList);
		for (int i = 0; i < q; i++) {
			int query = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			if (query == 1) {
				da.executeFirstQuery(x, y);
			}
			else {
				da.executeSecondQuery(x, y);
			}
		}
		in.close();
	}

	private static List<List<Integer>> initSeqList(int n) {
		List<List<Integer>> seqList = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			seqList.add(new ArrayList<Integer>());
		}
		return seqList;
	}

	private void executeFirstQuery(int x, int y) {
		List<Integer> seq = getSeq(x, lastAnswer, n);
		seq.add(y);
	}

	private void executeSecondQuery(int x, int y) {
		List<Integer> seq = getSeq(x, lastAnswer, n);
		int size = seq.size();
		lastAnswer = y % size;
		System.out.println(lastAnswer);
	}

	private List<Integer> getSeq(int x, int lastAnswer, int n) {
		int index = getIndex(x, lastAnswer, n);
		List<Integer> seq = seqList.get(index);
		if (seq == null) {
			seq = new ArrayList<Integer>();
		}
		return seq;
	}

	private int getIndex(int x, int lastAnswer, int n) {
		return (x ^ lastAnswer) % n;
	}
}
