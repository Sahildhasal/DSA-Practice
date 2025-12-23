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
        
        String s = "carac";
        boolean result = findBestResult(s);

        // for (char c : result) {
            System.out.print(result + " ");
        // }

    }   

    public static boolean findBestResult(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            
            if(leftChar == rightChar) {
                left++;
                right--;
            }
            else {

                boolean option1 = isPalindrome(s, left + 1, right);

                boolean option2 = isPalindrome(s, left, right - 1);

                return option1 || option2;
            }
        }

        return true;
    }

    public static boolean isPalindrome(String s, int start, int end) {
        int i = start;
        int j = end;

        while (i < j){
            char leftChar = s.charAt(i);
            char rightChar = s.charAt(j);

            if(leftChar != rightChar){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

}
