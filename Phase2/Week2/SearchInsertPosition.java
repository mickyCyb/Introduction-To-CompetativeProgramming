/**
 * SearchInsertPosition
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        SolutionSearchInsertPosition sol = new SolutionSearchInsertPosition();
        int ans = sol.searchInsert(new int[]{1,3,5,6}, 3);
        System.out.println(ans);
    }
}

class SolutionSearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        
        int len = nums.length;
        if(len ==0){
            return 0;
        }
        int front =0;
        int last = len-1;
        
        if(target > nums[len-1]){
            return len;    
        }
        if(target < nums[0]){
            return 0;
        }
        
        while(front <= last){
            int mid = front + (last - front)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                last = mid-1;
            }
            else{
                front = mid+1;
            }
        }
        return front;
    }
}