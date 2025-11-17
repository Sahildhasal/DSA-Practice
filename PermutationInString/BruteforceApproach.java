package PermutationInString;

import java.util.Arrays;

public class BruteforceApproach {

    public static void main(String[] args) {
        // Input:
        // s1 = "ab", s2 = "eidbaooo"

        // Output:
        // true
        // Explanation:
        // s2 contains "ba", which is a permutation of "ab".



        // Input:
        // s1 = "ab", s2 = "eidboaoo"

        // Output:
        // false

        String s1 = "ab";
        
        String s2 = "eidbaooo";

        boolean result = findBestResult(s1, s2);

        System.out.print(result + " ");
    }   

    public static boolean findBestResult(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) return false;

        // sort s1 once
        String sortedS1 = sortString(s1);

        for (int i = 0; i <= len2 - len1; i++) {
            String substring = s2.substring(i, i + len1);
            String sortedSub = sortString(substring);

            if (sortedS1.equals(sortedSub)) {
                return true;
            }
        }

        return false;
    }

    public static String sortString(String string){
        char[] characters = string.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }
    
}
