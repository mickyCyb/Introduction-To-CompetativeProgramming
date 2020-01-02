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

class SolutionCountPrimes {
    public int countPrimes(int n) {
        
      //  int [] nums = new int[n+1];
        int x = (int)Math.sqrt(n);
        int count =0;

        if(n== 0 || n==1){
            return 0;
        }
        if(n==2){
            return 0;
        }   
        if(n==3){
            return 1;
        }     

        for(int i=4; i< n; i++){
            for(int j =2; j<=x; j++){
                if(i %j ==0 && i!=j){
                   count++;
                  // System.out.println(i);
                   break;
                
                }
            }
        } 

        return (n-2) -  count;  // 2 numbers have special conditions and are dealt above(2and 3)
    }
}