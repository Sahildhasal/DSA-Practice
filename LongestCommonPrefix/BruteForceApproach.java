package LongestCommonPrefix;

public class BruteForceApproach {
    public static void main(String[] args) {
        // Example 1:

        // Input: strs = ["flower","flow","flight"]
        // Output: "fl"
        // Example 2:
        
        // Input: strs = ["dog","racecar","car"]
        // Output: ""
        // Explanation: There is no common prefix among the input strings.

        String[] s = {"dog","racecar","car"};
        // length = 7
        String result = findBestResult(s);

        System.out.print(result + " ");
        
    }   

    public static String findBestResult(String[] strs) {

        // if(strs == null || strs.length == 0){
        //     return "";
        // }

        // for (int i = 0; i < strs[0].length(); i++) {
            
        //     char currentChar = strs[0].charAt(i);

        //     for (int j = 1; j < strs.length; j++) {

        //         if(i >= strs[j].length() || strs[j].charAt(i) != currentChar){
        //             return strs[0].substring(0, i);
        //         }
                
        //     }
        // }

        return strs[0];
    }
}
