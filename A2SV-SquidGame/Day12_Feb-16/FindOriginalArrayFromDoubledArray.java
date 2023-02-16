import java.util.Arrays;
import java.util.HashMap;

public class FindOriginalArrayFromDoubledArray {
    
}
class Solution {
    public int[] findOriginalArray(int[] changed) {
    
        int len = changed.length;
        if(len % 2 != 0){
            return new int[]{};
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[len/2];
     
        for(int i = 0; i < len; i++){
            map.put(changed[i], map.getOrDefault(changed[i], 0) +1);
        }
        
        int index = 0;
        
        Arrays.sort(changed);
        
        for(int i: changed){
            if(map.get(i) <= 0){
                continue;
            }
         
            if(map.getOrDefault(2*i, 0) <= 0){
                return new int[]{};
            }
            ans[index++] = i;
            map.put(i, map.get(i) -1); 
            map.put(2*i, map.get(2*i) -1);
        }
        
        return ans;
    }
}