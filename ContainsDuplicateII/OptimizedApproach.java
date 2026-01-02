package ContainsDuplicateII;

import java.util.HashMap;

public class OptimizedApproach {
    
    public static void main(String[] args) {
        // Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

        // Example 1:
        
        // Input: nums = [1,2,3,1], k = 3
        // Output: true
        // Example 2:
        
        // Input: nums = [1,0,1,1], k = 1
        // Output: true
        // Example 3:
        
        // Input: nums = [1,2,3,1,2,3], k = 2
        //1 1  ->  0 3 -> 3-0 -> 3 -> false
        //2 2  ->  1 4 -> 4-1 -> 3 -> false
        //3 3  ->  2 5 -> 5-2 -> 3 -> false
        
        // Output: false
         
        int[] nums = {99,99};
        int k = 2; 
        
        boolean result = findBestResult(nums, k);

        System.out.print(result + " ");

    }   

    public static boolean findBestResult(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Key: number, Value: most recent index

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            // 1. Check if the current number is ALREADY in the map
            if (map.containsKey(currentNum)) {
                
                // Get the index of its previous occurrence
                int previousIndex = map.get(currentNum);
                int difference = i - previousIndex;

                // 2. CRITICAL FIX: Check if the distance is LESS THAN OR EQUAL TO k
                if (difference <= k) {
                    return true;
                }
                
                // If the difference is > k, we don't return true, but we still need to
                // update the map with the NEWEST index (i) for future checks.
            }
            
            // 3. Update the map with the current number and its NEWEST index (i)
            // This happens on every iteration, whether it was a new number or an old one 
            // whose previous index was too far away.
            map.put(currentNum, i);
        }

        return false;
    }


}
