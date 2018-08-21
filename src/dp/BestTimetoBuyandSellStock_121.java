package dp;

public class BestTimetoBuyandSellStock_121 {
	
	/**
	 *  简单的dp 想法
	 *  每次计算，记录，下次计算和上次比
	 */
	public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int res = 0;
        int min = prices[0];
       
        int[] dp = new int[prices.length];
        
       for(int i = 1; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            dp[i] = Math.max(dp[i-1], prices[i] - min);
        }
        
        return dp[prices.length-1];
    }        
	
	
	/**
	 * brute, O(n2)
	 * @param prices
	 * @return
	 */
	public int maxProfit2(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            if (prices[i] < prices[i + 1]) {
                res += prices[i + 1] - prices[i];
            }
        }
        return res;
    }
}
