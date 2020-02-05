/**
 * RangeSumQuery_Immutable
 */
public class RangeSumQuery_Immutable {

    public static void main(String[] args) {
        
            
        

    }
}

class NumArray {
    int [] newArr;
    public  NumArray(int[] nums) {
        
        
        newArr = new int[nums.length +1];
        //newArr[0]= nums[0];
        int totalSum=0;
        
        for(int i=1; i<newArr.length; i++){
            totalSum += nums[i - 1];
            newArr[i] = totalSum;
            
            
        }
        
    }
    
    public int sumRange(int i, int j) {
        
        
        return newArr[j+1] - newArr[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */