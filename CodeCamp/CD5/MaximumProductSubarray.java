/**
 * MaximumProductSubarray
 */
public class MaximumProductSubarray {

    public static void main(String[] args) {
        SolutionMaximumProductSubarray subArr = new SolutionMaximumProductSubarray();
        int ans  = subArr.maxProduct(new int []{-2,3,-2,4});
        System.out.println(ans);
        
    }
}

class SolutionMaximumProductSubarray{

    public int maxProduct(int[] nums) {

        int tempMax = nums[0];
        int max = nums[0];
        int tempMin = nums[0];

        for(int i=1; i< nums.length; i++){

            int currMax = tempMax;
        
            // check for the largest product calculated sofar 
            int checkMax = Math.max( (nums[i] * tempMax) , nums[i] * tempMin);
            tempMax = Math.max( checkMax , nums[i] ); // check if the current number itself is the bigger the the product
            
            // if negative number is involved and another negative number appears the result will be negative
            int checkMin = Math.min( (nums[i] * currMax) , nums[i] * tempMin);
            tempMin = Math.min( checkMin , nums[i]); 
            
            max = Math.max(max, tempMax);
        }
    
        return max;
    }


}