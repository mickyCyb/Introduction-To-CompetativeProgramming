/**
 * UniqueNumberOfOccurrences
 */
import java.util.*;
public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        
    }
}



class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        
        for(int i=0; i<arr.length; i++){
            
           if(map.containsKey(arr[i])){
               map.put(arr[i], map.get(arr[i]) + 1);
           }
            else{
                map.put(arr[i], 1);
            }
        }
        
        for(int key: map.keySet()){
            
            if(set.contains(map.get(key))){
                return false;
            }
            else{
                set.add(map.get(key));
            }
            
        }
        return true;
    }
}