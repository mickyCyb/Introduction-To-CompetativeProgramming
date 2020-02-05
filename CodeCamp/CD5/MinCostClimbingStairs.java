/**
 * MinCostClimbingStairs
 */
public class MinCostClimbingStairs {

    public static void main(String[] args) {
        SolutionMinCostClimbingStairs minCost = new SolutionMinCostClimbingStairs();
        int ans = minCost.minCostClimbingStairs(new int[]{10,15,20});
        System.out.println(ans);
    }
}

class SolutionMinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        
        // because the step can be taken from steps that are two steps behind
        // and choosing the minimum step
        for(int i=2; i<cost.length; i++){
            
            // add the summation of the previous taken stairs path to the current stair
            cost[i] += Math.min(cost[i-1],cost[i-2]);
        }
        // at the last index return the minimum of the last two elements as the final answer.
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }
}