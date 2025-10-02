package HashSets;

import java.util.Arrays;

public class ContainsDuplicateSorting {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        
        boolean result = checkForDuplicates(nums);
        System.out.println("result is " + result);
    }

    public static boolean checkForDuplicates(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}
