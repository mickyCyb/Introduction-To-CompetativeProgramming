class Solution {
    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        
        for(int i=0; i< address.length();i++){
            if(address.charAt(i) == '.'){
                builder.append("[.]");
            }else{
                builder.append(address.charAt(i));
            }
        }
        return builder.toString();
    }
}