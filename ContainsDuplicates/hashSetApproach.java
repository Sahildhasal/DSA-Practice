package ContainsDuplicates;

import java.util.HashSet;

public class hashSetApproach {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,7,8};

        boolean result = checkForDuplicates(nums);
        System.out.println("result is " + result);
    }

    public static boolean checkForDuplicates(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashSet.contains(nums[i])){
                return true;
            }
            hashSet.add(nums[i]);
        }
        return false;
    }
}
