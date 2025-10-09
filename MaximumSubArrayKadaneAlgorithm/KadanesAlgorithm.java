package MaximumSubArrayKadaneAlgorithm;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        // Input: nums = [1, 2, -3]
        // Output: 6
        // Explanation: [4, -1, 2, 1] has the largest sum = 6.

        // for 1:
        // [1] sum 1 -> max 1
        // [1,2] sum 1 + 3 -> max 3
        // [1,2,-3] sum 1 + 2 + (-3) -> max  still 3

        // for 2: 
        // [2] sum 2 -> max still 3
        // [2, -3] sum 2 + (-3) -> max still 3

        // for -3:
        // [-3] sum -3 -> max still 3


        // New case 
        // -2 + 1 + 3

        // for -2:
        // [-2] sum -2 + 1 -> max -2
        // [-2, 1] sum -2 + 1 -> max -1
        // [-2,2,3 ] sum -2 + 1 + 3 -> max 2
        
        // for 1:
        // [1] sum 1 -> max still 2
        // [3] sum 1 + 3 -> max 4

        // for 3:
        // [3] sum 3 -> max still 4


        int[] numsArray = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxiumumSubArray(numsArray);

        System.out.println("result is " + result);
    }

    public static int maxiumumSubArray(int[] numsArray) {
        // maxSum will store the best (maximum) sum found so far
        int maxSum = numsArray[0];

        // currentSum will store the sum of the current subarray we are building
        int currentSum = 0;

        // Loop through each number in the array
        for (int i = 0; i < numsArray.length; i++) {
            // Add the current number to our running total
            currentSum += numsArray[i];

            // Update maxSum if currentSum is greater
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If currentSum becomes negative, we reset it to 0
            // Because a negative sum will only reduce our future sums
            if (currentSum < 0) {
                currentSum = 0;
            }

            // (Optional) Print the progress for understanding
            System.out.println("i = " + i + ", num = " + numsArray[i] + ", currentSum = " + currentSum + ",x maxSum = " + maxSum);
        }

        return maxSum;
    }
}
