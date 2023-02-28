
public class MaximalSquare {
    
}
class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int[][] dp=new int[matrix.length][matrix[0].length];
        
        int omax=0;
        for(int i = matrix.length-1; i >= 0; i--){
            for(int j = matrix[0].length-1; j >= 0; j--){
                if(i == matrix.length-1 || j == matrix[0].length-1){
                    dp[i][j] = matrix[i][j]- '0';
                }else{
                    if(matrix[i][j] == '0'){
                        dp[i][j] = 0;
                    }else{
                        dp[i][j] = Math.min(dp[i+1][j],Math.min(dp[i+1][j+1],dp[i][j+1]))+1;
                    }
                }
                omax = Math.max(omax,dp[i][j]);
            }
        }
        return omax * omax;
    }
}
