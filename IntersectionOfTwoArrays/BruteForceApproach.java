package IntersectionOfTwoArrays;

import java.util.HashSet;

public class BruteForceApproach {

    public static void main(String[] args) {

        // Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result
        //  must be unique and you may return the result in any order.

        
        // Example 1:
        
        // Input: nums1 = [1,2,2,1], nums2 = [2,2]
        // Output: [2]
        // Example 2:
        
        // Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        // Output: [9,4]
        // Explanation: [4,9] is also accepted.
             
            int[] nums1 = {1,2,2,1};
            int[] nums2 = {2,2};
                
            int[] result = findBestResult(nums1, nums2);

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            
        }   
    
        public static int[] findBestResult(int[] nums1, int[] nums2) {
            HashSet<Integer> hashSet = new HashSet();
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if(nums1[i] == nums2[j]){
                        hashSet.add(nums1[i]);
                    }
                }
            }
            
            int[] tempArray = new int[hashSet.size()];
            
            int count = 0;
            for (int i : hashSet) {
                tempArray[count++] = i;
            }

            return tempArray;
        }
    
    
}
