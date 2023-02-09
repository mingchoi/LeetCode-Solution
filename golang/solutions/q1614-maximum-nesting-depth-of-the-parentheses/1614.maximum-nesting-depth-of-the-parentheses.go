package solutions

/*
 * @lc app=leetcode id=1614 lang=golang
 *
 * [1614] Maximum Nesting Depth of the Parentheses
 */

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 63.77 % of golang submissions (1.9 MB)
*/

// @lc code=start
func maxDepth(s string) int {
	max := 0
	curr := 0
	for i := 0; i < len(s); i++ {
		if s[i] == '(' {
			curr++
		} else if s[i] == ')' {
			curr--
		}
		if curr > max {
			max = curr
		}
	}
	return max
}

// @lc code=end
