public class DivideTwoIntegers{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean isNegative = (dividend < 0) ^ (divisor < 0); // if only one of them are negative
        long divid = Math.abs((long)dividend);
        long divis = Math.abs((long)divisor);
        
        long quotient=0;
        for (int i = 31; i >= 0; i--) { // because 2^31 is the biggest number integer range
            if(divid >= (divis << i)){
                divid -= divis << i;
                quotient += 1l << i;
            }
        }
        
        return isNegative ? (int)-quotient:(int)quotient;
    }
}