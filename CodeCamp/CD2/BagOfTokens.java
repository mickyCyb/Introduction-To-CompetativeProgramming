/**
 * BagOfTokens
 */
import java.util.Arrays;
public class BagOfTokens {

    public static void main(String[] args) {
        SolutionBagOfTokens sol = new SolutionBagOfTokens();
        int ans = sol.bagOfTokensScore(new int[]{100,200,300,400}, 200);
        System.out.println(ans);
    }
}

class SolutionBagOfTokens {
    public int bagOfTokensScore(int[] tokens, int P) {
       
        Arrays.sort(tokens);
        
        int front = 0;
        int last = tokens.length - 1;
        int tempPoint = 0;
        int maxPoint = 0;
        
        // we use this method because if we have a point to get tokens
        // we want to add the token with large value which is found at 
        // the end of the array
        while(front <= last){
            
            if(P >= tokens[front]){
                // we use our power to get point
                P -= tokens[front];
                tempPoint ++;
                maxPoint = Math.max(maxPoint, tempPoint);
                front++;
            }
            else if(tempPoint > 0){
                // use our points to get the max token 
                tempPoint --;
                P +=tokens[last];
                maxPoint = Math.max(maxPoint, tempPoint);
                last--;

            }
            else{
                return maxPoint;
            }
        }
        return maxPoint;
    }
}