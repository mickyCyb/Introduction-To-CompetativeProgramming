
public class ThirdMaximumNumber {
    
}
class Solution {
    public int thirdMax(int[] nums) {
        
        // Use long data type because, the constraint includes Integer.MIN_VALUE and Integer.MAX_VALUE;
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        
        // If nums has only one element
        if(nums.length == 1){
            return nums[0];
        }
         // If nums has only two elements
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        
        // Use 3 variables to keep track of first maximum, second maximum and third maximum
        for(int num : nums){
            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if(num > max2 && num != max1){
                max3 = max2;
                max2 = num;
            }else if(num > max3 && num != max1 && num != max2){
                max3 = num;
            }
            
        }
        
        // At the end, if the third max is still Long.MIN_VALUE, it means there is no third max distinct element in           // nums. So we return the maximum as specified on the question
        if(max3 == Long.MIN_VALUE){
            return (int)max1;
        }
        return (int)max3;
    }
}