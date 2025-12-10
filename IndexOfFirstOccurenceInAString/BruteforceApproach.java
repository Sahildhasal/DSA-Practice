package IndexOfFirstOccurenceInAString;

public class BruteforceApproach {
    public static void main(String[] args) {
        // Example 1:

        // Input: haystack = "sadbutsad", needle = "sad"
        // Output: 0
        // Explanation: "sad" occurs at index 0 and 6.
        // The first occurrence is at index 0, so we return 0.
        // Example 2:
        
        // Input: haystack = "leetcode", needle = "leeto"
        // Output: -1
        // Explanation: "leeto" did not occur in "leetcode", so we return -1.
         
        String haystack = "mississippi";
        String needle = "issipi";
        int result = findBestResult(haystack, needle);

        System.out.println("result: " + result);
    }   

    public static int findBestResult(String haystack, String needle) {
        int index = -1;

        // Step 1: Edge case check
        if (needle.length() == 0) return 0; // empty needle

        if (haystack.length() < needle.length()) return -1;
      
        for (int i = 0; i < haystack.length(); i++) {
            
            char needlechar = needle.charAt(0);
            char currentChar = haystack.charAt(i);

            if(currentChar == needlechar){
                if((i + needle.length()) <= haystack.length()){
                    System.out.println(i + " " + (i + needle.length()));
                    String totalString = haystack.substring(i, i +needle.length());
    
                    if(totalString.equals(needle)){
                        return i;
                    }
                }

            }
        }

        return index;
    }
}
