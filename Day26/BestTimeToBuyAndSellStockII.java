/**
 * BestTimeToBuyAndSellStockII
 */
public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        
        SolutionBestTimeToBuyAndSellStockII bestTime = new SolutionBestTimeToBuyAndSellStockII();
        int ans = bestTime.maxProfit(new int[]{7,1,5,3,1,4});
        System.out.println(ans);
    }
}

class SolutionBestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        if(prices.length == 0){
            return 0;
        }

        for(int i=0; i<prices.length-1;i++){
            if(prices[i+1] - prices[i] > 0){
                profit+=prices[i+1] - prices[i];
            }
        }


        return profit;
    }
}