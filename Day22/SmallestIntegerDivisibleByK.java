/**
 * SmallestIntegerDivisibleByK
 */
public class SmallestIntegerDivisibleByK {

    public static void main(String[] args) {
        
        SolutionSmallestIntegerDivisibleByK ss = new SolutionSmallestIntegerDivisibleByK();
        int ans = ss.smallestRepunitDivByK(111);
        System.out.println(ans);
    }
}

class SolutionSmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int K) {
     
        int length =1;
        int tempCurrent = 1;

        if(K%5==0 || K%2==0){
            return -1;
        }

        while(tempCurrent % K != 0){
            tempCurrent= ((tempCurrent % K) * 10) + 1;
            length++;
        }
        return length;
    }
}