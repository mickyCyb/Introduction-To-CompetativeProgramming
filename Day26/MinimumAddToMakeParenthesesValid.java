/**
 * MinimumAddToMakeParenthesesValid
 */
public class MinimumAddToMakeParenthesesValid {

    public static void main(String[] args) {
     SolutionMinimumAddToMakeParenthesesValid min = new SolutionMinimumAddToMakeParenthesesValid();
     int ans = min.minAddToMakeValid("()))((");
     System.out.println(ans);   
    }
}

class SolutionMinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        
        int openParenthesesCount =0;
        int closeParenthesesCount =0;
        
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == '('){
                openParenthesesCount++;
            }
            else{
                // to make sure there exists atleast one open parentheses (or we get -1)
                if(openParenthesesCount > 0){
                    openParenthesesCount--;
                }
                else{
                    closeParenthesesCount++;
                }
                   
            }
            
        }
        
        return closeParenthesesCount + openParenthesesCount;
        
    }
}