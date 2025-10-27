package RotateArray;

public class BruteForceApproach {
    public static void main(String[] args) {
        // nums = [1, 2, 3, 4, 5, 6, 7]
        // k = 3
        // output = [5,6,7,1,2,3,4]

        int[] numsArray = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] result = findBestResult(numsArray, k);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }   

    public static int[] findBestResult(int[] numsArray, int k) {
        int n = numsArray.length;
        k = k % n;  // Handle cases where k > n
        System.out.println("k: " + k + (k%n));

            // Repeat rotation k times
            for (int i = 0; i < k; i++) {

            //     // Step 1: store the last element
                int last = numsArray[n - 1];

            //     // Step 2: shift all elements one step to the right
                for (int j = n - 1; j > 0; j--) {
                    numsArray[j] = numsArray[j - 1];
                }

            //     // Step 3: put the last element at the front
                numsArray[0] = last;
            }

        return numsArray;
    }
}
