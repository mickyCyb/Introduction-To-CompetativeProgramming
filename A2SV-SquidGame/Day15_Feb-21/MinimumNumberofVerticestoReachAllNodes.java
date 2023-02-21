import java.util.*;
public class MinimumNumberofVerticestoReachAllNodes {
    
}
class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
    
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(List<Integer> list : edges){
            set.add(list.get(1));
        }
        
        for(int i=0; i<n; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }  
}