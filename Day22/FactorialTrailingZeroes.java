/**
 * FactorialTrailingZeroes
 */
public class FactorialTrailingZeroes {

    public static void main(String[] args) {
        
        SolutionFactorialTrailingZeroes solutionFactorialTrailingZeroes = new SolutionFactorialTrailingZeroes();
        int ans  = solutionFactorialTrailingZeroes.trailingZeroes(25);
        System.out.println(ans);
    }
}

class SolutionFactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        
        long f = 5;
        int zeroCount =0;

        // because zeros are change in multiple of 5
        while(n/f > 0){
            zeroCount += n/f;
            f = f * 5;
        }
        

        return zeroCount;
    }
 }
