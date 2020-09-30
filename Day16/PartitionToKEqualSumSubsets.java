class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        
        int sum=0;
        for(int num : nums){
            sum += num;
        }
        if(sum%k != 0){
            return false;
        }
        
        return canMakePartition(0, nums, new boolean[nums.length], k, 0, sum/k);
        
    }
                                
    public boolean canMakePartition(int startIndex, int[] nums, boolean[] used, int numOfbuckets, int currentBucketSum, int targetBucketSum){
       
        if(numOfbuckets==1) {
            return true;
        }
        if(currentBucketSum == targetBucketSum) {
            return canMakePartition(0,nums,used,numOfbuckets-1,0,targetBucketSum);
        }
        
        for(int i=startIndex; i<nums.length;i++){
            if(!used[i]){
                used[i] = true;
                if(canMakePartition(i+1,nums,used,numOfbuckets,currentBucketSum + nums[i], targetBucketSum)){
                  return true;  
                }
                used[i] = false;
            }
        }
        return false;
    }
}