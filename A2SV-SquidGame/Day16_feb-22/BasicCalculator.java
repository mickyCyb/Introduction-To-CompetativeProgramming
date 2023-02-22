import java.util.Stack;

public class BasicCalculator {
    
}
class Solution {
    public int calculate(String s) {
        
        Stack<Integer> stack = new Stack<>();
        int len = s.length();
        int totalSum = 0;
        int sign  = 1;
        
       for(int i=0; i < len; i++){
           
           char ch = s.charAt(i);
           if(ch == ' '){
               continue;
           }
           
           int num = 0;
           if(Character.isDigit(ch)){
               num = num * 10 + ch - '0';
               
               while(i+1 < len && Character.isDigit(s.charAt(i+1))){
                   num = num *10 + s.charAt(i+1) - '0';
                   i++;
               }
               totalSum += num * sign;
           }else if(ch == '('){
               stack.push(totalSum);
               stack.push(sign);
               totalSum = 0;
               sign = 1;
               
           }else if(ch == ')'){
               totalSum = totalSum * stack.pop() + stack.pop();
               
           }else if(ch == '+'){
               sign = 1;
               
           }else if(ch == '-'){
               sign = -1;
           }
           
       }
        return totalSum;
    }
}