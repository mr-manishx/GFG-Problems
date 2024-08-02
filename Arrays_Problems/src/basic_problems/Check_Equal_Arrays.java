package basic_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Equal_Arrays {
	
	public static boolean solve(int[] arr1, int[] arr2) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[n];
		for(int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		boolean isTrue = solve(arr1, arr2);
		System.out.println(isTrue);
		
		sc.close();
	}

}
