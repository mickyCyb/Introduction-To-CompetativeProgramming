    // bruteforce solution 

// class Solution {
//     public int countBattleships(char[][] board) {
     
//         int battleFields =0;
        
//         for(int i=0; i < board.length; i++){
//             for(int j=0; j < board[0].length; j++){
//                 if(board[i][j] == 'X'){
//                     count(board, i, j);
//                     battleFields++;
//                 }
//             }
//         }
//         return battleFields;
//     }
    
//     public void count(char[][] board, int i, int j){
        
//         if(i<0 || i>=board.length || j<0 || j >= board[0].length || board[i][j] != 'X'){
//             return;
//         }
//         board[i][j] = '.';
//         count(board, i, j+1);
//         count(board, i-1,j);
//         count(board, i+1,j);
//         count(board, i, j-1);
        
//     }
// }


    // effircient solution

class Solution {
    public int countBattleships(char[][] board) {
     
        int battleFields =0;
        // using the rules provided( horizontala and vertical placement)
        for(int i=0; i < board.length; i++){
            for(int j=0; j < board[0].length; j++){
                if(board[i][j] == '.'){                   
                    continue;
                }
                if(j > 0 && board[i][j-1] == 'X'){
                    continue;
                }
                if(i > 0 && board[i-1][j] =='X'){
                    continue;
                }
                battleFields++;
            }
        }
        return battleFields;
    }
}    