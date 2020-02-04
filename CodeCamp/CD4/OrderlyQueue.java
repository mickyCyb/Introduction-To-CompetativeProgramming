/**
 * OrderlyQueue
 */
import java.util.*;
public class OrderlyQueue {

    public static void main(String[] args) {
     
        SolutionOrderlyQueue solutionOrderlyQueue = new SolutionOrderlyQueue();
        String ans = solutionOrderlyQueue.orderlyQueue("cba", 1);
        System.out.println(ans);
    }
}

class SolutionOrderlyQueue {
    public String orderlyQueue(String S, int K) {

        String ans="";

        // if K is greater than 1 just return the sorted string
        if(K>1){
            ans = sortString(S);
            return ans;
        }

        String smallestString = S;
        String tempString = "";
        String moveString =S;

        for(int i=0; i<S.length(); i++){
            tempString = moveString.substring(1,moveString.length()) + moveString.charAt(0);

            if(smallestString.compareTo(tempString) > 0){
                smallestString = tempString;
            }
            moveString = tempString;
        }

        return smallestString;
    }

    public static String sortString(String str) { 
        char []arr = str.toCharArray(); 
        Arrays.sort(arr); 
        return(String.valueOf(arr)); 
    } 
}
