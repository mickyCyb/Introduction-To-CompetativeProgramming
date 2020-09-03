import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PostfixCalculator {
    public static void main(String[] args) {

      /* String[] string ={"4","5","/"};
        String newstring ="";
        System.out.print("[");
        for(int i=0;i<string.length;i++){
            newstring+=(string[i]+" ");
        }
        System.out.print(newstring);
        System.out.print("]");*/

        //System.out.println(postFix("4 2 / "));

       SolutionPostfix spf = new SolutionPostfix();
        System.out.println(spf.evalRPN(new String[]{"7","2","-"}));
    }
    public static int postFix(String string){


        ArrayList<String> postFixArray = new ArrayList<>(Arrays.asList(string.split( " ")));
        Stack<Integer> myStack = new Stack<>();

        int preceed;
        for(int i=0; i<postFixArray.size();i++){
            if(postFixArray.get(i).equals("+")){
                myStack.push(myStack.pop() + myStack.pop());
            }
            else if(postFixArray.get(i).equals("-")){
                preceed = myStack.pop();
                myStack.push(myStack.pop() - preceed);
            }
            else if(postFixArray.get(i).equals("*")){
                myStack.push(myStack.pop() * myStack.pop());
            }
            else if(postFixArray.get(i).equals("/")){
                preceed = myStack.pop();
                myStack.push(myStack.pop() / preceed);
            }
            else{
                myStack.push(Integer.parseInt(postFixArray.get(i)));
            }

        }
        return myStack.pop();
    }
}


class SolutionPostfix {
    public int evalRPN(String[] tokens) {
        String newstring ="";
        for(int i=0;i<tokens.length;i++){
            newstring+=(tokens[i]+" ");
        }

        ArrayList<String> postFixArray = new ArrayList<>(Arrays.asList(newstring.split( " ")));
        Stack<Integer> myStack = new Stack<>();

        int preceed;
        for(int i=0; i<postFixArray.size();i++){
            if(postFixArray.get(i).equals("+")){
                myStack.push(myStack.pop() + myStack.pop());
            }
            else if(postFixArray.get(i).equals("-")){
                preceed = myStack.pop();
                myStack.push(myStack.pop() - preceed);
            }
            else if(postFixArray.get(i).equals("*")){
                myStack.push(myStack.pop() * myStack.pop());
            }
            else if(postFixArray.get(i).equals("/")){
                preceed = myStack.pop();
                myStack.push(myStack.pop() / preceed);
            }
            else{
                myStack.push(Integer.parseInt(postFixArray.get(i)));
            }

        }
        return myStack.pop();



        	// 4ms solution
        /*
			 Stack<Integer> stack = new Stack<>();
        
        int preceed;
        for(String str : tokens){
            if(str.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(str.equals("-")){
                preceed = stack.pop();
                stack.push(stack.pop() - preceed);
            }
            else if(str.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(str.equals("/")){
                preceed = stack.pop();
                stack.push(stack.pop() / preceed);
            }
            else{
                stack.push(Integer.parseInt(str));
            }
            
        }
        return stack.pop();
        */
    }
}

