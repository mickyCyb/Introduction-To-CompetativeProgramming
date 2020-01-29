/**
 * GetEqualSubstringsWithinBudget
 */
public class GetEqualSubstringsWithinBudget {

    public static void main(String[] args) {
        
        SolutionGetEqualSubstrings solutionGetEqualSubstrings = new SolutionGetEqualSubstrings();
        int ans = solutionGetEqualSubstrings.equalSubstring("abcd", "bcdf", 3);
        System.err.println(ans);
        
    }
}

class SolutionGetEqualSubstrings {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int[] arr = new int[s.length() + 1];
        arr[0] = 0;
        int frontPointer = 0;
        int lastPointer = 0;
        int max_len =0;
       
        int sum =0;
        
        for(int i=1; i<arr.length; i++){
            sum += Math.abs( s.charAt(i-1) - t.charAt(i-1) );
           arr[i] = sum;
       }
        
       
       while (lastPointer <arr.length) {
           long temp = arr[lastPointer] - arr[frontPointer];

           if (temp <= maxCost) {
               max_len = Math.max(lastPointer - frontPointer, max_len);
               lastPointer++;
           }
           else{
               frontPointer++;
           }
       }
        
        return max_len;

            
        
        }
    }
