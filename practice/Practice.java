package practice;

public class Practice {

    public static void main(String[] args) {
        // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        // Output: 6
        // Explanation: [4, -1, 2, 1] has the largest sum = 6.
        int[] numsArray = {-2,1,-3,4,-1,2,1,-5,4};

        int result = findBestResult(numsArray);
        System.out.println("result is " + result);
    }

    public static int findBestResult(int[] numsArray) { 
        int globalMaxSum = numsArray[0];
        int currentMaxSum = numsArray[0];

        for (int i = 0; i < numsArray.length; i++) {
            currentMaxSum = Math.max(numsArray[i], numsArray[i] + currentMaxSum);

            globalMaxSum = Math.max(currentMaxSum, globalMaxSum);
        }
       return globalMaxSum;
    }
}
