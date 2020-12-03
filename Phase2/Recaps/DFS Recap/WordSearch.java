class Solution {
    public boolean exist(char[][] board, String word) {
        
        // a dfs solution
        for(int i=0; i < board.length; i++){
            for(int j=0; j < board[0].length; j++){
                // boolean array to keep track of correctly visited grids
                if(word.charAt(0) == board[i][j]){
                    boolean [][] visited = new boolean[board.length][board[0].length];
                    boolean result = dfs(0, board, i, j, word, visited);
                    if(result){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean dfs(int index,char[][] board, int i, int j, String word, boolean[][] visited){
        // check boundaries and if the position on the grid corresponds to the character on the word
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] == true || word.charAt(index) != board[i][j]){
            
            return false;
        }
        if(index == word.length()-1){// we found the word in the grid
            return true;
        }
        
        visited[i][j] = true;   // mark the position on the grid as visited
        
        // check on all 4 sides of the given character for the correct next character
        boolean up = dfs(index+1, board, i-1, j, word, visited);
        boolean down = dfs(index+1, board, i+1, j, word, visited);
        boolean left = dfs(index+1, board, i, j-1, word, visited);
        boolean right = dfs(index+1, board, i, j+1, word, visited);
        
        if(up || down || left || right){
            return true;
        }
        else{// we didnt find a path through this character return and try others
            visited[i][j] = false;
            return false;
        }
    }
}


    ////////////////// using neighbour array  /////////////

// class Solution {
//     public boolean exist(char[][] board, String word) {
        
//         // a dfs solution
//         // using neighbour array
//         for(int i=0; i < board.length; i++){
//             for(int j=0; j < board[0].length; j++){
//                 // boolean array to keep track of correctly visited grids
//                 if(word.charAt(0) == board[i][j]){
//                     boolean [][] visited = new boolean[board.length][board[0].length];
//                     boolean result = dfs(0, board, i, j, word, visited);
//                     if(result){
//                         return true;
//                     }
//                 }
//             }
//         }
//         return false;
//     }
    
//     public boolean dfs(int index,char[][] board, int i, int j, String word, boolean[][] visited){
        
//         if(index == word.length()-1){// we found the word in the grid
//             return true;
//         }
        
//         int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
//         visited[i][j] = true;
//         for(int[] direction : directions){
//             int r = i + direction[0];
//             int c = j + direction[1];
            
//             if(r < 0 || r >= board.length || 
//                c < 0 || c >= board[0].length || 
//                visited[r][c] == true || 
//                word.charAt(index+1) != board[r][c]){
            
//                continue;
//             }
            
//             if(dfs(index+1, board, r, c, word, visited)){
//                 return true;
//             }
//         }
//         // check boundaries and if the position on the grid corresponds to the character on the word
        
        
//             visited[i][j] = false;
//             return false;
//         }
    
// }