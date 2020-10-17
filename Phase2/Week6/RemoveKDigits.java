public class RemoveKDigits{
	public static void main(String[] args) {
		
	}
}

class Solution {
    public String removeKdigits(String num, int k) {
        
        if(num.length() == k){
            return "0";
        }
        
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        
        for(int i=0; i<num.length(); i++){
            while( !stack.isEmpty() && k > 0 && stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        // if all the characters are the same or the numbers are sorted in ascending order the above loop won't help, 
        // so this while loop will do the removing of only k elements
        if(k > 0){
            while(k>0){
                stack.pop();
                k--;
            }
        }
        
        while(!stack.isEmpty()){
         builder.append(stack.pop());   
        }
        builder.reverse(); 	// sice stack reverses the original order, reversing back is necessary
        while(builder.length() > 1 && builder.charAt(0) == '0'){
            builder.deleteCharAt(0);
        }
        
        return builder.toString();
        
    }
}