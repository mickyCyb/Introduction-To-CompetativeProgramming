class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        int len = nums.length;
        if(len == 0){
            return result;
        }
        
        // multiply by -1 the values at corresponding index to mark them as found
        for(int i=0; i < len; i++){
            int num = Math.abs(nums[i]);  // use Math.abs, to reuse the number at that index
            if(nums[num - 1] > 0){       // -1 is used to match the index and value
                nums[num - 1] = nums[num - 1] * -1;
            }
        }
        
        // non negative numbers are seen as disappread numbers and added to return list 
        for(int i=0; i < len; i++){
            if(nums[i] > 0){
                result.add(i + 1);      // +1 is used to match the index and value
            }
        }
        return result;
    }
}

// [0 ,  1 ,  2 ,  3 , 4 , 5 ,  6 ,  7]
// [4 , -3 , -2 , -7 , 8 , 2 , -3 , -1]