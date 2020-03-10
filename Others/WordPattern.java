/**
 * WordPattern
 */
import java.util.*;
// Question link https://leetcode.com/problems/word-pattern/
public class WordPattern {

    public static void main(String[] args) {
        SolutionWordPattern solutionWordPattern = new SolutionWordPattern();
        boolean ans = solutionWordPattern.wordPattern("abba", "dog cat cat dog");
        System.out.println(ans);
    }
}

class SolutionWordPattern {
    public boolean wordPattern(String pattern, String str) {
        
        
        HashMap<Character,String> map = new HashMap<>();
        String []arr = str.split(" ");
        if(arr.length!=pattern.length()){
            return false;
        }
        for(int i=0; i<pattern.length();i++){
            
            char ch = pattern.charAt(i);
            String st = arr[i];
            
            if(map.containsKey(ch)){
                String value = map.get(ch);
                if(!value.equals(st)){
                    return false;
                }
            }
            else{
                if(map.containsValue(st)){
                    return false;
                }
                    
                map.put(ch,st);    
            }
        }
        return true;
        
    }
}