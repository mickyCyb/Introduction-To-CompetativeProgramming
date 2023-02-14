
public class MinimumDeletionstoMakeStringBalanced {
    
}
class Solution {
    public int minimumDeletions(String s) {
        int i = 0;
        for(i = 0; i < s.length(); i++){
            if(s.charAt(i)=='b')
                break;
        }
        int countflips = 0;
        int countb = 0;
        for(i=i; i < s.length(); i++){
            if(s.charAt(i)=='a') countflips++;
            
            else countb++;
            
            countflips = Math.min(countflips, countb);
        }    
        return countflips;
    }
}
