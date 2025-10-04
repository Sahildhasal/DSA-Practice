package BestTimeToBuyAndSellStock;

public class OptimalGreedyApproach {
    public static void main(String[] args) {
        
        int[] stockPrices = {7,1,5,3,6,4};

        int result = checkForMaxProfit(stockPrices);
        System.out.println("result is " + result);
    }

    public static int checkForMaxProfit(int[] stockPrices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : stockPrices) {
            if(price < minPrice){
                minPrice = price;
            }
            else {
                int profit = price - minPrice;
                System.out.printf("%d - %d = %d", price, minPrice, profit);
                System.out.println();
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
