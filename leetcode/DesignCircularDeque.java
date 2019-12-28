import java.util.ArrayList;

public class DesignCircularDeque {
    public static void main(String[] args) {

        MyCircularDeque circularDeque = new MyCircularDeque(3); // set the size to be 3
        System.out.println( circularDeque.insertLast(1));			// return true
        System.out.println( circularDeque.insertLast(2));			// return true
        System.out.println( circularDeque.insertFront(3));			// return true
        System.out.println( circularDeque.insertFront(4));			// return false, the queue is full
        System.out.println( circularDeque.getRear());  			        // return 2
        System.out.println( circularDeque.isFull());				        // return true
        System.out.println( circularDeque.deleteLast());			        // return true
        System.out.println( circularDeque.insertFront(4));			// return true
        System.out.println( circularDeque.getFront());			        // return 4

    }
}

class MyCircularDeque {

    /** Initialize your data structure here. Set the size of the deque to be k. */
    ArrayList<Integer> dequeList;
    static int maxListSize;
    public MyCircularDeque(int k) {
        dequeList = new ArrayList<>();
         maxListSize = k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(dequeList.size() < maxListSize){
            dequeList.add(0,value);
            return true;
        }
        return false;

    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(dequeList.size() < maxListSize){
            dequeList.add(value);
            return true;
        }
        return false;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(dequeList.size() > 0){
            dequeList.remove(0);
            return true;
        }
        return false;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(dequeList.size() > 0){
            dequeList.remove(dequeList.size()-1);
            return true;
        }
        return false;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(dequeList.size() >0){
            return dequeList.get(0);
        }
        return -1;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(dequeList.size() >0){
            return dequeList.get(dequeList.size()-1);
        }
        return -1;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(dequeList.size() ==0){
            return true;
        }
        return false;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(dequeList.size() == maxListSize){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */