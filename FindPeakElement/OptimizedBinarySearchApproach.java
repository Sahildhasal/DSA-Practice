package FindPeakElement;

public class OptimizedBinarySearchApproach {
    public static void main(String[] args) {
        int[] numsArray = {1,2,3,99,1};
        int target = 7;    
        
        int result = findBestResult(numsArray, target);

        System.out.println("result is " + result);
    }   


    public static int findBestResult(int[] numsArray, int target){

        int left = 0;
        int right = numsArray.length - 1;


        while(left < right) {
            int mid = left + (right - left)/2;
            
            if(numsArray[mid] > numsArray[mid + 1]){
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        
        return left;
    }   
}
