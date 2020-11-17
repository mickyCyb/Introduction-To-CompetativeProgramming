class Solution {
    public int numIslands(char[][] grid) {  // dfs approach
        
        if(grid.length == 0 || grid == null){
            return 0;
        }
        
        int islands = 0;
        for(int i=0; i < grid.length; i++ ){
            for(int j=0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    islands += dfs(grid,i,j);
                }
            }
        }
        return islands;
    }
    public int dfs(char[][] grid, int i, int j){
        
        // check the boundaries
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return 0;
        }
        grid[i][j] = '0';   // mark as visited (making it '0' would mean it is visited)
        // do dfs on all connected area with value 1
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        
        return 1;    // connected 1's are counted as one island so we return 1 as a result of the dfs
    }
}