class Solution {
    public String licenseKeyFormatting(String S, int K) {
        
        StringBuilder builder = new StringBuilder();
        int size = K;
        for(int i = S.length()-1; i >=0; i--){
            if(S.charAt(i) == '-'){
                continue;
                
            }
            if(size == 0){
                builder.insert(0,'-');
                builder.insert(0,S.charAt(i));
                size = K-1;
            }
            else{
                builder.insert(0,S.charAt(i));
                size--;
            }
            
        }
        return builder.toString().toUpperCase();
    }
}