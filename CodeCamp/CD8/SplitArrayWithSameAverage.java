/**
 * SplitArrayWithSameAverage
 */
import java.util.*;
public class SplitArrayWithSameAverage {

    public static void main(String[] args) {
        SolutionSplitArrayWithSameAverage split = new SolutionSplitArrayWithSameAverage();
        boolean ans = split.splitArraySameAverage(new int[]{2,0,5,6,16,12,15,12,4});
        System.out.println(ans);
        
    }
}

class SolutionSplitArrayWithSameAverage {
    public boolean splitArraySameAverage(int[] A) {
        
        
        int sum=0;
        for(int i:A){
            sum+=i;
        }
        
        HashMap<Integer,HashSet<Integer>> checked = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        
        return findSplit(0, 0, A, visited, checked, sum);
    }
    
    public boolean findSplit(int sum,int moves,int[] A, HashSet<Integer> visited,HashMap<Integer,HashSet<Integer>> checked, int sums){
        
        if((checked.containsKey(sum) && checked.get(sum).contains(moves)) || (moves + 1 > A.length/2)){
                return false;
        }
        for (int j = 0; j < A.length; j++){
            int i = A[j];
            if (!visited.contains(j)){
                visited.add(j);
                
                if ((double)(sum+i) == ((double)sums * (moves+1)/A.length)){
                    return true;
                }
                if (findSplit(sum+i, moves+1, A, visited, checked, sums)){
                    return true;
                }
                visited.remove(j);
            }
        }
        HashSet<Integer> temp;
        if (checked.containsKey(sum)){
            temp = checked.get(sum);
        }else{
            temp = new HashSet<>();
        }
        temp.add(moves);
        checked.put(sum, temp);
        
        return false;
    }
}