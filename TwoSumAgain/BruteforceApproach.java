package TwoSumAgain;

public class BruteforceApproach {
    public static void main(String[] args) {
        // Input: nums = [2,7,11,15], target = 9  
        // Output: [0,1]  
        // Explanation: nums[0] + nums[1] = 2 + 7 = 9
        

        int[] numsArray = {3,2,4};
        int target = 6;
        int[] result = findBestResult(numsArray, target);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }   

    public static int[] findBestResult(int[] numsArray, int target) {
        
        for (int i = 0; i < numsArray.length; i++) {
            for (int j = i + 1; j < numsArray.length; j++) {
                if(numsArray[i] + numsArray[j] == target){
                    return new int[]{i, j};
                }
            }   
        }

        return new int[]{-1, -1};
    }
}
