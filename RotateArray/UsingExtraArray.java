package RotateArray;

public class UsingExtraArray {
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

    public static int[] findBestResult(int[] nums, int k) {
        int[] newArray = new int[nums.length];
        int n = nums.length;


        for (int i = 0; i < newArray.length; i++) {
            newArray[(i + k)% n] = nums[i];
        }
        
        return newArray;
    }
}
