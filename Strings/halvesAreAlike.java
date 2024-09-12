package Strings;

public class halvesAreAlike {
    public static void main(String[] args) {
        
    }

    // Given a string s of even length. Split this in half and let a = the 1st half, b for the 2nd half.

    // 2 strings are 'alike' if they have the same number of vowles.
    // 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'i', 'O', 'U'


    public static boolean checkHalves(String s) {
        int leftCount =0, rightCount = 0;
        int stringLength = s.length();
        String leftSubString = s.substring(0, (stringLength-1)/2);
        String rightSubString = s.substring(stringLength/2, stringLength);
        
        for(int i = 0; i < s.length(); i++) {
            if(leftSubString.charAt(i))
        }
        return false;
    }
    
}
