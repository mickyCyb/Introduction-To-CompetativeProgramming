/**
 * SubtractTheProductAndSumOfDigitsOfAnInteger
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) {
        SolutionSubtractTheProductAndSum sol = new SolutionSubtractTheProductAndSum();
        System.out.println(sol.subtractProductAndSum(1942));
    }
}

class SolutionSubtractTheProductAndSum {
    public int subtractProductAndSum(int n) {
        String str = Integer.toString(n);
        int sum=0;
        int product =1;
        
        for(int i=0;i<str.length();i++){
            int temp = Character.getNumericValue(str.charAt(i));
            product*=temp;
            sum+=temp;
        }
        return product - sum;
    }
}