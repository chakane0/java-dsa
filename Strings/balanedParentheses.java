package Strings;
import java.util.Stack;
public class balanedParentheses {
    public static void main(String[] args) {
        String s = "{[]}({)";
        System.out.println(checkParen(s));
    }

    public static boolean checkParen(String s) {
        Stack<Character> aStack = new Stack<>();
        int aCount = 0;
        for(int i = 0; i < s.length(); i++) {
            System.out.println(aStack + "  aCount: " + aCount);
            aCount++;
            aStack.add(s.charAt(i));
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                // aStack.add(s.charAt(i));
                continue;
            } else {
                // Character p = aStack.pop();
                if( (s.charAt(i) == ']' && aStack.peek() != '[') || (s.charAt(i) == ')' && aStack.peek() != '(') || (i == '}' && aStack.peek() != '{')) {
                    return false;
                }
                
            }
        }
        return true;
    }
}
