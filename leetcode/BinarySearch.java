/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        
        SolutionBinarySearch sbs = new SolutionBinarySearch();
        int ans = sbs.search(new int[]{1,2,3,4,5}, 4); // the answer should be 3
        System.out.println(ans);

    }
}

class SolutionBinarySearch {
    public int search(int[] nums, int target) {
        
        int frontIndex =0;
        int lastIndex = nums.length - 1;
        int midIndex = 0;

        while(frontIndex <= lastIndex){     //if the front and last index are equal the the answer is found
            if(frontIndex == lastIndex){
                midIndex = lastIndex;
            }
            else{
                midIndex = ((frontIndex + lastIndex) + 1) / 2;
            }

            if(nums[midIndex] > target){    // if target is less than the mid index
                lastIndex = midIndex-1;
            }
            else if(nums[midIndex] < target){   // if target is greater than the mid index
                frontIndex = midIndex+1;
            }else{
                return midIndex;
            }

        }


        return -1;
    }
}