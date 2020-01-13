/**
 * Pow_x_PowerOf_n
 */
public class Pow_x_PowerOf_n {

    public static void main(String[] args) {
        System.out.println(new SolutionPow().myPow(2.0,-2));
    }
}

class SolutionPow {
    public double myPow(double x, int n) {
     
        if(n<0){
            return 1/findPower(x, n);

        }
        return findPower(x, n);
        

    }

    public static double findPower(double x, int n){

        if(n==0){
            return 1;

        }
        double res = findPower(x, n/2);

        if(n%2!=0){
            return res *res * x;
        }

        return res *res;
    }
}