
public class MaximumSubarray {
    
}
class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = nums[0];
        int tempMax = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            tempMax = Math.max(tempMax + nums[i], nums[i]);
            max = Math.max(max, tempMax);
        }
        return max;
    }
}