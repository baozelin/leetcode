package 贪心;

public class BestTimetoBuyandSellStockII_122 {
	public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1) return 0;
        
        int sum =0;
        for(int i = 1; i < prices.length; i++ ){
            if(prices[i-1] < prices[i]) sum = sum + (prices[i]-prices[i-1]);
     
        }
        return sum;
    }
}
