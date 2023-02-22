import java.util.HashMap;

public class IsomorphicStrings {
    
}
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null || t ==null){
            return false;
        }
        
        HashMap<Character,Character> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);
            
            if(map.containsKey(char_s)){
                if(map.get(char_s)!=char_t){
                return false;
                }
            }
            else{
                if(map.containsValue(char_t)){
                    return false;
                }
                map.put(char_s,char_t);
            }
            
        }
        return true;
    }
}