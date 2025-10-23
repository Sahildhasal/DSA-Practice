package SquaresOfSortedArray;

import java.util.Arrays;

public class OptimizedApproach {
    public static void main(String[] args) {
        int[] numsArray = {-4, -1, 0, 3, 10};

        int[] result = findBestResult(numsArray);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }   

    public static int[] findBestResult(int[] numsArray) {
           int[] resultArray = new int[numsArray.length];

           int position = numsArray.length - 1;
           int left = 0;
           int right = numsArray.length - 1;

           while (left <= right) {
                int leftSquare = numsArray[left] * numsArray[left];
                int rightSquare = numsArray[right] * numsArray[right];

                if(leftSquare > rightSquare){
                    resultArray[position] = leftSquare;
                    left++;
                }
                else{
                    resultArray[position] = rightSquare;
                    right--;
                }

                position--;
           }
           

           return resultArray;
    }
}
