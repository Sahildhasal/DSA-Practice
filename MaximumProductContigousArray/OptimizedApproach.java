package MaximumProductContigousArray;

public class OptimizedApproach {
    public static void main(String[] args) {
        int[] numsArray = {-2,-3,-4,-5};

        int result = findBestResult(numsArray);
        System.out.println("result is " + result);
    }

    public static int findBestResult(int[] numsArray){
        if (numsArray == null || numsArray.length == 0) return 0;

        int maxProd = numsArray[0];
        int minProd = numsArray[0];
        int result  = numsArray[0];

        for (int i = 1; i < numsArray.length; i++) {

            System.out.println("maxProd: " + maxProd + " minProd: " + minProd);
            // If x is negative, swap max and min
            if (numsArray[i] < 0) {
                System.out.println("numsArray[i] " + numsArray[i]);
                int tmp = maxProd;
                maxProd = minProd;
                minProd = tmp;
            }

            System.out.println("maxProd: " + maxProd + " minProd: " + minProd);

            // Extend or start new
            maxProd = Math.max(numsArray[i], maxProd * numsArray[i]);
            minProd = Math.min(numsArray[i], minProd * numsArray[i]);

            // Update global result
            result = Math.max(result, maxProd);
        }
        return result;
    }
}
