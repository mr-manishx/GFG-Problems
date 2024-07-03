import java.util.*;

public class Reverse_Array_in_Groups{

    public static void printArray(ArrayList<Integer> nums){
        for(int i = 0; i < nums.size(); i++){
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();
    }+
    public static void reverseArray(ArrayList<Integer> nums, int k){

        int n = nums.size();

        for(int i = 0; i < n; i += k){
            int end = Math.min(i+k-1, n-1);
            Collections.reverse(nums.subList(i, end+1));
        }
    }
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            nums.add(sc.nextInt());
        }
        printArray(nums);
        System.out.println("Output here....");
        reverseArray(nums, k);
        printArray(nums);
    }
}