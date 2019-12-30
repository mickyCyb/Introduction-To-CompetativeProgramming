/**
 * FindTheDuplicateNumber
 */
public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        SolutionFindDuplicate solF = new SolutionFindDuplicate();
        int ans = solF.findDuplicate(new int[]{3,1,3,4,2});
        System.out.println(ans);
    }
}


class SolutionFindDuplicate {
    public int findDuplicate(int[] nums) {

        // Input: [1,3,4,2,2]
        // Output: 2
       /* int [] arr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
        }
        
        Arrays.sort(arr);
        
        int dup= arr[0];
        
        for(int i=0; i<arr.length;i++){
            if(dup != arr[i+1]){
                dup = arr[i+1];
            }
            else{
                break;
            }
        }
        return dup;     */

        int front =0;
        int last = nums.length - 1;
        int mid = 0;
        int countBeforeMid;

        while(front <= last){
            if(front == last){
                mid = last;
            }
            else{
                mid = ((front + last) -1) / 2;
            }
            countBeforeMid=0;

            for(int i=0; i< nums.length; i++){
                if(nums[i] <= mid){
                    countBeforeMid +=1;
                }
                else{
                    countBeforeMid +=0;
                }
            }
            if (countBeforeMid > mid) {
                last = mid - 1;
            } else {
                front = mid + 1;
            }
        }


        return front;
    }
}