import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    
}
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        
        dfs(n,"",0,0,result);
        return result;
    }
    public void dfs(int n, String str, int opening, int closing, List<String> result){
        if(opening < closing){
            return;
        }
        if(n == 0){
            String s="";
            for(int i=0; i < ((2 * opening) - str.length()); i++){
                s = s.concat(")");
                
            }
            result.add(str.concat(s));
            return;
            
        }
        dfs(n-1, str.concat("("),opening + 1, closing, result);
       
        dfs(n, str.concat(")"),opening, closing + 1, result);
    }
}