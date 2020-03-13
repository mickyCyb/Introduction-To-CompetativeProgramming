/**
 * SearchInRotatedSortedArrayII
 */
public class SearchInRotatedSortedArrayII {

    public static void main(String[] args) {
        SolutionSearchInRotatedSortedArrayII sol = new SolutionSearchInRotatedSortedArrayII();
        boolean ans = sol.search(new int[]{1,1,3,1}, 3);
        System.out.println(ans);
    }
}

class SolutionSearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        
        int front =0; 
        int last = nums.length - 1;
        int mid =0;
        
        while(front <= last){
            mid = front + (last-front)/2;
            
            if(nums[mid] == target){
                return true;
            }
            
            else if(nums[front] < nums[mid]){
                
                if(nums[front] <= target && target <= nums[mid]){
                    last = mid;
                }
                else{
                    front = mid+1;
                }
                
            }
            
            else if(nums[front] > nums[mid]){
                
                if (nums[mid] <= target && target <= nums[last]) {
                    front = mid +1;
                }
                else{
                    last = mid;
                }
            
            }
            else{
                front++;
            }
            
        }
        return false;
    }
}