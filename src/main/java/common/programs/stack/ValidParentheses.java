package common.programs.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "[])";
        if(s.length()%2!=0){
            System.err.println("Invalid String");
            return;
        }
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else {
                System.err.println("Invalid String");
                return;
            }
        }
        if(stack.isEmpty()){
            System.out.println("Valid String");
        }
        else{
            System.err.println("Invalid String");
        }
    }
}
