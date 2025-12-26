package SquaresOfSortedArrayAgain;

import java.util.ArrayList;
import java.util.HashMap;

public class BruteForceApproach {
    
           public static void main(String[] args) {

            // Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

            // Example 1:
            
            // Input: nums = [-4,-1,0,3,10]
            // Output: [0,1,9,16,100]
            // Explanation: After squaring, the array becomes [16,1,0,9,100].
            // After sorting, it becomes [0,1,9,16,100].
            // Example 2:
            
            // Input: nums = [-7,-3,2,3,11]
            //49 9 4 9 121
            //9 49 4 9 121
            // Output: [4,9,9,49,121]
             
            int[] nums = {-7,-3,2,3,11};
                
            int[] result = findBestResult(nums);

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }   
        public static int[] findBestResult(int[] nums) {
            int[] result = new int[nums.length];
            int left = 0;
            int right = nums.length - 1;
            int index = nums.length - 1;

            while(left <= right){
                int leftSquare = nums[left] * nums[left];
                int rightSquare = nums[right] * nums[right];

                if(leftSquare > rightSquare){
                    result[index] = leftSquare;
                    left++;
                }
                else {
                    result[index] = rightSquare;
                    right--;
                }
                index--;
            }

            return result;
        }


}
