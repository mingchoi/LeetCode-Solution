package solutions

/*
 * @lc app=leetcode id=88 lang=golang
 *
 * [88] Merge Sorted Array
 */

/*
Your runtime beats 67.89 % of golang submissions
Your memory usage beats 53.27 % of golang submissions (2.2 MB)
*/

// @lc code=start
func merge(nums1 []int, m int, nums2 []int, n int) {
	if n == 0 {
		return
	}
	p1 := m - 1
	p2 := n - 1
	pt := m + n - 1
	for pt > 0 {
		if p2 < 0 {
			nums1[pt] = nums1[p1]
			p1--
			pt--
		} else if p1 < 0 {
			nums1[pt] = nums2[p2]
			p2--
			pt--
		} else if nums1[p1] > nums2[p2] {
			nums1[pt] = nums1[p1]
			p1--
			pt--
		} else {
			nums1[pt] = nums2[p2]
			p2--
			pt--
		}
	}
	if p2 == 0 {
		nums1[0] = nums2[0]
	}
}

// @lc code=end
