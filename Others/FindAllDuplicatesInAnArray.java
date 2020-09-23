class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int len = nums.length;
        if(len == 0){
            return result;
        }
        
        // multiply by -1 the values at corresponding index to mark them as found
        for(int i=0; i < len; i++){
            int num = Math.abs(nums[i]);  // use Math.abs, to reuse the number at that index
            if(nums[num - 1] < 0){       // -1 is used to match the index and value
                result.add(num);    // since originally the numbers are positive, if we found
            }                       // a negative number it has been visited and is double
            else{
                nums[num - 1] = -nums[num - 1];
            }
        }
        return result;
    }
}