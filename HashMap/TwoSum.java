package HashMap;
import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 87, 5, 34};
        int target = 9; // <--- Stored the target in a variable for clarity
        
        // The numbers that sum to 9 are 4 and 5, at indices 1 and 2.
        int[] result = twoSumOptimized(arr, target);
        
        // --- FIX HERE: Use Arrays.toString(array) to print the array contents ---
        System.out.println("Result: " + Arrays.toString(result)); 
        // Expected Output: Result: [1, 2]
    }

    public static int[] twoSumOptimized(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            int complement = target - currentNum;

            if (numMap.containsKey(complement)) {
                // If complement is found, return the indices
                System.out.println("1: " + complement + " " + i);
                return new int[]{numMap.get(complement), i};
            }

            System.out.println("2+ " + currentNum + " " + i);
            // Store the current number and its index
            numMap.put(currentNum, i);

        }

        // Return an empty array if no solution is found (though the problem guarantees one)
        return new int[]{};
    }
}