/**
 * MaxIncreaseToKeepCitySkyline
 */
public class MaxIncreaseToKeepCitySkyline {

    public static void main(String[] args) {
        SolutionMaxIncrease  maxInc = new SolutionMaxIncrease();
        int ans =maxInc.maxIncreaseKeepingSkyline( new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0} });
        System.out.println(ans);
    }
}

class SolutionMaxIncrease {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int totalSum=0;

        int[] topMax = new int[grid[0].length];
        int[] rightmax = new int[grid.length];

        int max = Integer.MIN_VALUE;

        for(int i=0; i<grid.length;i++){
            max = Integer.MIN_VALUE;
          for(int j = 0; j < grid[i].length; j++){
            max = Math.max(max, grid[i][j]);    
          }

          rightmax[i] = max;

        }

        max = Integer.MIN_VALUE;
        for(int i = 0; i < grid[0].length;i++){
            max = Integer.MIN_VALUE;
            for(int j = 0; j < grid.length; j++){
              max = Math.max(max, grid[j][i]);    
            }
  
            topMax[i] = max;
  
        }


        // System.out.println();
        // for (int i : rightmax) {
        //     System.out.print(i + ", ");
        // }
        // System.out.println();

        int currentMin=0;
        for(int c=0; c<grid.length;c++){
            for(int r=0;r <grid[c].length;r++){
                currentMin =Math.min(topMax[r], rightmax[c]);
               // System.out.println(currentMin);
                // if(grid[r][c]< currentMin){
                    totalSum += currentMin - grid[r][c];
                    grid[r][c] = currentMin;
                // }
            }
        }


        return totalSum;
    }
}