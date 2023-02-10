public class SquaresofaSortedArray {
    
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int front = 0;
        int last  = nums.length-1;
        int[] result = new int[nums.length];
        int index = last;
        
        while(index >= 0){
            if(nums[front] * nums[front] >= nums[last] * nums[last]){
                result[index--] = nums[front] * nums[front++];
            }else{
                result[index--] = nums[last] * nums[last--];
            }
        }
        return result;
    }
}