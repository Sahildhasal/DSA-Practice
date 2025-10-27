package MoveZeroes;

public class BruteForceApproach {
    public static void main(String[] args) {
        // nums = [0, 1, 0, 3, 12]

        // output = [1, 3, 12, 0, 0]

        int[] numsArray = {0, 1, 0, 3, 0, 45, 12};

        int[] result = findBestResult(numsArray);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }   

    public static int[] findBestResult(int[] numsArray) {

        for (int i = 0; i < numsArray.length; i++) {
            if(numsArray[i] == 0){
                for (int j = i; j < numsArray.length - 1; j++) {
                    numsArray[j] = numsArray[j + 1];
                }
                numsArray[numsArray.length - 1] = 0;
            }
        }
       
        return numsArray;
    }
}


 
            