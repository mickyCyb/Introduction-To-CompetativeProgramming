/**
 * CountNegativeNumbersInASortedMatrix
 */
public class CountNegativeNumbersInASortedMatrix {

    public static void main(String[] args) {
        SolutionCountNegativeNumbers count  = new SolutionCountNegativeNumbers();
        int ans = count.countNegatives(new int[][]{{4,3,2,1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}});
        System.out.println(ans);
    }
}

class SolutionCountNegativeNumbers {
    public int countNegatives(int[][] grid) {
        
        //     int negativeCount =0;

        //     for(int i=0; i< grid.length;i++){
        //         for(int j=0; j<grid[0].length -1;j++){
        //             if(grid[i][j] < 0){
        //                 negativeCount++;
        //             }
        //         }
        //     }
        //     return negativeCount;


        int result=0;
        for(int i=grid.length-1; i>=0; i--){
            for(int j=grid[0].length-1; j>=0; j--){
                if(grid[i][j] >=0){
                    break;
                }
                else{
                    result++;
                }
            }
        }

        return result;
    }
}