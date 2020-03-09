/**
 * IsomorphicStrings
 */
import java.util.*;
public class IsomorphicStrings {

    public static void main(String[] args) {
        SolutionIsomorphicStrings solutionIsomorphicStrings = new SolutionIsomorphicStrings();
        boolean ans = solutionIsomorphicStrings.isIsomorphic("paper", "title");
        System.out.println(ans);
    }
}

class SolutionIsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null || t ==null){
            return false;
        }
        
        HashMap<Character,Character> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);
            
            // if the chararacter is appears again
            if(map.containsKey(char_s)){
                // and this time it maps to different character other than the previous one
                //"ab" & "aa"
                if(map.get(char_s)!=char_t){
                return false;
                }
            }
            else{
                // character appears for the first time but the value pair existed before, which is not a unique pair
                if(map.containsValue(char_t)){
                    return false;
                }
                
                map.put(char_s,char_t);
            }
            
        }
        return true;
    }
}