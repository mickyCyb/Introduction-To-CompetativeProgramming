import java.util.*;
public class RestoretheArrayFromAdjacentPairs {
    
}
class Solution {

    List<Integer> list = new ArrayList<>();

    public int[] restoreArray(int[][] adjacentPairs) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int[] arr : adjacentPairs){
            if(map.containsKey(arr[0])){
                map.get(arr[0]).add(arr[1]);
            }else{
                map.put(arr[0],new ArrayList<>(Arrays.asList(arr[1])));
            }
            if(map.containsKey(arr[1])){
                map.get(arr[1]).add(arr[0]);
            }else{
                map.put(arr[1],new ArrayList<>(Arrays.asList(arr[0])));
            }
        }
        HashSet<Integer> visited = new HashSet<>();

        map.forEach((key ,value)->{
            if(!visited.contains(key) && value.size() == 1){
                dfs(key ,map ,visited);
            }
        });
        int i = 0;
        int[] ans = new int[map.size()];
        for(int item : list){
            ans[i++] = item;
        }
        return ans;
    }
    private void dfs(int key, HashMap<Integer, List<Integer>> map, HashSet<Integer> visited){
        visited.add(key);
        list.add(key);
        map.get(key).forEach(item->{
            if(!visited.contains(item)){
                dfs(item, map, visited);
            }
        });
    }
}