package TwoSum;
public class BruteForceApproach {
    public static void main(String[] args) {
        int[] arr = {45, 6, 9, 87, 2};
        int target = 89;

        int[] result = TwoSumResult(arr, target);

        if(result.length == 2){
            System.out.println("result: " + result[0] + " " + result[1]);
        }
    }

    public static int[] TwoSumResult(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}