/**
 * FindMinimumInRotatedSortedArray
 */
public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        SolutionFindMinimumInRotatedSortedArray min = new SolutionFindMinimumInRotatedSortedArray();
        System.out.println(min.findMin(new int[]{4,5,6,7,0,1,2}));
    }
}

class SolutionFindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        
        if(nums.length ==0){
            return -1;
        }
        
        int front = 0;
        int last = nums.length - 1;
        int mid =0;
        int pivot =0;
        
        // the technique used is find the point int aray where it started rotated in log n time
        // sice the rest of the array is sorted, the point when it starts to decrease is considered the pivot. 
        while(front < last){
            mid = front + (last-front)/2;
            
            if(nums[mid] > nums[last]){
                front = mid+1;
            }
            else{
                last = mid;
            }
        }
        
        pivot = front;
        return nums[pivot];
        
    }
}