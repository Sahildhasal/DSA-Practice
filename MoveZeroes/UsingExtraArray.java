package MoveZeroes;

public class UsingExtraArray {
    public static void main(String[] args) {
        // nums = [0, 1, 0, 3, 12]

        // output = [1, 3, 12, 0, 0]

        int[] numsArray = {0, 1, 0, 3, 12};

        int[] result = findBestResult(numsArray);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }   

    public static int[] findBestResult(int[] numsArray) {
        int[] newArray = new int[numsArray.length];
        int count = 0;
        for (int i = 0; i < numsArray.length; i++) {
            if(numsArray[i] != 0){
                newArray[count] = numsArray[i];
                count++;
            }
        }

        return newArray;
    }
}
