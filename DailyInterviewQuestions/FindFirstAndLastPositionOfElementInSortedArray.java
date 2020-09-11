/**
 * FindFirstAndLastPositionOfElementInSortedArray
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        SolutionFindFirstAndLastPosition firstLast = new  SolutionFindFirstAndLastPosition();
        int[] ans = firstLast.searchRange(new int[]{5,7,7,8,8,10}, 8);

        System.out.print("[");
        for(int i=0; i < ans.length; i++ ){
            System.out.print(ans[i]);
            System.out.print(",");
        }
        System.out.print("]");
    }
}

class SolutionFindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        
        int [] result = new int[2];
        
        result[0] = getFirstPosition(nums,target);
        result[1] = getLastPosition(nums,target);
        
        return result;
        
    }
    
    public int getFirstPosition(int[] nums, int target){
        
        int firstIndex= -1;
        int front = 0;
        int last = nums.length-1;
        
        while(front <= last){
            int mid = front + (last - front)/2;
            
            if(nums[mid] >= target ){
                last = mid-1;
            }
            else{
                front = mid + 1;
            }
            
            if(nums[mid] == target){
                firstIndex = mid;
            }
        }
        return firstIndex;
    }
    
     public int getLastPosition(int[] nums, int target){
        
        int lastIndex= -1;
        int front = 0;
        int last = nums.length-1;
        
        while(front <= last){
            int mid = front + (last - front)/2;
            
            if(nums[mid] <= target ){
                front = mid + 1;
            }
            else{
                last = mid - 1;
            }
            if(nums[mid] == target){
                lastIndex = mid;
            }
        }
        return lastIndex;
    }
}