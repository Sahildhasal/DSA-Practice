package MinimumSizeSubarraysum;

public class OptimizedApproachSlidingWindow {
    
    public static void main(String[] args) {
        // Input:
        // target = 7, nums = [2,3,1,2,4,3]
        // Output:
        // 2
        // Explanation:
        // The subarray [4,3] has the minimal length of 2.


        // target = 11, nums = [1,1,1,1,1,1,1,1]
        // Output:
        // 0
        // Explanation:
        // No subarray has a sum ≥ 11.

        // Input:
        // target = 15, nums = [1,2,3,4,5]
        // Output:
        // 5
        // Explanation:
        // Entire array sums to 15 → length = 5.

        int[] numsArray = {2,3,1,2,4,3};

        int target = 7;

        int result = findMinSubArrayLen(numsArray, target);

        System.out.print(result + " ");
    }   

    public static int findMinSubArrayLen(int[] numsArray, int target) {
        int left = 0, sum = 0, minLength = Integer.MAX_VALUE;

        for (int right = 0; right < numsArray.length; right++) {
            sum += numsArray[right];

            // Shrink window as small as possible while sum >= target
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= numsArray[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }   
}
