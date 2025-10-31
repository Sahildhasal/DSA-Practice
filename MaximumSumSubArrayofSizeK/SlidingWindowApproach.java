package MaximumSumSubArrayofSizeK;

public class SlidingWindowApproach {
    public static void main(String[] args) {
        // Input: nums = [2, 1, 5, 1, 3, 2], k = 3  
        // Output: 9  
        // Explanation: Subarray [5, 1, 3] has the largest sum = 9.
        
        

        int[] numsArray = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = findBestResult(numsArray, k);

        System.out.print(result + " ");
    }   

    public static int findBestResult(int[] numsArray, int k) {
        int maxSum = 0;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += numsArray[i];
        }

        maxSum = windowSum;

        for (int i = k; i < numsArray.length; i++) {
            windowSum += numsArray[i] - numsArray[i - k];
            maxSum = Math.max(maxSum, windowSum);   
        }

        return maxSum;
    }
}
