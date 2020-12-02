
		// using hash map, 4ms solution
// class Solution {
//     public int longestConsecutive(int[] nums) {
        
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int max = 0;
        
//         for(int n:nums){
//             map.put(n,1);
//         }
        
//         for(int n : nums){
//             if(map.get(n) == 1){
//                 int tempMax = dfs(n,nums,map);
//                 max = Math.max(tempMax,max);
//             }
//         }
//         return max;
//     }
//     public int dfs(int n, int[] nums, HashMap<Integer,Integer> map){
//         if(!map.containsKey(n)){
//             return 0;
//         }
//         if(map.get(n) == 1){
//             int num = 1 +  dfs(n-1,nums,map);
//             map.put(n, num);
//         }
//         return map.get(n);
//     }
// }

class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        
        for(int n:nums){
            set.add(n);
        }
        
        for(int n : nums){
            if(!set.contains(n+1)){
                int tempMax = dfs(n,nums,set);
                max = Math.max(tempMax,max);
            }
        }
        return max;
    }
    public int dfs(int n, int[] nums, HashSet<Integer> set){
        if(!set.contains(n)){
            return 0;
        }
        return 1 +  dfs(n-1,nums,set);
    }
}