public class SearchA2DMatrixll{
	public static void main(String[] args) {
		
	}
}

class SolutionSearchA2DMatrixll {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // n log m solution (15ms)
//         if(matrix.length ==0 || (matrix[0].length) ==0){
//             return false;
//         }
//         int startRow =0;
//         int front =0;
//         int last = matrix[0].length-1;
        
//         while(startRow < matrix.length && target >= matrix[startRow][0]){
//             while(front <= last){
                
//                 int mid = front + (last - front)/2;

//                 if(matrix[startRow][mid] == target){
//                     return true;
//                 }
//                 else if(target > matrix[startRow][mid]){
//                     front = mid+1;
//                 }
//                 else{
//                     last = mid -1;
//                 } 
//             }
//             front =0;
//             last =matrix[0].length-1;
//             startRow++;
//         }
//         return false;
        
        // O(m + n) solution
        if(matrix.length ==0 || (matrix[0].length) ==0){
            return false;
         }
        int row = matrix.length -1;
        int col =0 ;
        
        while(row >= 0 && col <= matrix[0].length-1){
            
            if(matrix[row][col] == target){
                return true;
            }
            else if(target < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
}