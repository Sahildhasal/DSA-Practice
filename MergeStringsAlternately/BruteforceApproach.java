package MergeStringsAlternately;

public class BruteforceApproach {
    
    public static void main(String[] args) {
        // You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

        // Return the merged string.



        // Example 1:

        // Input: word1 = "abc", word2 = "pqr"
        // Output: "apbqcr"
        // Explanation: The merged string will be merged as so:
        // word1:  a   b   c
        // word2:    p   q   r
        // merged: a p b q c r
        // Example 2:

        // Input: word1 = "ab", word2 = "pqrs"
        // Output: "apbqrs"
        // Explanation: Notice that as word2 is longer, "rs" is appended to the end.
        // word1:  a   b 
        // word2:    p   q   r   s
        // merged: a p b q   r   s
        // Example 3:

        // Input: word1 = "abcd", word2 = "pq"
        // Output: "apbqcd"
        // Explanation: Notice that as word1 is longer, "cd" is appended to the end.
        // word1:  a   b   c   d
        // word2:    p   q 
        // merged: a p b q c   d
         
         
         
        String word1 = "ab"; 
        String word2  = "pqrs";
        
        String result = findBestResult(word1, word2);

        System.out.print(result + " ");

    }   

    public static String findBestResult(String word1, String word2) {
        // Input: word1 = "abcde", word2 = "pqr"
        // Output: "apbqcrde"

        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());
        int minLength = Math.min(word1.length(), word2.length());
        boolean isFirstWordSmall = word1.length() < word2.length();

        int count = 0;
        while(count <= (maxLength - 1)){
            if(count == (minLength)){
                if(isFirstWordSmall){
                    sb.append(word2.substring(count, (maxLength)));
                }
                else {
                    sb.append(word1.substring(count, (maxLength)));
                }
                return sb.toString();
            }
            char firstWordChar = word1.charAt(count);
            char secondWordChar = word2.charAt(count);
            sb.append(firstWordChar);
            sb.append(secondWordChar);
            count++;
        }

        return sb.toString();
    }

}
