import java.util.Deque;
import java.util.LinkedList;

public class SimplifyPath {
    
}
class Solution {
    public String simplifyPath(String path) {

        Deque<String> stack = new LinkedList<>();

        for(String s: path.split("/")){
            if(s.equals("..")){
                System.out.println("fff");
                stack.pollLast();
            }else if(!s.equals("") && !s.equals(".")){
                stack.add(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        
        if(stack.size() == 0){
            return "/";
        }
        while(stack.size() != 0){
            sb.append("/").append(stack.poll());
        }
        return sb.toString();
    }
}