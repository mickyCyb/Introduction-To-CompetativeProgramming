import java.util.Arrays;

/**
 * SortAnArray
 */
public class SortAnArray {

    public static void main(String[] args) {
        SolutionSortAnArray sol = new SolutionSortAnArray();
        int[] ans = sol.sortArray(new int[]{5,2,3,1});
        System.out.println(Arrays.toString(ans));
    }
}

class SolutionSortAnArray {
    public int[] sortArray(int[] nums) {
        return sort(nums,0,nums.length-1);
    }
    
    int[] sort(int[] nums, int left, int right){
        
        if(left < right){
            int mid = left + (right - left)/2;
            sort(nums, left, mid);
            sort(nums, mid + 1, right);
            
            merge(nums, left, mid, right);
        }
        return nums;
    }
    
    int[] merge(int[] nums, int left, int mid, int right){
        
        int len1 = mid - left +1;
        int len2 = right - mid;
        int[] leftArr = new int[len1];
        int[] rightArr = new int[len2];
        
        for(int i = 0; i < len1; i++){
            leftArr[i] = nums[left + i];
        }
        for(int j = 0; j < len2; j++){
            rightArr[j] = nums[mid + 1 + j];
        }
        
        int i=0,j=0,k=left;
        
        while(i < len1 && j < len2){
            if(leftArr[i] <= rightArr[j]){
                nums[k] = leftArr[i];
                i++;
            }
            else{
                nums[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        while(i < len1){
            nums[k] = leftArr[i];
            i++;
            k++;
        }
        while(j < len2){
            nums[k] = rightArr[j];
            j++;
            k++;
        }
        return nums;
    }
    
    
}