
public class CountingWordsWithaGivenPrefix {
    
}

class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int count = 0;
        int len = pref.length();
        for(String word : words){
            if(len <= word.length()){
                if(word.substring(0,len).equals(pref)){
                    count++;
                }
            }  
        }
        return count;
    }
}
