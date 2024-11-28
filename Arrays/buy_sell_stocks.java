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
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        makeProfit(prices);
    }
}
