package RemoveElement;

public class BruteForceApproach {
    
    public static void main(String[] args) {
        // Example 1:

        // Input: nums = [3,2,2,3], val = 3
        // Output: 2, nums = [2,2,_,_]
        // Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        // It does not matter what you leave beyond the returned k (hence they are underscores).
        // Example 2:
        
        // Input: nums = [0,1,2,2,3,0,4,2], val = 2
        // Output: 5, nums = [0,1,4,0,3,_,_,_]
        // Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
        // Note that the five elements can be returned in any order.
        // It does not matter what you leave beyond the returned k (hence they are underscores).
         
        int[] numsArray = {0,1,2,2,3,0,4,2};
        // 0,1,2,3,0,4,2,2
        // 
        int val = 2;
        int result = findBestResult(numsArray, val);

        System.out.println("result: " + result);
    }   

    public static int findBestResult(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                temp[i] = nums[i];
                count++;
            }
        }

        for(int i = 0; i < count; i++){
            nums[i] = temp[i];
        }
    
    return count;
    }

}
