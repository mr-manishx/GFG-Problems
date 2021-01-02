package basic_problems;

import java.util.Scanner;

public class Peek_Element {

	public static int solve(int[] arr) {

		int n = arr.length;

		if (n == 1) {
			return 0;
		}
		if (arr[0] >= arr[1]) {
			return 0;
		}
		if (arr[n - 1] >= arr[n - 2]) {
			return n - 1;
		}
		
		int start = 1;
		int end = n - 2;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1]) {
				return mid;
			} else if (arr[mid] > arr[mid - 1]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int index = solve(nums);
		System.out.println(index);

		sc.close();

	}

}
