/**
 * PowerOfThree
 */
public class PowerOfThree {

    public static void main(String[] args) {
        SolutionPowerOfThree pow = new SolutionPowerOfThree();
        System.out.println(pow.isPowerOfThree(81));
    }
}

class SolutionPowerOfThree {
    public boolean isPowerOfThree(int n) {
        
//        if (n < 1) {
//             return false;
//         }

//         while (n % 3 == 0) {
//             n /= 3;
//         }

//         return n == 1;
        
        
        // 1162261467 is the maximum integer value that is divisible by 3
        // so this number can devide any other numbers that are divisible by 3 under it
        return n > 0 && 1162261467 % n == 0;
    }
}