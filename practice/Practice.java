package practice;

public class Practice {

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
        
        for (int i = 0; i < 3; i++) {
            int last = numsArray[numsArray.length - 1];

            System.out.println("last: " + last);
            for (int j = numsArray.length - 1; j > 0; j--) {
                numsArray[j] = numsArray[j-1];   
            }

            numsArray[0] = last;
        }

        return numsArray;
    }
}
