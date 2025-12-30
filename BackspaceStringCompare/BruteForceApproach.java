package BackspaceStringCompare;

public class BruteForceApproach {

        
    public static void main(String[] args) {
        // Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

        // Note that after backspacing an empty text, the text will continue empty.
        
         
        
        // Example 1:
        
        // Input: s = "ab#c", t = "ad#c"
        // Output: true
        // Explanation: Both s and t become "ac".
        // Example 2:
        
        // Input: s = "ab##", t = "c#d#"
        // Output: true
        // Explanation: Both s and t become "".
        // Example 3:
        
        // Input: s = "a#c", t = "b"
        // Output: false
        // Explanation: s becomes "c" while t becomes "b".
         
        String s = "ab##"; 
        String t  = "c#d#";
        
        boolean result = findBestResult(s, t);

        System.out.print(result + " ");

    }   

    public static boolean findBestResult(String s, String t) {
        return build(s).equals(build(t));
    }

    public static String build(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    
}
