package common.programs.arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int[] prices = {2,4,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min) {
                min = prices[i];
            }
            else if(prices[i] - min > maxProfit){
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }
}
