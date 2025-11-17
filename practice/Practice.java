package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Practice {

    public static void main(String[] args) {
        // Input: nums = [2, 1, 5, 1, 3, 2], k = 3  
        // Output: 9  
        // Explanation: Subarray [5, 1, 3] has the largest sum = 9.
        
        

        int[] numsArray = {4, 2, 1, 7, 8, 1, 2, 8, 4};
        int k = 3;
        int result = findBestResult(numsArray, k);

        System.out.print(result + " ");
    }   

    public static int findBestResult(int[] numsArray, int k) {
        int minSum = 0;
        int left = 0;
        int currentSum = 0;

        for (int right = 0; right < numsArray.length; right++) {
            currentSum += numsArray[right];

            if(right >= k - 1){
                minSum = Math.min(minSum, currentSum);

                currentSum -= numsArray[left];

                left++;
            }
        }

        return minSum;
    }
}
