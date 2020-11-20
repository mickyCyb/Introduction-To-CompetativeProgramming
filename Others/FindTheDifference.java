class Solution {
    public char findTheDifference(String s, String t) {
        int[] S = new int[26];
        
        for(int i = 0; i < s.length();i++){
            S[s.charAt(i) - 'a']+=1;
        }
        for(int i = 0; i < t.length();i++){
            S[t.charAt(i) -'a']--;
            if(S[t.charAt(i) -'a'] < 0){
                return t.charAt(i);
            }
        }
        return t.charAt(0);




        //using bit manipulation

        // char xor = 0; 
        
        // // using bit manipulation, when characters xor with each other they cancel out, the 
        // // remaining one is the difference
        // for(char ch: s.toCharArray() ){
        //     xor ^= ch;
        // }
            
        // for(char ch: t.toCharArray() ){
        //     xor ^= ch;
        // }
            
        // return xor;
    }
}