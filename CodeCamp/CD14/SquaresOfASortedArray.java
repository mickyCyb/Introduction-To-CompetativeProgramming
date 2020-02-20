/**
 * SquaresOfASortedArray
 */
import java.util.*;
public class SquaresOfASortedArray {

    public static void main(String[] args) {
        SolutionSquaresOfASortedArray res = new SolutionSquaresOfASortedArray();
        int[] ans =res.sortedSquares(new int[]{-4,-1,0,3,10});
        
        for(int i=0; i<ans.length;i++ ){
            System.out.println(ans[i]);
        }
    }
}
class SolutionSquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
     
        for(int i=0; i< A.length;i++){
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        
        return A;

        //////////// alternative approach ////////////

        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // int[] arr = new int[A.length];

        // for(int i=0; i< A.length; i++){
        //     minHeap.add(A[i] * A[i]);
        // }

        // int j=0;
        // while(!minHeap.isEmpty()){
        //     arr[j] = minHeap.poll();
        //     j++;
        // }

        // return arr;

    }
}