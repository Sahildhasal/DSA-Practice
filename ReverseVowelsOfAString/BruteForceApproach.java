package ReverseVowelsOfAString;


public class BruteForceApproach {

           public static void main(String[] args) {

            // Given a string s, reverse only all the vowels in the string and return it.

            // The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
            
             
            
            // Example 1:
            
            // Input: s = "IceCreAm"
            
            // Output: "AceCreIm"
            
            // Explanation:
            
            // The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
            
            // Example 2:
            
            // Input: s = "leetcode"
            
            // Output: "leotcede"
            String s = "leetcode";
                
            String result = findBestResult(s);

            // for (int i = 0; i < result.length; i++) {
                System.out.print(result + " ");
            // }
        }   
        public static String findBestResult(String s) {
            // IceCreAm
            //

            StringBuilder sb = new StringBuilder(s);

            int left = 0;
            int right = sb.length() - 1;

            while(left < right){
                char leftChar = sb.charAt(left);
                char rightChar = sb.charAt(right);

                boolean isLeftCharVowel = checkIsVowel(leftChar);
                boolean isRightCharVowel = checkIsVowel(rightChar);

                System.out.println("isLeftCharVowel: " + isLeftCharVowel + " isRightCharVowel: " + isRightCharVowel);
                if(isLeftCharVowel && isRightCharVowel){
                    char temp = sb.charAt(left);
                    sb.setCharAt(left, rightChar);
                    sb.setCharAt(right, temp);
                    left++;
                    right--;
                }
                else if(!isLeftCharVowel){
                    left++;
                }
                else if(!isRightCharVowel){
                    right--;
                }
            }



            return sb.toString();
        }

        public static boolean checkIsVowel(Character ch){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                return true;
            }
            else {
                return false;
            }
        }


    
}
