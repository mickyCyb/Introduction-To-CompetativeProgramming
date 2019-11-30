import java.util.ArrayList;

/*public class QueueUsingStacks {
    public static void main(String[] args) {

    }
}*/

class MyQueue {

    /** Initialize your data structure here. */
    ArrayList<Integer> stackArray;
    public MyQueue() {
        stackArray = new ArrayList<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackArray.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int fElement =stackArray.get(0);
        stackArray.remove(0);
        return fElement;
    }

    /** Get the front element. */
    public int peek() {
        return stackArray.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stackArray.size() ==0){
            return true;
        }
        return false;
    }
}