package HashSets;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicateBruteForce {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        boolean result = checkForDuplicates(nums);
        System.out.println("result is " + result);
    }

    public static boolean checkForDuplicates(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // (nums[i] == nums[j]) && i != j
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}