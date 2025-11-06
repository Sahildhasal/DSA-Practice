package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Practice {

    public static void main(String[] args) {
        // Input: s = "abcabcbb"
        // Output: 3
        // Explanation: The answer is "abc", with length = 3.

        // Input: s = "bbbbb"
        // Output: 1
        // Explanation: The answer is "b", with length = 1.


        // Input: s = "pwwkew"
        // Output: 3
        // Explanation: The answer is "wke", with length = 3.

        String s = "abcabcbb";

        int result = findBestResult(s);

        System.out.print(result + " ");
    }   

    public static int findBestResult(String s) {
        int left = 0;
        int maxCount = 0;
        
        HashSet<Character> hashSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            if(hashSet.contains(s.charAt(right))){

            }
        }


        return maxCount;
    }
}
