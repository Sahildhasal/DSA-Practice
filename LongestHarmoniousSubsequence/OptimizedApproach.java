package LongestHarmoniousSubsequence;

import java.util.HashMap;
import java.util.HashSet;

public class OptimizedApproach {
    
        
    public static void main(String[] args) {
        // We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

        // Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.

        

        // Example 1:

        // Input: nums = [1,3,2,2,5,2,3,7]

        // Output: 5

        // Explanation:

        // The longest harmonious subsequence is [3,2,2,2,3].

        // Example 2:

        // Input: nums = [1,2,3,4]

        // Output: 2

        // Explanation:

        // The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.

        // Example 3:

        // Input: nums = [1,1,1,1]

        // Output: 0

        // Explanation:

        // No harmonic subsequence exists.
         
        int[] nums = {1,3,2,2,5,2,3,7};
        
        int result = findBestResult(nums);

        System.out.print(result + " ");

    }   

    public static int findBestResult(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        int maxLength = 0;

        for(int key: hashMap.keySet()){
            if(hashMap.containsKey(key+1)){
                int length = hashMap.get(key) + hashMap.get(key + 1);
                maxLength = Math.max(length, maxLength);
            }
        }

        return maxLength;
    }


}
