/**
 * GenerateAStringWithCharactersThatHaveOddCounts
 */
import java.util.Arrays;
public class GenerateAStringWithCharactersThatHaveOddCounts {

    public static void main(String[] args) {
        SolutionStringWithCharactersThatHaveOddCounts sol = new SolutionStringWithCharactersThatHaveOddCounts();
        String ans = sol.generateTheString(6);
        System.out.println(ans);
    }
}

class SolutionStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
       
        // whenever n is even, n-1 characters can be the same and only 1 character will be different(both n-1 and 1 are odd);
        // if n is odd all characters can be the same 
        char[] arr = new char[n];
        Arrays.fill(arr,'y');
        if(n%2==0){
            
            arr[0] ='x';
        }
        
        
        return new String(arr);
    }
}