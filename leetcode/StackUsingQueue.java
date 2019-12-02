import java.util.ArrayList;

public class StackUsingQueue {
    public static void main(String[] args) {

        //MyStack myStack = new MyStack();

        //myStack.push(1);
        //myStack.push(4);
        //System.out.println(myStack.empty()); //returns
        //System.out.println(myStack.top());
        //System.out.println(myStack.pop());
        //System.out.println(myStack.pop());
        //System.out.println(myStack.empty());
    }
}

class MyStack {

    /** Initialize your data structure here. */
    ArrayList<Integer> queueArray;
    public MyStack() {
        queueArray = new ArrayList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queueArray.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queueArray.remove(queueArray.size()-1);
    }

    /** Get the top element. */
    public int top() {
        return queueArray.get(queueArray.size()-1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {

        return queueArray.size() ==0;
    }

}
