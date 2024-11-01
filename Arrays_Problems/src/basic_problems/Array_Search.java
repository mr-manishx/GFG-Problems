package basic_problems;

import java.util.Scanner;

public class Array_Search {
	
	public static int solve(int[] arr, int k) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == k) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = solve(arr, k);
		
		System.out.println("found at index: "+ans);
		
		sc.close();

	}

}
