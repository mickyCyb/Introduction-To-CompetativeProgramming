/**
 * CountPrimes
 */
public class CountPrimes {

    public static void main(String[] args) {
        
        SolutionCountPrimes solutionCountPrimes = new SolutionCountPrimes();
        int c = solutionCountPrimes.countPrimes(25);
        System.out.println(c);
        
    }
}
        // slow solution, 653ms
// class SolutionCountPrimes {
//     public int countPrimes(int n) {
        
//       //  int [] nums = new int[n+1];
//         int x = (int)Math.sqrt(n);
//         int count =0;

//         if(n== 0 || n==1){
//             return 0;
//         }
//         if(n==2){
//             return 0;
//         }   
//         if(n==3){
//             return 1;
//         }     

//         for(int i=4; i< n; i++){
//             for(int j =2; j<=x; j++){
//                 if(i %j ==0 && i!=j){
//                    count++;
//                   // System.out.println(i);
//                    break;
                
//                 }
//             }
//         } 

//         return (n-2) -  count;  // 2 numbers have special conditions and are dealt above(2and 3)
//     }
//}

        // optimizd solution

class Solution {
    public int countPrimes(int n) {
        
        boolean[] isPrime = new boolean[n];
        
        if(n <= 2){
            return 0;
        }
        for(int i=2; i<n; i++){
            isPrime[i] = true;
        }
        int count = 0;
        for(int i = 2; i * i < n; i++){
            if(!isPrime[i]){
                continue;
            }
            for(int j = i * i; j < n; j += i){
                isPrime[j] = false;
            }
        }
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }
        }
        
        return count;
    }
}