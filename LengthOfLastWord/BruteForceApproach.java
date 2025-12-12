package LengthOfLastWord;

public class BruteForceApproach {

    public static void main(String[] args) {
        // Given a string s consisting of words and spaces, return the length of the last word in the string.

        // A word is a maximal substring consisting of non-space characters only.
        
         
        
        // Example 1:
        
        // Input: s = "Hello World"
        // Output: 5
        // Explanation: The last word is "World" with length 5.
        // Example 2:
        
        // Input: s = "   fly me   to   the moon  "
        // Output: 4
        // Explanation: The last word is "moon" with length 4.
        // Example 3:
        
        // Input: s = "luffy is still joyboy"
        // Output: 6
        // Explanation: The last word is "joyboy" with length 6.
         
        String s = "   fly me   to   the moon  ";

        int result = findBestResult(s);

        System.out.println("result: " + result);
    }   

    public static int findBestResult(String s) {

        String trimmedString = s.trim();
        int count = 0;
        for (int i = trimmedString.length() - 1; i >= 0; i--) {
            if(trimmedString.charAt(i) == ' '){
                break;
            }
            count++;
        }

        return count;
    }

}
