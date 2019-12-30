import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MinStackProblem {
    public static void main(String[] args) {

        MinStack minStack = new MinStack();
       /* minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   // Returns -3.
        minStack.pop();
        minStack.top();      // Returns 0.
        System.out.println(minStack.getMin());   // Returns -2.*/
        minStack.push(-1);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }
}

class MinStack {

    /** initialize your data structure here. */
    ArrayList<Integer> myStack;
    int minStack;
    public MinStack() {
        myStack = new ArrayList<>();
    }

    public void push(int x) {
        myStack.add(x);
        minStack = Collections.min(myStack);
    }

    public void pop() {

        int removedNum=0;
        if(myStack.size() > 0){
            removedNum = myStack.remove(myStack.size()-1);
        }

        if(removedNum == minStack && myStack.size() >0){
            minStack = Collections.min(myStack);
        }
    }

    public int top() {
        if(myStack.size() > 0){
          return myStack.get(myStack.size()-1);
        }
        return 0;
    }

    public int getMin() {
        if(myStack.size() > 0){
            return minStack;
        }
        return 0;
    }

}