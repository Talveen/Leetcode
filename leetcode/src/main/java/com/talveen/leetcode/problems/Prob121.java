package com.talveen.leetcode.problems;

/**
 * Date: 2/8/2024
 * Time: 1:06 PM
 * URL:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class Prob121 {
    public static void main(String[] args) {
        Prob121 prob121 = new Prob121();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(prob121.maxProfit(prices));
    }

    private int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profitToday = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lowest){
                lowest = prices[i];
            }
            profitToday = prices[i] - lowest;
            if(overallProfit < profitToday){
                overallProfit = profitToday;
            }
        }
        return overallProfit;
    }
}
