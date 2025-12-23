package ValidPalindromeII;

public class OptimizedApproach {
    
    public static void main(String[] args) {
        // Given a string s, return true if the s can be palindrome after deleting at most one character from it.

        // Example 1:

        // Input: s = "aba"
        // Output: true
        // Example 2:

        // Input: s = "abca"
        // Output: true
        // Explanation: You could delete the character 'c'.
        // Example 3:

        // Input: s = "abc"
        // Output: false
        
        String s = "A man, a plan, a canal: Panama";
        boolean result = findBestResult(s);

        // for (char c : result) {
            System.out.print(result + " ");
        // }

    }   

    public static boolean findBestResult(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            Character leftChar = s.charAt(left);
            Character rightChar = s.charAt(right);

            if(leftChar != rightChar){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
