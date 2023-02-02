
public class NumberofWaystoSelectBuildings {
    
}

class Solution {
    public long numberOfWays(String s) {
        
        long oneCount = 0;
        long zeroCount = 0;

        for(char ch : s.toCharArray()){
            if(ch == '0'){
                zeroCount++;
            }else{
                oneCount++;
            }
        }

        long prevZeros = 0;
        long prevOnes = 0;

        if(s.charAt(0) == '0'){
            prevZeros = 1;
        }else{
            prevOnes = 1;
        }

        long res = 0;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                res += (prevOnes * (oneCount - prevOnes));
                prevZeros++;
            }else{
                res += (prevZeros * (zeroCount - prevZeros));
                prevOnes++;
            }
        }
        return res;
    }
}