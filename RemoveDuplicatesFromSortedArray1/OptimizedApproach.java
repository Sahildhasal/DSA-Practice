package RemoveDuplicatesFromSortedArray1;

public class OptimizedApproach {
    public static void main(String[] args) {
        
        int[] numsArray = {0,0,1,1,1,2,2,3,3,4};

        int result = findBestResult(numsArray);

        System.out.println("result: " + result);
    }   

    public static int findBestResult(int[] numsArray) {

        if(numsArray.length == 0){
            return 0;
        }

        int i = 0;

        for (int j = 1; j < numsArray.length; j++) {    
            if(numsArray[j] != numsArray[i]){
                i++;
                numsArray[i] = numsArray[j];
            }   
        }

        return i + 1;
        
    }
}
