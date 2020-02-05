/**
 * HouseRobber
 */
public class HouseRobber {

    public static void main(String[] args) {
        SolutionHouseRobber solutionHouseRobber = new SolutionHouseRobber();
        int ans = solutionHouseRobber.rob(new int[]{2,7,9,3,1});
        System.out.println(ans);
    }
}


class SolutionHouseRobber {
    public int rob(int[] nums) {
        

        if(nums.length ==0){
            return 0;
        }
        
        if(nums.length ==1){
            return nums[0];
        }
        if(nums.length ==2){
            return Math.max(nums[0] , nums[1]);
        }
        
        nums[2] += nums[0];
        // update the value at the index every time we get maximum of the previous value        
        for(int i=3; i<nums.length; i++){
            nums[i] += Math.max(nums[i-2], nums[i-3]);  
        }
        
        return Math.max(nums[nums.length-2] , nums[nums.length-1] );
    }
}