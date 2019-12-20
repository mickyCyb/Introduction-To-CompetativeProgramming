/**
 * Nth_TribonacciNumber
 */
public class Nth_TribonacciNumber {

    public static void main(String[] args) {

        SolutionTribonacciNumber solutionTribonacciNumber = new SolutionTribonacciNumber();
        int input = 25;
        int output = solutionTribonacciNumber.tribonacci(input);
        System.out.println(output);
    }
}


class SolutionTribonacciNumber {

    public int tribonacci(int n) {
    
        int t0 =0, t1 =1 , t2 =1, sum=0;

        if(n == 0){
            return 0;
        }

        if(n == 1 || n == 2){
            return 1;
        }

        if(n>=3){
            for(int i=3; i<=n; i++){
            
                sum =t0 + t1 + t2;
                t0 = t1;
                t1 = t2;
                t2 = sum;
            }
        }


        return sum;
    }
}