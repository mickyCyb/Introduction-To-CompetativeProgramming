
public class MinimumRecolorstoGetKConsecutiveBlackBlocks {
    
}

class Solution {
    public int minimumRecolors(String blocks, int k) {
         int min = k;
         int whiteBlockCount = 0;

        for(int i = 0; i < blocks.length(); i++) {
            if(blocks.charAt(i) == 'W'){
                whiteBlockCount++;
            }     
            if(i >= k - 1) {
                if(i-k >= 0 && blocks.charAt(i - k) == 'W'){
                    whiteBlockCount--;
                }
                min = Math.min(min, whiteBlockCount);
            }
        }
        
        return min;
    }
}
