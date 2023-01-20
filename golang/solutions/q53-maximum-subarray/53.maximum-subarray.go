package solutions

/*
 * @lc app=leetcode id=53 lang=golang
 *
 * [53] Maximum Subarray
 */

/*
Your runtime beats 99.65 % of golang submissions
Your memory usage beats 99.39 % of golang submissions (8.4 MB)
*/

// @lc code=start
func maxSubArray(nums []int) int {
	max := nums[0]
	sum := nums[0]
	for i := 1; i < len(nums); i++ {
		newSum := sum + nums[i]
		if newSum > nums[i] {
			sum = newSum
		} else {
			sum = nums[i]
		}
		if sum > max {
			max = sum
		}
	}
	return max
}

// @lc code=end
