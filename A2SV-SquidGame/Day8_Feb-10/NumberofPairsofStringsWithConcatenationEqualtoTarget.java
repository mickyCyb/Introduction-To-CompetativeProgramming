import java.util.HashMap;

public class NumberofPairsofStringsWithConcatenationEqualtoTarget {
    
}
class Solution {

    public int numOfPairs(String[] nums, String target) {
        
        HashMap<Integer, Integer> prefix = new HashMap<>();
        HashMap<Integer, Integer> suffix = new HashMap<>();
        int count = 0;
        int n = target.length();

        for (String num : nums) {
            int len = num.length();
            if (target.startsWith(num)) {
                count += suffix.getOrDefault(n - len, 0);
            }
            if (target.endsWith(num)) {
                count += prefix.getOrDefault(n - len, 0);
            }
            if (target.startsWith(num)) {
                prefix.put(len, 1 + prefix.getOrDefault(len, 0));
            }
            if (target.endsWith(num)) {
                suffix.put(len, 1 + suffix.getOrDefault(len, 0));
            }
        }
        return count;
    }
}