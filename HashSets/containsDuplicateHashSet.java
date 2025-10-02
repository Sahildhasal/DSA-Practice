package HashSets;

import java.util.HashSet;

public class containsDuplicateHashSet {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        
        boolean result = checkForDuplicates(nums);
        System.out.println("result is " + result);
    }   

    public static boolean checkForDuplicates(int[] nums) {
        HashSet<Integer> numArray = new HashSet<>();
        for (int i : nums) {
            if(numArray.contains(i)){
                return true;
            }
            numArray.add(i);
        }
        return false;
    }
}
