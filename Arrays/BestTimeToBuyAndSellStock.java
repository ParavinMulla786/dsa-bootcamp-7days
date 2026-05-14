// Best Time to Buy and Sell Stock
// Problem: Given prices[i] = stock price on day i,
// find max profit with one buy and one sell.
//
// Example 1: [7,1,5,3,6,4] -> 5
// Example 2: [7,6,4,3,1]   -> 0
//
// Constraints:
// 1 <= prices.length <= 100000
// 0 <= prices[i] <= 10000
//
// Test Cases:
// [2,4,1] -> 2
// [5,4,3,2] -> 0
//
// Edge Cases: decreasing array, single element

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));    // 0
        System.out.println(solution.maxProfit(new int[]{2, 4, 1}));           // 2
        System.out.println(solution.maxProfit(new int[]{5, 4, 3, 2}));        // 0
        System.out.println(solution.maxProfit(new int[]{1}));                 // 0
    }
}