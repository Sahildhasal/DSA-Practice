package TwoSumAgain;

import java.util.HashMap;

public class HashMapApproach {
    public static void main(String[] args) {
        // Input: nums = [2,7,11,15], target = 9  
        // Output: [0,1]  
        // Explanation: nums[0] + nums[1] = 2 + 7 = 9
        

        int[] numsArray = {2,7,11,15};
        int target = 9;
        int[] result = findBestResult(numsArray, target);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }   

    public static int[] findBestResult(int[] numsArray, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < numsArray.length; i++) {
            int currentNum = numsArray[i];

            int complement = target - currentNum;

            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), i};
            }

            hashMap.put(currentNum, i);

        }


        return new int[]{-1, -1};
    }
}
