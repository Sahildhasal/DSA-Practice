package MaximumSumSubArrayofSizeK;

public class BruteforceApproach {
    public static void main(String[] args) {
        // Input: nums = [2, 1, 5, 1, 3, 2], k = 3  
        // Output: 9  
        // Explanation: Subarray [5, 1, 3] has the largest sum = 9.
        
        

        int[] numsArray = {2, 1, 5, 1, 10, 2};
        int k = 3;
        int result = findBestResult(numsArray, k);

        System.out.print(result + " ");
    }   

    public static int findBestResult(int[] numsArray, int k) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= numsArray.length - k; i++) {
            int currentSum = 0;
            for (int j = i; j < i + k; j++) {
                currentSum += numsArray[j];
            }
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
