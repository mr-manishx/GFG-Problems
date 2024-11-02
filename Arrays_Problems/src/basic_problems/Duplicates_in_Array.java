import java.util.*;

public class Duplicates_in_Array{

    public static List<Integer> solve(int[] nums){

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> duplicatesItem = new ArrayList<>();

        // Populate the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find elements with frequency > 1
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicatesItem.add(entry.getKey());
            }
        }

        return duplicatesItem;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = solve(arr);

        ans.forEach(item->System.out.print(item+" "));

        sc.close();
    }
}