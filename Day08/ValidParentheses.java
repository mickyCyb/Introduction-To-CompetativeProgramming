import java.util.ArrayList;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        SolutionValidParentheses svp = new SolutionValidParentheses();
        System.out.println(svp.isValid("]["));

    }
}

class SolutionValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> myStack = new Stack<>();
        for(int i=0; i<s.length();i++){

            if(s.charAt(i)=='('){
                myStack.push('(');
            }
            else if(s.charAt(i)=='{'){
                myStack.push('{');

            }
            else if(s.charAt(i)=='['){
                myStack.push('[');

            }
            else if(s.charAt(i)==')'){
                if(myStack.empty()){
                    return false;
                }

                if(myStack.pop() != '('){
                    return false;
                }

            }else if(s.charAt(i)=='}'){
                if(myStack.empty()){
                    return false;
                }
                if(myStack.pop() != '{'){
                    return false;
                }

            }else if(s.charAt(i)==']'){
                if(myStack.empty()){
                    return false;
                }
                if(myStack.pop() != '['){
                    return false;
                }
            }
        }
        return myStack.empty();
    }
}