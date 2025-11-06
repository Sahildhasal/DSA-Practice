package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class OptimizedApproach {
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
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
    
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
