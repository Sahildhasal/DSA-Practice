package RotateArray;

public class ReverseArray {
    public static void main(String[] args) {
        // nums = [1, 2, 3, 4, 5, 6, 7]
        // k = 3
        // output = [5,6,7,1,2,3,4]

        int[] numsArray = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(numsArray, 0, numsArray.length - 1);

        rotateArray(numsArray, 0, k - 1);

        rotateArray(numsArray, k, numsArray.length - 1);


        for (int i : numsArray) {
            System.out.print(i + " ");
        }
    }   

    public static void rotateArray(int[] numsArray, int start, int end) {

        while(start < end){
            int temp = numsArray[start];
            numsArray[start] = numsArray[end];
            numsArray[end] = temp;
            start++;
            end--;
        }
    }
}
