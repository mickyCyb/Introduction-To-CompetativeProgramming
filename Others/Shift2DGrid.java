/**
 * Shift2DGrid
 */
import java.util.List;
import java.util.ArrayList;

public class Shift2DGrid {

    public static void main(String[] args) {
        
    }
}

class SolutionShift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        List<List<Integer>> shiftedGrid = new ArrayList<>();
        int rowSize = grid.length;
        int columnSize = grid[0].length;
        
        for(int row = 0; row < rowSize; row++){
            List<Integer> shiftedRow = new ArrayList<>();
            shiftedGrid.add(shiftedRow);
            
            for (int col = 0; col < columnSize; col++) {
                shiftedRow.add(0);
            }
        }
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < columnSize; col++) {
                int newCol = (col + k) % columnSize;
                int wrapAroundCount = (col + k) / columnSize;
                int newRow = (row + wrapAroundCount) % rowSize;
                shiftedGrid.get(newRow).set(newCol, grid[row][col]);
            }
        }
        
        return shiftedGrid;
    }
}