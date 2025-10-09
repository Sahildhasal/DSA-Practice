package MinimumInsortedarray;

public class BruteforceApproach {
    public static void main(String[] args) {
        int[] numsArray = {4,5,6,7,0,1,2};

        int result = findBestResult(numsArray);
        System.out.println("result is " + result);
    }

    public static int findBestResult(int[] numsArray) {

        int smallest = numsArray[0];

        for (int i = 0; i < numsArray.length; i++) {
            if(smallest > numsArray[i]){
                smallest = numsArray[i];
            }
        }


        return smallest;
    }
}
