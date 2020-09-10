public class CountServersThatCommunicate{
    public static void main(String[] args) {
        
        SolutionCountServersThatCommunicate sol = new SolutionCountServersThatCommunicate();
        int ans = sol.countServers(new int[][]{ 
                {1,1,0,0},
                {0,0,1,0},
                {0,0,1,0},
                {0,0,0,1}}
            );
            System.out.println(ans);
    }
}


class SolutionCountServersThatCommunicate {
    public int countServers(int[][] grid) {
        
        
        int sum=0;
        // these two arrays are used to track how many 1's are there in each row an column
        int[] row = new int[grid.length];
        int[] column = new int[grid[0].length];
        for(int i=0; i < grid.length; i++){
            for(int j =0; j < grid[0].length; j++){
                if(grid[i][j] ==1){
                row[i]++;
                column[j]++;
                }
            }
           
        }
        
        for(int i=0; i < grid.length; i++){
            for(int j =0; j < grid[0].length; j++){
                if(grid[i][j] ==1){
                    if(row[i] > 1 || column[j] > 1 ){
                        sum++;
                    }
                }
            }
           
        }
        return sum;
    }
}

// [1,1,0,0],
// [0,0,1,0],
// [0,0,1,0],
// [0,0,0,1]