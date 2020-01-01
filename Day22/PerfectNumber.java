/**
 * PerfectNumber
 */
public class PerfectNumber {

    public static void main(String[] args) {
        SolutionPerfectNumber solutionPerfectNumber = new SolutionPerfectNumber();
        System.out.println(solutionPerfectNumber.checkPerfectNumber(28));
    }
}

class SolutionPerfectNumber {
    public boolean checkPerfectNumber(int num) {
        // check on till the square root of the number 
        int x =(int) Math.sqrt(num);
        int sum =1; // sum should start from 1

        if(num ==1){
            return false;
        }

        // if the numbers till x are divisible by the given number add the number and the quotient.
        for(int i=2; i<= x; i++){
            if(num %i ==0){
            sum+=(i + (num/i));
            }
        }

        // if the sum adds up to the given number(num)
        if(sum == num){
            return true;
        }
        return false;
    }
}