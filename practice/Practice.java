package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Practice {

    public static void main(String[] args) {
        // Input:  s = "III"      → Output: 3
        // Input:  s = "LVIII"    → Output: 58   (L=50, V=5, III=3)
        // Input:  s = "MCMXCIV"  → Output: 1994
        
        

        String s = "MCMXCIV";
        // length = 7
        int result = findBestResult(s);

        System.out.print(result + " ");
        
    }   

    public static int findBestResult(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = getValue(s.charAt(i));

            if(i + 1 < s.length()){
                int nextValue = getValue(s.charAt(i + 1));

                if(currentValue < nextValue){
                    result -= currentValue;
                }
                else {
                    result += currentValue;
                }
            }
            else {
                result += currentValue;
            }
        }

        return result;
    }

    public static int getValue(char ch){
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

        
}
