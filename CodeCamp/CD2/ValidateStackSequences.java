/**
 * ValidateStackSequences
 */
import java.util.*;
public class ValidateStackSequences {

    public static void main(String[] args) {
        
        SolutionValidateStackSequences valSeq = new SolutionValidateStackSequences();
        boolean ans  = valSeq.validateStackSequences(new int[]{1,2,3,4}, new int[]{4,3,2,1});
        System.out.println(ans);
        
    }
}

class SolutionValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       
        int count =0;

        Stack <Integer> myStack = new Stack<>();
        
        if(pushed.length ==0){
            return true;
        }
         
        for( int ar : popped){
            if(myStack.empty()){
                myStack.push(pushed[count]);
            }
            if(myStack.peek() == ar){
                myStack.pop();
            }else{
                count++;
                while(count < pushed.length){
                    myStack.push(pushed[count]);

                    if(myStack.peek() == ar){
                        myStack.pop();
                        break;
                    }
                    count++;
                }
                if(count == pushed.length){
                    return false;
                }
            }
        }
        
        
        return true;
    }
}