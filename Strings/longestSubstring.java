package Strings;
import java.util.HashSet;
public class longestSubstring {
    public static void main(String[] args) {
        String input = "pwwkew";
        int result = lengthOfLongestSubstring(input);
        System.out.println(result);
    }

    /*
     * s = abcabcbb
     * output = 3
     * 
     * s = abbnew
     * output = 3
     * 
     * Given a string s, find rhe length of the longest substring without repeating characters
     * 
     * 1st Approach: Use pointers 
     *               We have the ability to use a sliding window approach
     * 
     * 2nd Approach: Dont use pointers
     */
    public static int lengthOfLongestSubstring(String s) {
        int ptrA = 0, maxLength = 0;
        HashSet<Character> map = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            while(map.contains(s.charAt(i))) {
                map.remove(s.charAt(ptrA));
                ptrA++;
        
            }
                map.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - ptrA + 1);
        

        
        }
        return maxLength;
    }
}
