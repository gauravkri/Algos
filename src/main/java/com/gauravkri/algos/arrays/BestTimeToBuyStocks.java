package com.gauravkri.algos.arrays;

public class BestTimeToBuyStocks {
    /*
    Best Time to Buy and Sell Stock
    Input: prices[] = {7, 1, 5, 3, 6, 4}
    Output: 5
    Explanation:
    The lowest price of the stock is on the 2nd day, i.e. price = 1. Starting from the 2nd day, the highest price of the stock is witnessed on the 5th day, i.e. price = 6.
    Therefore, maximum possible profit = 6 – 1 = 5.

    Input: prices[] = {7, 6, 4, 3, 1}
    Output: 0
    Explanation: Since the array is in decreasing order, no possible way exists to solve the problem.
     */


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int margin = maximumProfit(prices);
        System.out.println(margin);
    }

    public static int maximumProfit(int[] prices){
        int buy = prices[0];
        int profit=0;
        for (int i=1; i< prices.length;i++){
            if (buy>prices[i])
                buy=prices[i];
            else if (prices[i]-buy> profit) {
                profit = prices[i]-buy;
            }
        }
        return profit;

    }
}
