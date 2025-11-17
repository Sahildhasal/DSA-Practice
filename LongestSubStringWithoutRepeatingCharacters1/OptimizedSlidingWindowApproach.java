package LongestSubStringWithoutRepeatingCharacters1;

import java.util.HashSet;

public class OptimizedSlidingWindowApproach {
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
        int left = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            Character ch = s.charAt(right);

            while (hashSet.contains(ch)) {
                hashSet.remove(s.charAt(left));
                left++;
            }

            hashSet.add(ch);
            System.out.println("left: " + left + " right: "+ right + " hashSet: " + hashSet);
            System.out.println("maxLength: " + maxLength + " right-left+1: " + (right - left + 1));
            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;
        
    }   
}


