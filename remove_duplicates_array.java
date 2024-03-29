package hackerblocks1;

import java.util.Arrays;

public class remove_duplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 5, 5 };
		Arrays.parallelSort(arr);
		int n = arr.length;
		n = removeduplicates(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int removeduplicates(int[] arr, int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}
}
