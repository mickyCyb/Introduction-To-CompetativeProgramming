/**
 * MaximumSubarray
 */
public class MaximumSubarray {

    public static void main(String[] args) {
        
        SolutionMaximumSubarray sub = new SolutionMaximumSubarray();
        int ans = sub.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(ans);
    }
}

class SolutionMaximumSubarray {
    public int maxSubArray(int[] nums) {
    

        // if the array is zero the function returns the smallest integer Value
        if(nums.length==0){
            return -2147483648;
        }
        
        // if there is only one number the number itself is returned
        if(nums.length ==1){
            return nums[0];
        }
        
        // take the first number in the array as the largest initially
        int finalMax=nums[0];
        int tempMax=nums[0];
        
        // so every time we come across a number that decreases the total sum we reset the total sum
        // because the sum must come from arrays items that are contiguous.
        for(int i=1; i<nums.length; i++){
            
            if(tempMax + nums[i] <= nums[i]){
                tempMax = nums[i];
                //finalMax += tempMax;
            }
            else{
                tempMax +=nums[i];
                //finalMax = tempMax;
            }
            // decide on the largest sum
            finalMax =Math.max(finalMax,tempMax);
        }
        
        return finalMax;
    }
}