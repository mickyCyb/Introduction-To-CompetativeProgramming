/**
 * MonotonicArray
 */
public class MonotonicArray {

    public static void main(String[] args) {
        
    }
}
class SolutionMonotonicArray {
    public boolean isMonotonic(int[] A) {
     
        if(A.length ==1){
            return true;
        }
     
        int firstIndex = A[0];
        int secondIndex =A[1];
        int f;
        int l;
        int diff =0;
        int currentIndex=0;      
        

        for(int i=0; i< A.length-1; i++){
            if(A[i]== A[i+1]){
                continue;

            }
            else{
                l = A[i+1];
                f=  A[i];
                currentIndex =i;
                firstIndex = A[i];
                secondIndex = A[i+1];
                diff = l-f;
                break;
            }
        }


        if(diff >0 ){
            for(int i=currentIndex; i< A.length-1; i++){
                if(firstIndex <= A[i+1]){
                    firstIndex = A[i+1];
    
                }
                else{
                    return false;
                }
            }
            return true;
        }

        else{
            for(int i=currentIndex; i< A.length -1; i++){
                if(firstIndex >= A[i+1]){
                    firstIndex = A[i+1];                   
    
                }
                else{
                    return false;
                }
            }
            return true;
        }

    }
        
    
}