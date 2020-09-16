/**
 * MakeArrayZigzag
 */
public class MakeArrayZigzag {

    public static void main(String[] args) {
        SolutionMakeArrayZigzag sol = new SolutionMakeArrayZigzag();
        int ans = sol.movesToMakeZigzag(new int[]{1,2,3});
        System.out.println(ans);
    }
}

class SolutionMakeArrayZigzag {
    int evenMove=0;
    int oddMove=0;
    public int movesToMakeZigzag(int[] nums) {
        
        // if there is only 1 element
        if(nums.length ==1){
            return 0;
        }
        
        // check to the right and left of the element and its index
        for(int i=0; i < nums.length; i++){
            
            if(i % 2 ==0 && i == nums.length-1){
                if(nums[i] >= nums[i-1]){
                    evenMove+= nums[i] - nums[i-1] +1;
                }
                break;
            }
            if(i % 2 !=0 && i == nums.length-1){
                if(nums[i] >= nums[i-1]){
                    oddMove+= nums[i] - nums[i-1] +1;
                }
                break;
            }
            
            if(i == 0){
                if(nums[i] >= nums[i+1]){
                    evenMove+= nums[i] - nums[i+1] +1;
                }
            }
            
            else if(i % 2 ==0){
                int min = Math.min(nums[i-1], nums[i+1]);
                if(nums[i] >= min){
                    evenMove += nums[i] - min +1;
                }
            }
            
            else if(i % 2 != 0){
                int min = Math.min(nums[i-1], nums[i+1]);
                if(nums[i] >= min){
                    oddMove += nums[i] - min +1;
                }
            }
        }
        return Math.min(oddMove,evenMove);
    }
}