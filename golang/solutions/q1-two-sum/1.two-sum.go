package solutions

/*
 * @lc app=leetcode id=1 lang=golang
 *
 * [1] Two Sum
 */

/*
Your runtime beats 96.22 % of golang submissions
Your memory usage beats 48.53 % of golang submissions (4.2 MB)
*/

// @lc code=start
func twoSum(nums []int, target int) []int {
	t := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		if saved, ok := t[target-nums[i]]; ok {
			return []int{saved, i}
		}
		t[nums[i]] = i
	}
	return []int{-1, -1}
}

// @lc code=end
