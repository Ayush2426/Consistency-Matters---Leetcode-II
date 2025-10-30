public class StockSell {
    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        StockSell ss = new StockSell();
        ss.maxProfit(new int[]{1, 2, 5, 3, 5, 2});
    }
}
