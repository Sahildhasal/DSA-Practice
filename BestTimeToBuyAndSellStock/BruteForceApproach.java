package BestTimeToBuyAndSellStock;

public class BruteForceApproach {
    public static void main(String[] args) {
        int[] stockPrices = {7,1,5,3,6,4};

        // for 7:
        //     sell at 6 = -1
        //     sell at 4 = -3
        //     sell at 3 = -4
        //     sell at 1 = -6
        // for 1:
        //     sell at 5 = 4
        //     sell at 3 = 2
        //     sell at 6 = 5 //best approach among all (Buy at 1, sell at 6)
        //     sell at 4 = 3
        // for 5: 
        //     sell at 3 = 2
        //     sell at 6 = 1
        //     sell at 4 = -1
        // for 3:
        //     sell at 6 = 3
        //     sell at 4 = 1
        // for 6: 
        //     sell at 4 = 2

        int maxProfit = checkForMaxProfit(stockPrices);
        System.out.println("max profit is " + maxProfit);
    }

    public static int checkForMaxProfit(int[] stockPrices){
        int maxProfit = 0;
        for (int i = 0; i < stockPrices.length; i++) {
            for (int j = i + 1; j < stockPrices.length; j++) {
                int profit = stockPrices[j] - stockPrices[i];

                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
