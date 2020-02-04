/**
 * ClimbingStairs
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        
        SolutionClimbingStairs solutionClimbingStairs = new SolutionClimbingStairs();
        int ans = solutionClimbingStairs.climbStairs(45);
        System.out.println(ans);
    }
}

class SolutionClimbingStairs {
    public int climbStairs(int n) {
        
//         int [] fibo = new int[n+1];
//         fibo[0]=1;
//         fibo[1]=1;
        
//         for(int i=2; i<=n; i++){
//             fibo[i] =fibo[i-1] + fibo[i-2];
//         }
        
//        return fibo[n];
        
        
        
        if(n<3){
            return n;
        }
        
        int first=1;
        int second=2;
        int temp=0;
        
        for(int i=2;i<n; i++){
            temp = first + second;
            first=second;
            second = temp;
        }
        return temp;
        
    }
   
    
}