package NumberOfSubarraysWithSumGreterThanX;

public class OptimizedApproach {

    public static void main(String[] args) {
         
        // 💡 Problem Explanation: Sliding Window Sum ConstraintThe problem asks you to analyze a given array of 
        // numbers and determine how many contiguous subarrays (or "windows") within it meet a specific sum requirement.
        // The key constraints are:Fixed Window Size ($k$): The length of the subarray we are considering must be exactly $k$.
        //  It cannot be shorter or longer.Sum Condition ($\ge X$): The sum of the elements within that fixed-size window must
        //   be greater than or equal to a target value, $X$.You need to slide this window of size $k$ across the entire array,
        //    calculate the sum for each position, and count how many times that sum meets or exceeds $X$.How the Window
        //     MovesImagine you have a pane of glass that can cover exactly $k$ numbers.First, you place it over the first
        //      $k$ numbers and check their sum.Then, you slide the pane one position to the right. This means the number
        //       that was just inside the left edge drops out, and the new number on the right edge comes in.You check the
        //        sum of this new set of $k$ numbers.You repeat this process until the window reaches the end of the array.
        //        GoalThe final answer is the total count of these windows whose sum is $X$ or more.

        
        //  int[] nums = {1, 2, 3, 4, 5};
        // int k = 3;
        // int minSum = 8;
        // output: 2

        //  int[] nums = {10, 5, 2, 7, 8, 1};
        // int k = 3;
        // int minSum = 15;
        // output: 3
        // [10, 5, 2] (Sum=17), [5, 2, 7] (Sum=14), [2, 7, 8] (Sum=17), [7, 8, 1] (Sum=16)

        //  int[] nums = {[1, 1, 1, 1, 1]};
        // int k = 3;
        // int minSum = 4;
        // output: 0
        // None (Max sum is 3)

        int[] nums = {1,1,1,1,1};
        int k = 3;
        int minSum = 4;
        int result = findBestResult(nums, k, minSum);

        System.out.print(result + " ");   
    }

    public static int findBestResult(int[] nums, int k, int minSum) {
        int count = 0;
        int sum = 0;
        int left = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        if(sum >= minSum){
                System.out.println("sum: " + sum);
                count++;
            }

        for (int right = k; right < nums.length; right++) {

            sum = sum - nums[left] + nums[right];
            left++;

            if(sum >= minSum){
                System.out.println("sum: " + sum);
                count++;
            }
        }

        return count;
    }

}
