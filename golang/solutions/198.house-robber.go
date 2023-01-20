package solutions

/*
 * @lc app=leetcode id=198 lang=golang
 *
 * [198] House Robber
 */

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 100 % of golang submissions (1.9 MB)
*/

// @lc code=start
func rob(nums []int) int {
	if len(nums) == 1 {
		return nums[0]
	}
	last := nums[0]
	curr := nums[0]
	if nums[1] > nums[0] {
		curr = nums[1]
	}
	for i := 2; i < len(nums); i++ {
		newSum := last + nums[i]
		if newSum > curr {
			last, curr = curr, newSum
		} else {
			last = curr
		}
	}
	return curr
}

// @lc code=end
