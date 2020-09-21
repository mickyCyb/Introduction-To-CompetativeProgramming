/**
 * SearchA2DMatrix
 */
public class SearchA2DMatrix {

    public static void main(String[] args) {
        SolutionSearchA2DMatrix sol = new SolutionSearchA2DMatrix();
        boolean ans = sol.searchMatrix(new int[][]{
                                    {1,   3,  5,  7},
                                    {10, 11, 16, 20},
                                    {23, 30, 34, 50}
                                                    }, 3);
        System.out.println(ans);
    }
}

class SolutionSearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        // check for empty matrix 
        if(matrix.length ==0 || (matrix[0].length) ==0){
            return false;
        }
        
        int start = 0;
        int end = matrix.length -1;
        int row =0;
        // find the row where the target is located (log n)
        while(start <= end){
            int mid = start + (end - start)/2;
            if(matrix[mid][0] == target){
                return true;
            }
            else if(target > matrix[mid][0]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
            row = end;
        }
        // check if the row is in boundaries of the matrix
        if(row < 0 || row > matrix.length){
            return false;
        }
        //reset the start and end positions to proper place for the specific row
        start = 0;
        end = matrix[row].length-1;
        
        // find the target in the specific row (log m)
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(matrix[row][mid] == target){
                return true;
            }
            else if(target > matrix[row][mid]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return false;
    }
}