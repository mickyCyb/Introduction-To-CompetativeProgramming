/**
 * JumpGameIII
 */
import java.util.*;
public class JumpGameIII {

    public static void main(String[] args) {
        
    }
}

class SolutionJumpGameIII {
    public boolean canReach(int[] arr, int start) {

        Stack<Integer>stack = new Stack<>(); 
        HashSet<Integer> set = new HashSet<>();

        if(arr.length ==1 && arr[0] == 0){
            return true;
        }
        if(arr.length==1 && arr[0]!=0){
            return false;
        }

        stack.push(start);
        int temp =0;
        int left=0;
        int right=0;

        while(!stack.empty()){
            temp = stack.pop();
            set.add(temp);

            if(arr[temp] ==0){
                return true;
            }
            left  =temp - arr[temp];
            right =temp + arr[temp];

            if(left >=0 && !set.contains(left)){
                stack.push(left);
            }
            if(right <arr.length  && !set.contains(right)){
                stack.push(right);
            }
            
        }

        return false;
    }
}