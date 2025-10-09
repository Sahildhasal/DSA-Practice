package MaximumProductContigousArray;

import java.util.HashSet;

public class BruteforceApproach {
   public static void main(String[] args) {
    int[] numsArray = {-2,-3,-4,-5};

    int result = findBestResult(numsArray);
    System.out.println("result is " + result);
   }

   public static int findBestResult(int[] numsArray){
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < numsArray.length; i++) {
            int product = 1;
            for (int j = i; j < numsArray.length; j++) {
                product *= numsArray[j];

                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
   }
}
