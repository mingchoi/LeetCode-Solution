package solutions

/*
 * @lc app=leetcode id=191 lang=golang
 *
 * [191] Number of 1 Bits
 */

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 74.84 % of golang submissions (1.8 MB)
*/

// @lc code=start
func hammingWeight(num uint32) int {
	sum := 0
	for i := 0; i < 32; i++ {
		if num&1 == 1 {
			sum++
		}
		num = num >> 1
	}
	return sum
}

// @lc code=end
