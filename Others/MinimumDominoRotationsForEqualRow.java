/**
 * MinimumDominoRotationsForEqualRow
 */
public class MinimumDominoRotationsForEqualRow {

    public static void main(String[] args) {
        SolutionMinimumDominoRotationsForEqualRow dom = new SolutionMinimumDominoRotationsForEqualRow();
        int ans = dom.minDominoRotations(new int[]{2,1,2,4,2,2}, new int[]{5,2,6,2,3,2});
        System.out.println(ans);
    }
}

class SolutionMinimumDominoRotationsForEqualRow {
    public int minDominoRotations(int[] A, int[] B) {
        
        int minRotations =Math.min(rotate(A[0], A, B), rotate(B[0], A, B));
        minRotations = Math.min(minRotations, rotate(A[0], B, A));
        minRotations = Math.min(minRotations, rotate(B[0], B, A));
        
        if(minRotations != Integer.MAX_VALUE){
            return minRotations;
        }
        return -1;
        
    }
    
    public int rotate(int num, int[] A, int[] B){
        int moves = 0;
        
        for(int i=0;i<A.length;i++){
            if(A[i] != num && B[i] != num){
                return Integer.MAX_VALUE;
            }
            else if(A[i] != num){
                moves++;
            }
        }
        return moves;
    }
    
   
}