/**
 * PlaywithChips
 */
public class PlaywithChips {

    public static void main(String[] args) {
        SolutionPlaywithChips solutionPlaywithChips = new SolutionPlaywithChips();
        int ans = solutionPlaywithChips.minCostToMoveChips(new int[]{2,2,2,3,3});
        System.out.println(ans);
    }
}

class SolutionPlaywithChips {
    public int minCostToMoveChips(int[] chips) {
       
        int evenCount =0; 
        int oddCount =0;
        
        // cost from odd number to another odd is 0
        // cost from even number to another even is 0
        // cost from event to odd or odd to even is 1. 
        // if there are n odd and m even numbers, we need minimum of m and n to satisfy our condition. we need
        // to go m or n times to the other number with different parity
        for(int i=0; i< chips.length;i++){
            if(chips[i]%2 ==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        
        return Math.min(evenCount,oddCount);
    }
}