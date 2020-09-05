public class RepeatedSubstringPattern{
    public static void main(String[] args) {
        SolutionRepeatedSubstringPattern sol = new SolutionRepeatedSubstringPattern();
        boolean ans = sol.repeatedSubstringPattern("ababab");
        System.out.println(ans);
    }
}
class SolutionRepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        
        int len = s.length();
        
        for(int i= len/2; i>=1;i--){
            
            if(len % i == 0){
                int repeatTimes = len/i;
                
                String mainStr = s.substring(0,i);
                StringBuilder builder = new StringBuilder();
                
                for(int j=0; j<repeatTimes;j++){
                    builder.append(mainStr);
                }
                if(builder.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}