package solutions

import "math"

/*
 * @lc app=leetcode id=7 lang=golang
 *
 * [7] Reverse Integer
 */

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 56.43 % of golang submissions (2.1 MB)
*/

// @lc code=start
func reverse(x int) int {
	sum := 0
	for x != 0 {
		n := x % 10
		if sum > math.MaxInt32/10 ||
			(sum == math.MaxInt32/10 && n > 7) ||
			(sum < math.MinInt32/10) ||
			(sum == math.MinInt32/10 && n < -8) {
			return 0
		}
		sum = sum*10 + n
		x /= 10
	}
	return sum
}

// @lc code=end
