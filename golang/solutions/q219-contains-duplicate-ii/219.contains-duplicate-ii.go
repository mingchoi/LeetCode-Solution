package solutions

/*
 * @lc app=leetcode id=219 lang=golang
 *
 * [219] Contains Duplicate II
 */

/*
Your runtime beats 88.07 % of golang submissions
Your memory usage beats 43.51 % of golang submissions (12 MB)
*/

// @lc code=start
func containsNearbyDuplicate(nums []int, k int) bool {
	t := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		if index, ok := t[nums[i]]; ok {
			if i-index <= k {
				return true
			}
		}
		t[nums[i]] = i
	}
	return false
}

// @lc code=end
