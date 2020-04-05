/**
 * RottingOranges
 */
import java.util.*;
public class RottingOranges {

    public static void main(String[] args) {
        
    }
}

class SolutionRottingOranges {
    public int orangesRotting(int[][] grid) {
        
        int freshOrangeCount=0;
        Queue<int[]> queueRotten = new LinkedList<>();
        
        // first find the existence of 0 and 1 in the grid
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 2){
                    queueRotten.add(new int[]{row,col});
                }
                if(grid[row][col] ==1){
                    freshOrangeCount++;
                }
            }
        }
        // if there is no fresh orange in the grid that means there is nothing to rote,so return 0
        if(freshOrangeCount == 0){
            return 0;
        } 
        // these are the direactions we can move at a time
        int [][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        int minutes=0;
        
        while(!queueRotten.isEmpty()){
            int size = queueRotten.size();
            minutes ++;
            for(int i = 0; i < size; i++){
                int[] current = queueRotten.poll();
                
                for(int[] dir : directions){
                    int x =current[0] + dir[0]; //the x coordinate of a 2  +  the next move in all x directions
                    int y =current[1] + dir[1]; //the y coordinate of a 2  +  the next move in all y directions
                    
                    if(y<0 || y>=grid[0].length || x<0 || x>=grid.length || grid[x][y] ==0 || grid[x][y] == 2){
                        continue;
                    }
                    grid[x][y] = 2;
                    freshOrangeCount--;
                    queueRotten.add(new int[]{x,y});
                }
            }
        }
        if(freshOrangeCount ==0){
            return minutes -1;
        }
        return -1;
    }
}