public class ShortestUnsortedContinuousSubarray{
	public static void main(String[] args) {
		
	}
}

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        int start = sortedNums.length;
        int end =0;
        
        for(int i=0; i < sortedNums.length; i++){
            if(nums[i] != sortedNums[i]){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }
        int res = start - end >=0 ? 0 : end - start +1;
        return res;
    }
}