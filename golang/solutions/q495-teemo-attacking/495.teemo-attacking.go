package solutions

/*
 * @lc app=leetcode id=495 lang=golang
 *
 * [495] Teemo Attacking
 */

/*
Your runtime beats 78.38 % of golang submissions
Your memory usage beats 32.43 % of golang submissions (6.6 MB)
*/

// @lc code=start
func findPoisonedDuration(timeSeries []int, duration int) int {
	sum := 0
	for i := 1; i < len(timeSeries); i++ {
		distance := timeSeries[i] - timeSeries[i-1]
		if distance < duration {
			sum += distance
		} else {
			sum += duration
		}
	}
	return sum + duration
}

// @lc code=end
