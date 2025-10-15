package SearchInRotatedSortedArray;

public class BruteforceApproach {
    public static void main(String[] args) {
        // Input: nums = [4,5,6,7,0,1,2], target = 0
        // Output: 4
        int[] numsArray = {4,5,6,7,0,1,2};
        int target = 0;
        int result = findBestResult(numsArray, target);
        System.out.println("result is " + result);
    }

    public static int findBestResult(int[] numsArray, int target){

        for (int i = 0; i < numsArray.length; i++) {
            if(numsArray[i] == target){
                return i;
            }
        }

        return -1;
    }
}
