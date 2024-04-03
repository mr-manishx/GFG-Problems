
import  java.util.*;
public class Remove_Duplicates_From_Sorted_Array{

    public static int solve(int[] nums){
        int j = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i+1];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int ans = solve(nums);

        System.out.print(ans);

        sc.close();
    }
}