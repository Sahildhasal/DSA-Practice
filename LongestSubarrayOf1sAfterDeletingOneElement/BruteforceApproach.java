package LongestSubarrayOf1sAfterDeletingOneElement;

public class BruteforceApproach {
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

        int[] numsArray = {1, 1, 0, 1};

        int result = findBestResult(numsArray);

        System.out.print(result + " ");
    }   

    public static int findBestResult(int[] numsArray) {
        int maxLen = 0;

        for (int i = 0; i < numsArray.length; i++) {
            int currentMax = 0;
            int len = 0;
            for (int j = 0; j < numsArray.length; j++) {
                if(i == j) continue;
                
                if(numsArray[j] == 1){
                    len++;
                    currentMax = Math.max(currentMax, len);
                }else {
                    len = 0;
                }
            }

            maxLen = Math.max(currentMax, maxLen);
            
        }

        return maxLen;
    }
}
