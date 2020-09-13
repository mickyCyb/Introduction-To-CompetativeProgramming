import java.util.Arrays;

/**
 * SpiralMatrixII
 */
public class SpiralMatrixII {

    public static void main(String[] args) {
        SolutionSpiralMatrixII sol = new SolutionSpiralMatrixII();
        int[][] ans = sol.generateMatrix(3);
        for(int i=0; i<ans.length;i++){
            for(int j=0; j<ans[0].length;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class SolutionSpiralMatrixII {
    public int[][] generateMatrix(int n) {
        
        int[][] result = new int[n][n];
        
        int columnBegin = 0;
        int columnEnd = n-1;
        int rowBegin = 0;
        int rowEnd = n-1;
        int num =1;
        
        while (rowBegin <= rowEnd && columnBegin <= columnEnd){
            
            for(int i = columnBegin; i <= columnEnd; i++){
                result[rowBegin][i] = num;
                num++;
            }
            rowBegin++;
            
            for(int i = rowBegin; i <= rowEnd; i++){
                result[i][columnEnd] = num;
                 
                num++;
            }
            columnEnd--;
            
            if(rowBegin <= rowEnd){
                for(int i=columnEnd; i>= columnBegin; i--){
                    result[rowEnd][i] = num;
                    
                    num++;
                }
                rowEnd--;
            }
            
            if(columnBegin <= columnEnd){
                for(int i=rowEnd; i>= rowBegin; i--){
                    result[i][columnBegin] = num;
                    num++;
                }
                columnBegin++;
                
            }
        }
        return result;
    }
}