import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomPickwithWeight {
    
}
class Solution {
    int totalSum;
    int[] bound;

    public Solution(int[] w) {
        bound = new int[w.length];
        bound[0] = w[0];
        totalSum = w[0];
        for(int i = 1; i < w.length; i++) {
            bound[i] = bound[i-1] + w[i];
            totalSum += w[i];
        }
    }
    
    public int pickIndex() {
        int rand = 0;
        if(totalSum == 1) {
            rand = 1;
        } else if(totalSum > 1) {
            rand = ThreadLocalRandom.current().nextInt(1, totalSum+1);
        }           
        int position = Arrays.binarySearch(bound, rand);
        if(position >= 0) {
            return position;
        } else {
            return (position * -1) -1;
        }
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */