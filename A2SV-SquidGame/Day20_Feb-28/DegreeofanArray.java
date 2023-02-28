import java.util.HashMap;

public class DegreeofanArray {
    
}
class Solution {
    public int findShortestSubArray(int[] nums) {
        
        HashMap<Integer, int[]> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new int[] {1, i, i});
            } else {
                int[] temp = map.get(nums[i]);
                temp[0]++;
                temp[2] = i;
                map.put(nums[i], temp);
            }
        }
        
        for (int[] value : map.values()) {
            max = Math.max(max, value[0]);
        }
        
        
        for (int[] value : map.values()) {
            if (value[0] == max) {
                min = Math.min(min, value[2] - value[1] + 1);
            }
        }
        
        return min;


    }
}