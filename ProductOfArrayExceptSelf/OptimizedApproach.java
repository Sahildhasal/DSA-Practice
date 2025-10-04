package ProductOfArrayExceptSelf;

public class OptimizedApproach {
    public static void main(String[] args) {
        // Input:  nums = [1, 2, 3, 4]
        // Output: [24, 12, 8, 6]

        int[] numsArray = {1, 2, 3, 4};

        int[] result = checkForProductOfArray(numsArray);
        // for (int i : result) {
        //     System.out.println(i);
        // }
    }

    public static int[] checkForProductOfArray(int[] numsArray) {
        int n = numsArray.length;
        int[] result = new int[n];
    
        // Step 1: Prefix product
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * numsArray[i - 1];
        }
        for (int i : result) {
            System.out.println("before " + i);
        }
        System.out.println();
        System.out.println();
        // Step 2: Multiply with suffix product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            System.out.printf("%d  %d", result[i], suffix);
            System.out.println();
            suffix = suffix * numsArray[i];
        }

        for (int i : result) {
            System.out.println("after " + i);
        }
        
    
        return result;
    }
}
