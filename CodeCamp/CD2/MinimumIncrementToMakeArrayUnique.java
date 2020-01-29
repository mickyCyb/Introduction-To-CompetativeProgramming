/**
 * MinimumIncrementToMakeArrayUnique
 */
import java.util.*;
public class MinimumIncrementToMakeArrayUnique {

    public static void main(String[] args) {
        
        SolutionMinimumIncrementToMakeArrayUnique m = new SolutionMinimumIncrementToMakeArrayUnique();
        int ans = m.minIncrementForUnique(new int[]{3,2,1,2,1,7});
        System.out.println(ans);
    }
}

class SolutionMinimumIncrementToMakeArrayUnique {
    public int minIncrementForUnique(int[] A) {
        
        
        if(A.length ==0){
            return 0;
        }
        
        int moves = 0;
        int current = A[0];
        Arrays.sort(A);
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<A.length; i++){
            
            if(!set.contains(A[i])){
                set.add(A[i]);
              //  moves++;
                current = A[i];
            }
            else{
                set.add(current + 1);
                moves += (current+1)-A[i];
                current++;
            }
        }
        
        
        return moves;
    }
}