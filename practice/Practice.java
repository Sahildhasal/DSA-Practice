package practice;

public class Practice {

    public static void main(String[] args) {
        // Input: nums = [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
        // Output: 6
        // Explanation: [4, -1, 2, 1] has the largest sum = 6.
        int[] numsArray = {4,5,6,7,0,1,2};

        int result = findBestResult(numsArray);
        System.out.println("result is " + result);
    }

    public static int findBestResult(int[] numsArray) { 

        int left = 0;
        int right = numsArray.length - 1;

        

        while(left < right){
            int mid = left + (right - left) / 2;
            System.out.println("left: " + left + " right: " + right + " mid:" + mid );
            if(numsArray[mid] > numsArray[right]){
                left = mid + 1;
                System.out.println("enter if");
            }
            else {
                right = mid;
                System.out.println("enter else");
            }
        }


        return numsArray[left];
    }
}
