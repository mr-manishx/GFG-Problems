import java.util.*;
public class Two_Sum{

    public static List<Integer> solve(int[] nums, int target){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int remaining = target - nums[i];
            if(frequencyMap.containsKey(remaining)){
                return Arrays.asList(frequencyMap.get(remaining), i);
            }
            frequencyMap.put(nums[i], i);
        }
        return Arrays.asList();
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        List<Integer> ans = solve(nums, target);

        System.out.print(ans);

        sc.close();
    }
}