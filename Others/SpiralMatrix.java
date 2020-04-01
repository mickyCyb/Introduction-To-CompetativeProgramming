/**
 * SpiralMatrix
 */
import java.util.*;
public class SpiralMatrix {

    public static void main(String[] args) {
        SolutionSpiralMatrix solutionSpiralMatrix = new SolutionSpiralMatrix();
        solutionSpiralMatrix.spiralOrder(new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
    }
}

class SolutionSpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> resultList = new ArrayList<>();
       
        // check if the matrix is initially empty
        if(matrix.length == 0){
            return resultList;
        }
        
        int top = 0;
        int bottom = matrix.length -1; // n -1
        int left = 0; 
        int right = matrix[0].length -1; // m-1
        // the totsl size of the matrix
        int totalSize = matrix.length * matrix[0].length;
        
        // while the new list doent exceed thr totsl elements of the matrix
        while(resultList.size() < totalSize){
            
            // loop to add the elements starting from left to right
            for(int i=left; i <= right && resultList.size() < totalSize ; i++){
                resultList.add(matrix[top][i]);
            }
            top++; // increment top by 1 so that it is not added when the loops runs again 
            
            // loop to add the elements starting from top to bottom
            for(int j = top; j <= bottom && resultList.size() < totalSize; j++ ){
                resultList.add(matrix[j][right]);
            }
            right--; // decrement right by 1 so that it is not added when the loops runs again 
            
            // loop to add the elements starting from right to left
            for(int k = right; k >= left && resultList.size() < totalSize; k-- ){
                resultList.add(matrix[bottom][k]);
            }
            bottom--;
            // loop to add the elements starting from bottom to top
            for(int p = bottom; p >= top && resultList.size() < totalSize; p-- ){
                resultList.add(matrix[p][left]);
            }
            left++;
            
        }
        // for(int i=0;i< resultList.size();i++){
        //     System.out.print(resultList.get(i));
        //     System.out.print(",");
        // }
            
        return resultList;

    
    }
}