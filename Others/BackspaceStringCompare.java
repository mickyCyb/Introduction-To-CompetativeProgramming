class Solution {
    public boolean backspaceCompare(String S, String T) {
        int s = S.length() -1;
        int t = T.length() -1;
        int sCount = 0;
        int tCount = 0;
        
        // using two pointer s and t, starting from the end is easier to determine which
        // characters to remove.
        while(s >= 0 || t >= 0){ // check bpundaries
            while(s >= 0){  // find position of character to compare with T 
                if(S.charAt(s) == '#'){
                    sCount++;
                    s--;
                }
                else if(sCount > 0){
                    sCount--;
                    s--;
                }
                else{   // if we don't break, this while loop will only run for S with out                                comapring it with T
                    break;
                }
            }
            
            while(t >= 0){  // find position of character to compare with S
                if(T.charAt(t) == '#'){
                    tCount++;
                    t--;
                }
                else if(tCount > 0){
                    tCount--;
                    t--;
                }
                else{
                    break;
                }
            }
            // compare the characters after skipping some characters because of #
            if(s >= 0 && t >= 0 && S.charAt(s) != T.charAt(t)){
                return false;
            }
            if(s >=0 != t >= 0){ // check if we have nothing to compare on both strings
                return false;     // both must be empty after removing #,or they are not equal
            }
            s--;
            t--;
            
            
        }
        return true;
    }
}