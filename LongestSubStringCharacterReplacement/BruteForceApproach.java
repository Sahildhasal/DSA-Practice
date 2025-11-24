package LongestSubStringCharacterReplacement;

import java.util.HashMap;

public class BruteForceApproach {
    public static void main(String[] args) {
            // Input: s = "ABAB", k = 2
            // Output: 4
            // Explanation: Replace both 'A' → 'B' or both 'B' → 'A'
            // Resulting substring = "BBBB" or "AAAA"

            // Input: s = "AABABBA", k = 1
            // Output: 4
            // Explanation: Replace the middle 'A' → 'B'
            // Result: "AABBBBA" → longest uniform substring = "BBBB"

        
        String s = "AABABBBBAAA";
        int k = 1;
        int result = findBestResult(s, k);

        System.out.print(result + " ");
    }   

    public static int findBestResult(String s, int k) {
        int result = 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        // AABABBBBA
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            hashMap.put(ch, hashMap.getOrDefault(ch,0) + 1);
            int value = hashMap.get(ch);
            result = Math.max(result, value);
        }

        System.out.println(hashMap);

        return result;
    }
}
