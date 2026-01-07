package LongestSubstringWithoutRepeatingCharacters2;

import java.util.HashSet;

public class OptimizedApproach {
    
     public static void main(String[] args) {

//    Given a string s, find the length of the longest substring without duplicate characters.

//     Example 1:

//     Input: s = "abcabcbb"
//     Output: 3
//     Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
//     Example 2:

//     Input: s = "bbbbb"
//     Output: 1
//     Explanation: The answer is "b", with the length of 1.
//     Example 3:

//     Input: s = "pwwkew"
//     Output: 3
//     Explanation: The answer is "wke", with the length of 3.
//     Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

        String s = "bbbbb";
        
        int result = findBestResult(s);

        // for (int i : result) {
            System.out.print(result + " ");   
        // }

    }   
    public static int findBestResult(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while(hashSet.contains(ch)){
                hashSet.remove(s.charAt(left));
                left++;
            }

            hashSet.add(ch);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

}
