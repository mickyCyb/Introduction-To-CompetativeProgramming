
public class PairsofSongsWithTotalDurationsDivisibleby60 {
    
}
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        int[] mod = new int[60];
        for(int num : time){
            mod[num % 60]++;            
        }
        
        int count =0;
        for(int i=0; i <= 30; i++){
            if(i == 0 || i == 30){
                int n = mod[i];
                count += (n * (n-1))/2;
            }else{
                count += mod[i] * mod[60 - i];
            }
        }
        // System.out.println(Arrays.toString(mod));
        return count;
        
    }
}