
public class AddBinary {
    
}
class Solution {
    public String addBinary(String a, String b) {
        
        int len1 = a.length()-1;
        int len2 = b.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry =0;
        
        while(len1 >=0 || len2 >=0){
            int total = carry;
            
            if(len1 >= 0){
                total += a.charAt(len1--) - '0'; 
            }
            if(len2 >= 0){
                total += b.charAt(len2--) - '0'; 
            }
            sb.append(total % 2);
            carry = total / 2; 
        }
        if(carry != 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}