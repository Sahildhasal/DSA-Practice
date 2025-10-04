package ProductOfArrayExceptSelf;

public class BruteForceApproach {
    public static void main(String[] args) {
        // Input:  nums = [1, 2, 3, 4]
        // Output: [24, 12, 8, 6]

        int[] numsArray = {1, 2, 3, 4};

        int[] result = checkForProductOfArray(numsArray);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] checkForProductOfArray(int[] numsArray) {

        int[] tempArray = new int[numsArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            int product = 1;
            for (int j = 0; j < tempArray.length; j++) {
                if(i != j){
                    product = product * numsArray[j];
                }
            }
            tempArray[i] = product;
        }
        return tempArray;
    }
}
