import java.util.*;
public class LongestStringChain {
    
}

class Solution {

    HashSet<String> wordDict;
    HashMap<String, Integer> memo;

    public int longestStrChain(String[] words) {
        wordDict = new HashSet<>();
        Collections.addAll(wordDict, words); 

        int maxPath = 1;
        memo = new HashMap<>();
        for(String word: words){
            maxPath = Math.max(maxPath, dfs(word));
        } 
        return maxPath;
    }

    public int dfs(String word) {
        if(memo.containsKey(word)){
            return memo.get(word); 
        }

        StringBuilder sb = new StringBuilder(word);
        int maxPath = 0;
        for(int i = 0; i < word.length(); i++) {
            sb.deleteCharAt(i);
            String prevWord = sb.toString();
            if(wordDict.contains(prevWord)){
                maxPath = Math.max(maxPath, dfs(prevWord));
            }    
            sb.insert(i, word.charAt(i));
        }
        memo.put(word, maxPath + 1); // store the result
        return memo.get(word);
    }
}
