
public class MaximumDifferenceBetweenIncreasing {
    
}
class Solution {
    public int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int res = -1;

        for(int num : nums){
            if(num <= min){
                min = num;
            }else{
                res = Math.max(res, num - min);
            }
        }
        return res;
    }
}