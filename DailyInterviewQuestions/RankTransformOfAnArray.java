import java.util.*;

public class RankTransformOfAnArray{
    public static void main(String[] args) {
        SolutionRankTransformOfAnArray sol = new SolutionRankTransformOfAnArray();
        int[] ans = sol.arrayRankTransform(new int[]{30,20,10,40,30});
        System.out.println(Arrays.toString(ans));
    }
}

class SolutionRankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] result = new int[arr.length];
        //HashMap to hold the element and the indexes as a list
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        if(arr.length ==0){
            return result;
        }
        // add the elements and the indexes to the hashmap
        for(int i=0;i<arr.length;i++){
            List<Integer> indexes = new ArrayList<>();
            if(!map.containsKey(arr[i])){
                indexes.add(i);
                map.put(arr[i],indexes);
            }
            else{
                indexes = map.get(arr[i]);
                indexes.add(i);
                map.put(arr[i], indexes);
            }
        }
        //System.out.println(map);
        // after adding it to hashmap, sort the array to know the rank
        Arrays.sort(arr);
        
        int rank = 1; // ranking starts from 1
        for(int i=0; i< arr.length;i++){
            int current= arr[i];
            // check if the element in the array is also contained in the map
            if(map.containsKey(arr[i]) && map.size()>0){
                List<Integer> list = map.get(current);
                for(int j=0; j < list.size(); j++){
                   result[list.get(j)] = rank;  // this will assign the same rank for an 
                }                      // element with multiple indexes
                map.remove(arr[i]);  //remove the element, this helps when the arr[i] have                                      duplicate element
                rank++; // since all elements with same value has been assigned a rank                          increase the rank by 1
            }
        }
        
        return result;
    }
}