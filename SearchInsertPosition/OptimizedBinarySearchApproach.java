package SearchInsertPosition;

public class OptimizedBinarySearchApproach {
    public static void main(String[] args) {
        int[] numsArray = {1,3,5,6};
        int target = 2;    
        
        int result = findBestResult(numsArray, target);

        System.out.println("result is " + result);
    }   


    public static int findBestResult(int[] numsArray, int target){
        int left = 0;
        int right = numsArray.length - 1;

        while ( left <= right) {
            int mid = left + (right - left)/2;
            System.out.println("mid: " + mid + " " + right + " " + left);
            if(numsArray[mid] == target){
                System.out.println("enter if");
                return mid;
            }
            else if(target < numsArray[mid]){
                System.out.println("enter else if: " + mid);
                right = mid - 1;
            }
            else {
                System.out.println("enter else: " + mid);
                left = mid + 1;
            }
        }
        return left;
    } 
}
