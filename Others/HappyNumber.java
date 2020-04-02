import java.util.HashSet;

/**
 * HappyNumber
 */
public class HappyNumber {

    public static void main(String[] args) {
        SolutionHappyNumber sol = new SolutionHappyNumber();
        System.out.println(sol.isHappy(19));
    }
}

class SolutionHappyNumber {
    public boolean isHappy(int n) {
        String str = Integer.toString(n);
        int sum=0;
        HashSet<Integer> set = new HashSet<>();
        
        while(sum!=1){
            sum=0;
            for(int i=0;i<str.length();i++ ){
                int temp = Character.getNumericValue(str.charAt(i));
                sum+= temp * temp;                
                
            }
            if(!set.contains(sum)){
               set.add(sum);
            }
            else{
               return false;
            }
                
            str = Integer.toString(sum);
            
        }
        return true;
    }
}