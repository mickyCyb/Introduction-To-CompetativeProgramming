import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    public static void main(String[] args) {

    }
}

class RecentCounter {

    Queue<Integer> myQueue;
    public RecentCounter() {

        myQueue = new LinkedList<>();
    }

    public int ping(int t) {

        myQueue.add(t);
        while(myQueue.peek() < t - 3000){
            myQueue.poll();
        }
        return myQueue.size();
    }
}
