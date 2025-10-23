package SquaresOfSortedArray;

import java.util.Arrays;

public class BruteforceApproach {
    public static void main(String[] args) {
        int[] numsArray = {-4, -1, 0, 3, 10};

        int[] result = findBestResult(numsArray);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }   

    public static int[] findBestResult(int[] numsArray) {   

        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = numsArray[i] * numsArray[i];
        }
        Arrays.sort(numsArray);
        return numsArray;
    }
}
