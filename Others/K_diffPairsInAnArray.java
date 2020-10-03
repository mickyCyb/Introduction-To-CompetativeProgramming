class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length < 1){
            return 0;
        }
        // sort the array 
        Arrays.sort(nums);
        
        // start from the smallest number (left) and check the rest of the numbers if they make good pair with right
        int left =0;
        int pairs=0;
        int previous = Integer.MAX_VALUE; // varibale to check duplicates
        for(int right=1; right<nums.length;right++){ // start from 1 b/c i != j
           
            // position(shift) the left to the correct boundary of k (the difference must not exceed k)
            // and since the array is sorted, left should be less than right. if not, we count 
            // reverse pairs and add to the count
            while(left < right && nums[right] - nums[left] > k){
                left++;
            }
            // since the array is sorted, if duplicates occur it would be with the same value of nums[left]
            if(left != right && nums[right] - nums[left] == k && previous != nums[left] ){
                pairs++;
                previous = nums[left];
            }
        }
        
        return pairs;
    }
}