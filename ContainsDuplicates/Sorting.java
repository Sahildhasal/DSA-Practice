package ContainsDuplicates;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,1, 6,7,8};

        boolean result = checkForDuplicates(nums);
        System.out.println("result is " + result);
    }

    public static boolean checkForDuplicates(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == (nums[i + 1])){
                return true;
            } 
        }
        return false;
    }
}
