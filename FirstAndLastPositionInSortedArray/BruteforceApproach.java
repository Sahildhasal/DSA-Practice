package FirstAndLastPositionInSortedArray;

public class BruteforceApproach {
    public static void main(String[] args) {
        // [1,2,3,3,3,3,4,5,9] target = 3

        //output [2, 5]

        int[] numsArray = {1,2,3,4,5,9};
        int target = 3;
        int[] result = findBestResult(numsArray, target);
        System.out.println("result is " + result[0] + " " + result[1]);
    }

    public static int[] findBestResult(int[] numsArray, int target){

        int[] resultArray = {-1, -1};
        for (int i = 0; i < numsArray.length; i++) {
            if(numsArray[i] == target){
                if(resultArray[0] == -1){
                    resultArray[0] = i;
                }
                resultArray[1] = i;
            }
        }
        return resultArray;
    }

}
