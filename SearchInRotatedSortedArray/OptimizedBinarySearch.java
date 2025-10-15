package SearchInRotatedSortedArray;

public class OptimizedBinarySearch {
    public static void main(String[] args) {
        // Input: nums = [4,5,6,7,0,1,2], target = 0
        // Output: 4
        int[] numsArray = {4,5,6,7,0,1,2};
        int target = 0;
        int result = findBestResult(numsArray, target);
        System.out.println("result is " + result);
    }

    public static int findBestResult(int[] numsArray, int target){

        int left = 0;
        int right = numsArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numsArray[mid] == target) {
                return mid;
            }

            // Check if left part is sorted
            if (numsArray[left] <= numsArray[mid]) {
                if (target >= numsArray[left] && target < numsArray[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // right part is sorted
                if (target > numsArray[mid] && target <= numsArray[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }
}
