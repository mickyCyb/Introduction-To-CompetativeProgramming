/**
 * FirstBadVersion
 */
public class FirstBadVersion {

    public static void main(String[] args) {
        SolutionFirstBadVersion solutionFirstBadVersion = new SolutionFirstBadVersion();
        int ans = solutionFirstBadVersion.firstBadVersion(5);
        System.out.println(ans);
    }
}
class VersionControl {
    boolean isBadVersion(long currNumber) {
        if (currNumber >= 1702766719) {
            return true;
        }
        return false;
    }
}

class SolutionFirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        
        if(isBadVersion(1)){
            return 1;
        }

        int currentNumber = n/2;
        boolean badNumber;

        while(n - currentNumber > 1){

            badNumber = isBadVersion(currentNumber);

            if(badNumber){
                n = currentNumber;
                currentNumber = n / 2;
            }
            else{
                currentNumber = ((n - currentNumber) / 2) + currentNumber ;
            }
            
        }
        if (isBadVersion(n) && !isBadVersion(currentNumber)) {
            return n;
        }
        return currentNumber;

        

        // efficient solution

        // int start=1;
        // int end = n;
        
        // while(start < end){
        //     int mid = start + (end - start)/2;
            
        //     if(isBadVersion(mid) == false){
        //         start = mid+1;
        //     }
        //     else{
        //         end = mid;
        //     }
        // }
        // return start;
    }
}