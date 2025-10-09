package MinimumInsortedarray;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numsArray = {4,5,6,7,0,1,2};

        int result = findBestResult(numsArray);
        System.out.println("result is " + result);
    }

    public static int findBestResult(int[] numsArray){
        int left = 0, right = numsArray.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid " + mid);
            // If mid element > right element, min is on right half
            if (numsArray[mid] > numsArray[right]) {
                left = mid + 1;
                System.out.println("left " + left);
            } else {
                // Otherwise, min is on left half (including mid)
                right = mid;
                System.out.println("right " + right);
            }
        }
    
        // Left and right will meet at the minimum element
        return numsArray[left];
    }
}
