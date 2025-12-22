package MoveZeroes;

public class UsingExtraArray {
    public static void main(String[] args) {
        // nums = [0, 1, 0, 3, 12]

        // output = [1, 3, 12, 0, 0]

        // left = 0
        //1,1,0,3,12 // 1 0 0 3 12

        //left = 1
        //
        int[] numsArray = {1, 0, 0, 3, 12};
        // 3 0 0 0 12
        int[] result = findBestResult(numsArray);

        for (int i : result) {
            System.out.print(i + " ");
        }

    }   

    public static int[] findBestResult(int[] nums) {
        // if (nums == null || nums.length == 0) {
        //     return;
        // }

        // {0, 0, 0, 3, 12}
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Only swap if we haven't reached the insertPos yet (i.e., we are past some zeroes)
                if (i != insertPos) {
                    // Swap the non-zero element (nums[i]) with the element at insertPos (which is a zero)
                    int temp = nums[i];
                    nums[i] = nums[insertPos];
                    nums[insertPos] = temp;
                }
                // Always increment insertPos after placing a non-zero number
                insertPos++;
            }
        }
       
        return nums;
    }

}
