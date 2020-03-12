/**
 * FindPeakElement
 */
public class FindPeakElement {

    public static void main(String[] args) {
        SolutionFindPeakElement peak = new SolutionFindPeakElement();
        System.out.println(peak.findPeakElement(new int[]{1,2,1,4}));
    }
}

class SolutionFindPeakElement {
    public int findPeakElement(int[] nums) {
     
        int front=0;
        int mid =0;
        int last=nums.length -1;
        
        while(front < last){
            mid = front + (last-front)/2;
            
            if(nums[mid] < nums[mid+1]){
                front =  mid+1;
            }
            else{
                last =mid;
            }
        }
        return front;
    }
}