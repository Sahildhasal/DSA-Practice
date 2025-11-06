package LongestSubarrayOf1sAfterDeletingOneElement;

public class OptimizedApproach {

    public static void main(String[] args) {
        // nums = [1, 1, 0, 1]
        // output 3
        // Explanation:
        // Delete the 0, then the array becomes [1, 1, 1] — longest subarray = 3.

        // nums = [0, 1, 1, 1, 0, 1, 1, 0, 1]
        // 5
        // Explanation:
        // If you delete the first 0, longest 1s = [1,1,1] (3).
        // If you delete the middle 0, longest 1s = [1,1,1,1,1] (5) ✅.

        int[] numsArray = {1, 1, 0, 0, 1};

        int result = findBestResult(numsArray);

        System.out.print(result + " ");
    }   

    public static int findBestResult(int[] numsArray) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < numsArray.length; right++) {
            if (numsArray[right] == 0) {
                System.out.println("enter first if: " + numsArray[right]);
                zeroCount++;
            }

            // If there are more than one zero, shrink the window
            while (zeroCount > 1) {
                System.out.println("enter while: " + zeroCount);
                if (numsArray[left] == 0) {
                    zeroCount--;
                    System.out.println("enter second if: " + numsArray[left] + " " + zeroCount);
                }
                left++;

                System.out.println("enter end of while: " + left);
            }

            // window length - 1 (because we have to delete one element)
            maxLen = Math.max(maxLen, right - left);

            System.out.println("enter end of for loop: " + maxLen + ", right-left:" + (right - left) + ", right:" + right + ", left:" + left);
        }

        return maxLen;
    }
    
}
