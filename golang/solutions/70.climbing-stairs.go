package solutions

/*
 * @lc app=leetcode id=70 lang=golang
 *
 * [70] Climbing Stairs
 */

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 78.18 % of golang submissions (1.8 MB)
*/

// @lc code=start
func climbStairs(n int) int {
	if n == 1 {
		return 1
	}
	last := 1
	current := 2
	next := 3
	for i := 3; i <= n; i++ {
		next = last + current
		last = current
		current = next
	}
	return current
}

// @lc code=end

func climbStairs_62_29(n int) int {
	if n == 1 {
		return 1
	}
	last := 1
	current := 2
	for i := 3; i <= n; i++ {
		next := last + current
		last = current
		current = next
	}
	return current
}
