package basic_problems;

import java.util.Scanner;

public class Larget_Element_in_Array {
	
	public static int solve(int[] nums) {
		
		int maxi = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > maxi) {
				maxi = nums[i];
			}
		}
		return maxi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int ans = solve(nums);
		System.out.println(ans);
		
		sc.close();

	}

}
