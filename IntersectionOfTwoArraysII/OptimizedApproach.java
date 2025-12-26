package IntersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;

public class OptimizedApproach {

       public static void main(String[] args) {

        // Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

        // Example 1:
        
        // Input: nums1 = [1,2,2,1], nums2 = [2,2]
        // Output: [2,2]
        // Example 2:
        
        // Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        // Output: [4,9]
        // Explanation: [9,4] is also accepted.
             
            int[] nums1 = {4,9,5};
            int[] nums2 = {9,4,9,8,4};
                
            int[] result = findBestResult(nums1, nums2);

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }   
        public static int[] findBestResult(int[] nums1, int[] nums2) {

            HashMap<Integer, Integer> hashMap = new HashMap<>();

            for (int i = 0; i < nums1.length; i++) {
                hashMap.put(nums1[i], hashMap.getOrDefault(nums1[i],0) + 1);
            }

            ArrayList<Integer> arrayList = new ArrayList<>();

            for (Integer i : nums2) {
                if(hashMap.containsKey(i) && hashMap.get(i) > 0){
                    arrayList.add(i);
                    hashMap.put(i, hashMap.getOrDefault(i,0) - 1);
                }
            }


            int[] tempArr = new int[arrayList.size()];
            int index = 0;
            for (int i : arrayList) {
                tempArr[index++] = i;
            }

            return tempArr;
        }

}
