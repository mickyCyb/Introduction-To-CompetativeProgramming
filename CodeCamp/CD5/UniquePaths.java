/**
 * UniquePaths
 */
public class UniquePaths {

    public static void main(String[] args) {
        
        SolutionUniquePaths solutionUniquePaths= new SolutionUniquePaths();
        int ans = solutionUniquePaths.uniquePaths(7, 3);
        System.out.println(ans);
    }
}

class SolutionUniquePaths {
    public int uniquePaths(int m, int n) {
        
        int[][] path = new int[m][n];

        // the right path of the first row is initialized with 1
        for(int i=0; i<path.length; i++){
            path[i][0] = 1;
        }
        // the down/bottom path of the column is initialized with 1 
        for(int i=0; i<path[0].length;i++){
            path[0][i] = 1;
        }
        // calculate and put at the index the unique moves that can be taken to that position
        for(int i=1; i<path.length; i++){

            for(int j=1; j <path[i].length; j++ ){
                path[i][j] = path[i-1][j] + path[i][j-1];
            }
        }

        // we reached our destination which is the right bottom position. just return the last position
        return path[m-1][n-1];
    }
}