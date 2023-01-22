package solutions

/*
 * @lc app=leetcode id=2248 lang=golang
 *
 * [2248] Intersection of Multiple Arrays
 */

/*
Your runtime beats 78.26 % of golang submissions
Your memory usage beats 89.13 % of golang submissions (3.8 MB)
*/

// @lc code=start
func intersection(nums [][]int) []int {
	a := make([]int, 1001)
	for _, v := range nums[0] {
		a[v]++
	}
	for i := 1; i < len(nums); i++ {
		b := make([]int, 1001)
		for _, v := range nums[i] {
			b[v]++
		}
		for j := 0; j < 1001; j++ {
			if a[j] > b[j] {
				a[j] = b[j]
			}
		}
	}
	r := make([]int, 0)
	for j := 0; j < 1001; j++ {
		for a[j] > 0 {
			r = append(r, j)
			a[j]--
		}
	}
	return r
}

// @lc code=end
