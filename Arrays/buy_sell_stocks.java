package Arrays;

public class buy_sell_stocks {
    public static void makeProfit(int prices[]) {
        // initialize the required variables
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // loop for getting the maxProfit
        for (int i = 0; i <= prices.length - 1; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // if sellingPrice/currPrice/price[i] < buyPrice
                buyPrice = prices[i];
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int prices[] = { 100, 180, 260, 310, 40, 535, 695 };
        makeProfit(prices);
    }
}

// todo: understand this
// class Solution {
// public int maximumProfit(int[] prices) {
// int maxProfit = 0;

// for (int i = 1; i < prices.length; i++) {

// if (prices[i] > prices[i - 1]) {
// maxProfit += prices[i] - prices[i - 1];
// }
// }

// return maxProfit;
// }
// }
