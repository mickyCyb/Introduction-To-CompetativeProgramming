/**
 * Sqrt(x)
 */
public class SqrtX {

    public static void main(String[] args) {
        SolutionSqrtX sol = new SolutionSqrtX();
        System.out.println(sol.mySqrt(8));
    }
}

class SolutionSqrtX {
    public int mySqrt(int x) {
        // using binary search
        int left = 1;
        int right = x;
        
        if(x < 2){
            return x;
        }
        
        while(left <= right){
            long mid = ((long)left + (long)right)/2;   // use long to overcome overflow of int
            
            if(mid * mid == x){
                return (int)mid;
            }
            else if(mid * mid > x){
                right =(int)mid-1;
            }
            else {
                left = (int)mid +1;
            }
        }
        return left -1 ;    // return right or leff -1  
        
    }
}

