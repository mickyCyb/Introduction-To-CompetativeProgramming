/**
 * PeakIndexInAMountainArray
 */
public class PeakIndexInAMountainArray {

    public static void main(String[] args) {

        SolutionPeakIndexInAMountainArray solutionPeakIndexInAMountainArray = new SolutionPeakIndexInAMountainArray();

        int ans = solutionPeakIndexInAMountainArray.peakIndexInMountainArray(new int []{0,1,0});
        
        System.out.println(ans);
    }
}

class SolutionPeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        
        int res=A[0];
        if(A.length < 3){
            return 0;
        }
        
        for(int i=1; i<A.length-1; i++){
            if(A[i] > res && A[i] > A[i+1]){    // checks if the mountain condition is fulfilled
                res = i;
                break;
            }
            res = A[i];     // if not try the next number
        }
        
        return res;
    }
}