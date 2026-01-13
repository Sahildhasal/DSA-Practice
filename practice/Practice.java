package practice;

import java.util.ArrayList;

public class Practice {
 public static void main(String[] args) {
         
        // arr = [1, 3, 2, 6, -1, 4, 1, 8, 2]
        // k = 4
        // Output  [2.2, 2.8, 2.4, 3.6, 2.8]

        int[] nums = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 4;
        double[] result = findBestResult(nums, k);

        for (double d : result) {
            System.out.print(d + " ");   
        }
    }   

    public static double[] findBestResult(int[] nums, int k) {
        
        return new double[-1];
    }
}
