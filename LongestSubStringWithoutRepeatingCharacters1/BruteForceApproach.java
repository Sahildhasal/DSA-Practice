package LongestSubStringWithoutRepeatingCharacters1;

import java.util.HashMap;
import java.util.HashSet;

public class BruteForceApproach {
    
    public static void main(String[] args) {
        // Input: s = "abcabcbb"
        // Output: 3
        // Explanation: "abc" is the longest substring without repeating characters.
        
        
        
        String s = "pwwkew";
        int result = findBestResult(s);

        System.out.print(result + " ");
    }   

    public static int findBestResult(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> hashSet = new HashSet<>();

            for (int j = i; j < s.length(); j++) {
                
                char ch = s.charAt(j);

                if(hashSet.contains(ch)){
                    break;
                }

                hashSet.add(ch);

                maxLength = Math.max(maxLength, j-i + 1);
            }
        }

        return maxLength;
    }
}
