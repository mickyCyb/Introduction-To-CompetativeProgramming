/**
 * BitwiseORsOfSubarrays
 */
import java.util.*;
public class BitwiseORsOfSubarrays {

    public static void main(String[] args) {
       SolutionBitwiseORsOfSubarrays bitwise = new SolutionBitwiseORsOfSubarrays();
       int ans = bitwise.subarrayBitwiseORs(new int[]{1,2,4});
       System.out.println(ans);
    }
}

class SolutionBitwiseORsOfSubarrays {
    public int subarrayBitwiseORs(int[] A) {
        if(A.length == 1){
            return 1;
        }
        
        
        HashSet<Integer> previousSet = new HashSet<>();
        HashSet<Integer> finalSet = new HashSet<>();
        
        
        previousSet.add(A[0]);
        finalSet.add(A[0]);
        
        for(int i=1; i< A.length; i++){
            HashSet<Integer> tempSet = new HashSet<>();
            finalSet.add(A[i]);
            tempSet.add(A[i]);
            
            for(int num: previousSet){
                finalSet.add(A[i] | num);
                tempSet.add(A[i] | num);
            }
            previousSet = tempSet;
        }
        return finalSet.size();
    }
}