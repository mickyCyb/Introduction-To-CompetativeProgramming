class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefix = new int[m][n];
        int[][] result = new int[m][n];
        
        prefix[0][0] = mat[0][0]; 
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0){
                    continue;
                }
                if(i == 0){
                    prefix[0][j] = prefix[0][j - 1] + mat[i][j];
                }else if(j == 0){
                    prefix[i][0] = prefix[i - 1][j] + mat[i][j];
                }else{
                    prefix[i][j] = mat[i][j] + prefix[i][j - 1] + prefix[i - 1][j] - prefix[i - 1][j - 1];
                }
            }
        }
        // System.out.println(Arrays.deepToString(prefix));
        
         for(int i = 0; i < m; i++){
            int iLow = Math.max(i - k, 0);
            int iHigh = Math.min(i + k, m - 1);
            for(int j = 0; j < n; j++){
                int jLow = Math.max(j - k, 0);
                int jHigh = Math.min(j + k, n - 1);
                if(iLow == 0 && jLow == 0){
                    result[i][j] = prefix[iHigh][jHigh];
                }
                else if(iLow == 0){
                    result[i][j] = prefix[iHigh][jHigh] - prefix[iHigh][jLow - 1];
                }
                else if(jLow == 0){
                    result[i][j] = prefix[iHigh][jHigh] - prefix[iLow - 1][jHigh];
                }else{
                    result[i][j] = prefix[iHigh][jHigh] - prefix[iHigh][jLow - 1] - prefix[iLow - 1][jHigh] + prefix[iLow - 1][jLow - 1];
                }
            }
        }
        return result;
    }
}

// [[1,2,3],
//  [4,5,6],
//  [7,8,9]]
 
// [[12,21,16],
//  [27,45,33],
//  [24,39,28]]