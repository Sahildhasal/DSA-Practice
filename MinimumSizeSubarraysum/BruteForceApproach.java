package MinimumSizeSubarraysum;

public class BruteForceApproach {
    
    public static void main(String[] args) {
        // Input:
        // target = 7, nums = [2,3,1,2,4,3]
        // Output:
        // 2
        // Explanation:
        // The subarray [4,3] has the minimal length of 2.


        // target = 11, nums = [1,1,1,1,1,1,1,1]
        // Output:
        // 0
        // Explanation:
        // No subarray has a sum ≥ 11.

        // Input:
        // target = 15, nums = [1,2,3,4,5]
        // Output:
        // 5
        // Explanation:
        // Entire array sums to 15 → length = 5.

        int[] numsArray = {2,3,1,2,4,3};

        int target = 7;

        int result = findMinSubArrayLen(numsArray, target);

        System.out.print(result + " ");
    }   

    public static int findMinSubArrayLen(int[] numsArray, int target) {
        int minLength = Integer.MAX_VALUE;
        
        int n = numsArray.length;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < j; j++) {
                sum += numsArray[j];

                if(sum >= target){
                    minLength = Math.min(minLength, j-i+1);
                    break;
                }
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
