package practice;

public class Practice {

    public static void main(String[] args) {
        int[] stockPrices = {7,1,5,3,6,4};

        int result = findBestResult(stockPrices);
        System.out.println("result is " + result);
    }

    public static int findBestResult(int[] stockPrices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : stockPrices) {
            if(price < minPrice){
                minPrice = price;
            }
            else {
                int profit = price - minPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
