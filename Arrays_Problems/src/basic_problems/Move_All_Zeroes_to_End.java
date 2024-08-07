package basic_problems;

import java.util.Scanner;

public class Move_All_Zeroes_to_End {
	
	public static int[] solve(int[] nums) {
		
		int j = 0; 
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0 && nums[j] == 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
			if(nums[j] != 0) {
				j++;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int[] temp = solve(nums);
		
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
		sc.close();
	}

}
