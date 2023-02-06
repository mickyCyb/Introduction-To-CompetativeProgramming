import java.util.Stack;

public class CrawlerLogFolder {
    
}
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        int i = 0;

        while(i < logs.length){
            if(logs[i].equals("./")){
                i++;
                continue;
            }else if(!stack.isEmpty() && logs[i].equals("../")){
                stack.pop();
            }else if(!logs[i].equals("../")){
                stack.push(logs[i]);
            }
            i++;
        }
        return stack.size();
    }
}
