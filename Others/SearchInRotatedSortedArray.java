/**
 * SearchInRotatedSortedArray
 */
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        SolutionSearchInRotatedSortedArray rotate = new SolutionSearchInRotatedSortedArray();
        int ans = rotate.search(new int[]{4,5,6,7,0,1,2}, 1);
        System.out.println(ans);
    }
}

class SolutionSearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        
        if(nums.length == 0){
            return -1;
        }
        
        int front=0;
        int last =nums.length -1;
        int mid=0;
        
        // first do a binary search to find the pivot point, which is the point the sorted array is rotated.
        while(front < last){
            mid = front + (last-front)/2;
            
            if(nums[mid] > nums[last]){
                front = mid+1;
            }
            else{
                last = mid;
            }
        }
        
        int pivot = front;
        front=0;
        last = nums.length - 1;
        
        // decide where or in which half the target value resides
        if(target <= nums[last] && target >= nums[pivot]){
            front = pivot;
        }
        else{
            last = pivot;
        }
        
        // another binary search to find the index of the target.
        while(front <= last){
            
            mid = front + (last-front)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            else if(target > nums[mid] ){
                front = mid+1;
            }
            else{
                last = mid -1;
            }
        }
        
        return -1;
    }
}