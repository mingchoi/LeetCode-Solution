package solutions

/*
 * @lc app=leetcode id=326 lang=golang
 *
 * [326] Power of Three
 */

/*
Your runtime beats 84.01 % of golang submissions
Your memory usage beats 100 % of golang submissions (6.2 MB)
*/

// @lc code=start
func isPowerOfThree(n int) bool {
	if n == 1 {
		return true
	} else if n == 0 {
		return false
	}
	r := n
	for {
		if r == 3 {
			return true
		} else if r%3 != 0 {
			return false
		}
		r /= 3
	}
}

// @lc code=end
