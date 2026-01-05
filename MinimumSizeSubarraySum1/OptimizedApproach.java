package MinimumSizeSubarraySum1;

public class OptimizedApproach {
    
       public static void main(String[] args) {
    //    Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

        // Example 1:

        // Input: target = 7, nums = [2,3,1,2,4,3]
        // Output: 2
        // Explanation: The subarray [4,3] has the minimal length under the problem constraint.
        // Example 2:

        // Input: target = 4, nums = [1,4,4]
        // Output: 1
        // Example 3:

        // Input: target = 11, nums = [1,1,1,1,1,1,1,1]
        // Output: 0 

        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        
        int result = findBestResult(nums, target);

        // for (int i : result) {
            System.out.print(result + " ");   
        // }

    }   

    public static int findBestResult(int[] nums, int target) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while(sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

}



// Related Problems (Next Practice)

// You’re following the perfect order:

// Maximum Average Subarray I ✅

// Contains Duplicate II ✅

// Longest Harmonious Subsequence ✅

// Minimum Size Subarray Sum ✅ ← current

// Longest Substring Without Repeating Characters (next)