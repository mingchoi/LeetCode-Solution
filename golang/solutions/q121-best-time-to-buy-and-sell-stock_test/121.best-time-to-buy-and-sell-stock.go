package solutions

/*
 * @lc app=leetcode id=121 lang=golang
 *
 * [121] Best Time to Buy and Sell Stock
 */

/*
Your runtime beats 96.22 % of golang submissions
Your memory usage beats 29.82 % of golang submissions (8.9 MB)
*/

// @lc code=start
func maxProfit(prices []int) int {
	length := len(prices) - 1
	for i := 0; i < length; i++ {
		prices[i] = prices[i+1] - prices[i]
	}
	prices[length] = 0
	max := prices[0]
	sum := prices[0]
	for i := 1; i <= length; i++ {
		newSum := sum + prices[i]
		if newSum > prices[i] {
			sum = newSum
		} else {
			sum = prices[i]
		}
		if sum > max {
			max = sum
		}
	}
	return max
}

// @lc code=end
