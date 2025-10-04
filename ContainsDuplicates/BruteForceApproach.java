package ContainsDuplicates;

public class BruteForceApproach {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1, 5,6,7,8};

        boolean result = checkForDuplicates(nums);
        System.out.println("result is " + result);
    }

    public static boolean checkForDuplicates(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
