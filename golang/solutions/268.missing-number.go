package solutions

/*
 * @lc app=leetcode id=268 lang=golang
 *
 * [268] Missing Number
 */

/*
Your runtime beats 97.20 % of golang submissions
Your memory usage beats 54.76 % of golang submissions (6.2 MB)
*/

// @lc code=start
func missingNumber(nums []int) int {
	e := make([]bool, len(nums)+1)
	for i := 0; i < len(nums); i++ {
		e[nums[i]] = true
	}
	for i := 0; i < len(nums); i++ {
		if !e[i] {
			return i
		}
	}
	return len(nums)
}

// @lc code=end
