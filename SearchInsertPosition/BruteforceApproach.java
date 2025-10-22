package SearchInsertPosition;

public class BruteforceApproach {
    public static void main(String[] args) {
        int[] numsArray = {1,3,5,6};
        int target = 7;    
        
        int result = findBestResult(numsArray, target);

        System.out.println("result is " + result);
    }   


    public static int findBestResult(int[] numsArray, int target){

        for (int i = 0; i < numsArray.length; i++) {
            if(numsArray[i] == target){
                return i;
            }
            else if(target < numsArray[i]){
                return i;
            }
        }

        return numsArray.length;
    }
}
