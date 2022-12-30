package solutions

/*
 * @lc app=leetcode id=26 lang=golang
 *
 * [26] Remove Duplicates from Sorted Array
 */

/*
Your runtime beats 93.75 % of golang submissions
Your memory usage beats 100 % of golang submissions (4.3 MB)
*/

// @lc code=start
func removeDuplicates(nums []int) int {
	pt := 0
	for i := 1; i < len(nums); i++ {
		if nums[i] == nums[pt] {
			continue
		}
		pt++
		nums[pt] = nums[i]
	}
	return pt + 1
}

// @lc code=end
