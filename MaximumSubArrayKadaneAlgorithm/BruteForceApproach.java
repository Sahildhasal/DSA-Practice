package MaximumSubArrayKadaneAlgorithm;

public class BruteForceApproach {
    public static void main(String[] args) {
        // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        // Output: 6
        // Explanation: [4, -1, 2, 1] has the largest sum = 6.

        int[] numsArray = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxiumumSubArray(numsArray);

        System.out.println("result is " + result );
    }

    public static int maxiumumSubArray(int[] numsArray){
       int maxSum = Integer.MIN_VALUE;

       for (int i = 0; i < numsArray.length; i++) {
        int currentSum = 0;
        for (int j = i; j < numsArray.length; j++) {
          currentSum += numsArray[j];
          
          maxSum = Math.max(maxSum, currentSum);
        } 
       }

       return maxSum;
    }
}
