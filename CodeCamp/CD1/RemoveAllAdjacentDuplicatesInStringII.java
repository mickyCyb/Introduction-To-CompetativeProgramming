
/**
 * RemoveAllAdjacentDuplicatesInStringII
 */
import java.util.*;

public class RemoveAllAdjacentDuplicatesInStringII {

    public static void main(String[] args) {
        SolutionRemoveAllAdjacentDuplicates adj = new SolutionRemoveAllAdjacentDuplicates();
        String ans = adj.removeDuplicates("abcd", 2);
        System.out.println(ans);
    }
}

class SolutionRemoveAllAdjacentDuplicates {
    public String removeDuplicates(String s, int k) {

        // create stack add the first character
        Stack<PairFunc> stack = new Stack<>();
        PairFunc pFunc = new PairFunc(s.charAt(0), 1);

        stack.push(pFunc);

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // if the stack is empty it means it is the first occurrence of that chsrscter 
            // so append 1 as its frequency amount
            if (stack.isEmpty()) {
                stack.push(new PairFunc(currentChar, 1));
            } else {
                PairFunc p = stack.peek();
                if (currentChar == p.c) {// if the last element matches the current character
                    p.frequency += 1;

                    // number of characters reached k amount, enough to be removed
                    if (p.frequency == k) {
                        stack.pop();
                    }
                } 
                else {
                    stack.push(new PairFunc(currentChar, 1));
                }
            }
        }
        String temp = "";
        String result = "";
        // this while loop helps us to get all the elements in the stack
        while (!stack.isEmpty()) {
            PairFunc pf = stack.pop();
            char cr = pf.c;
            // put all the left over characters on a temporary string
            for (int i = 0; i < pf.frequency; i++) {

                temp += cr;
            }
        }

        // get thhe reverse or correct order of the output characters
        for (int j = temp.length() - 1; j >= 0; j--) {
                
            result += temp.charAt(j);
            
        }

        return result;
    }
}


// custom class to hold character and frequency count in a stack
class PairFunc {

    char c;
    int frequency;

    public PairFunc(char ch, int freq) {
        this.c = ch;
        this.frequency = freq;
    }
}
