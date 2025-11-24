package RomanToInteger;

public class BruteForceApproach {

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

            if(i + 1 < s.length()){
                String twoChars = s.substring(i, i + 2);

                if(twoChars.equals("IV")){
                    result += 4;
                    i++;
                    continue;
                }
                else if(twoChars.equals("IX")){
                    result += 9;
                    i++;
                    continue;
                }
                else if(twoChars.equals("XL")){
                    result += 40;
                    i++;
                    continue;
                }
                else if(twoChars.equals("XC")){
                    result += 90;
                    i++;
                    continue;
                }
                else if(twoChars.equals("CD")){
                    result += 400;
                    i++;
                    continue;
                }
                else if(twoChars.equals("CM")){
                    result += 900;
                    i++;
                    continue;
                }
            }

            char ch = s.charAt(i);
            if(ch == 'I') result += 1;
            else if(ch == 'V') result += 5;
            else if(ch == 'X') result += 10;
            else if(ch == 'L') result += 50;
            else if(ch == 'C') result += 100;
            else if(ch == 'D') result += 500;
            else if(ch == 'M') result += 1000;
            
        }

        return result;
    }
    
}
