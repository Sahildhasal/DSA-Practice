package FirstAndLastPositionInSortedArray;

public class OptimizedApproach {
    public static void main(String[] args) {
        // [1,2,3,3,3,3,4,5,9] target = 3

        //output [2, 5]

        int[] numsArray = {1,2,3,3,3,3,4,5,9};
        int target = 3;
        int result1 = findFirstIndex(numsArray, target);
        int result2 = findLastIndex(numsArray, target);
        System.out.println("result is " + result1 + " " + result2);
    }

    public static int findFirstIndex(int[] numsArray, int target){

        int first = -1;

        int left = 0;
        int right = numsArray.length - 1;
        System.out.println("reached 1");
        while(left <= right){
            int mid = left + (right - left)/2; 
            
            if(numsArray[mid] == target){
                first = mid;
                right = mid - 1;
            }
            else if(numsArray[mid] > target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println("reached");
        return first;
    }

    public static int findLastIndex(int[] numsArray, int target){

        int last = -1;

        int left = 0;
        int right = numsArray.length - 1;
        System.out.println("reached 1");
        while(left <= right){
            int mid = left + (right - left)/2; 
            
            if(numsArray[mid] == target){
                last = mid;
                left = mid + 1;
            }
            else if(numsArray[mid] > target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println("reached");
        return last;
    }
}
