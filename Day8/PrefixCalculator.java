import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PrefixCalculator {
    public static void main(String[] args) {


        System.out.println(prefixCalc("- + * 4 5 3 10"));
        // the above number is going to be translated as (((4*5)+3)-10)  = 13
    }
   public static int prefixCalc(String inputString){

        // An ArrayList that contains the input given that are split by a space.
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList(inputString.split(" ")));
        Stack<Integer> myStackOperands = new Stack<>();

        for(int i=stringArray.size()-1; i>=0; i--){

            // iterating through the array and identify the operators type
            if(stringArray.get(i).equals("/")){
                myStackOperands.push(myStackOperands.pop() / myStackOperands.pop());
            }
            else if(stringArray.get(i).equals("*")){
                myStackOperands.push(myStackOperands.pop() * myStackOperands.pop());

            }
            else if(stringArray.get(i).equals("-")){
                myStackOperands.push(myStackOperands.pop() - myStackOperands.pop());

            }
            else if(stringArray.get(i).equals("+")){
                myStackOperands.push(myStackOperands.pop() + myStackOperands.pop());

            }
            else{
                myStackOperands.push(Integer.parseInt(stringArray.get(i)));
            }

        }
       return myStackOperands.pop();
   }

}


