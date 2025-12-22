package ReverseString;

public class BruteforceApproach {
    public static void main(String[] args) {
        // Write a function that reverses a string. The input string is given as an array of characters s.

        // You must do this by modifying the input array in-place with O(1) extra memory.

        

        // Example 1:

        // Input: s = ["h","e","l","l","o"]
        // Output: ["o","l","l","e","h"]
        // Example 2:

        // Input: s = ["H","a","n","n","a","h"]
        // Output: ["h","a","n","n","a","H"]
        
        char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        char[] result = findBestResult(s);

        for (char c : result) {
            System.out.print(c + " ");
        }

    }   

    public static char[] findBestResult(char[] s) {
        int left = 0;
        int right = s.length - 1;

        // Corrected Loop Condition: Continue swapping as long as the left pointer
        // has not crossed or met the right pointer.
        while (left < right) {
            // 1. Swap the characters at left and right
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // 2. Move pointers inward
            left++;
            right--;
        }
        return s;
    }


}
