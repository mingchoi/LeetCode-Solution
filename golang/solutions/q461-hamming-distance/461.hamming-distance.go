package solutions

/*
 * @lc app=leetcode id=461 lang=golang
 *
 * [461] Hamming Distance
 */

/*
Your runtime beats 45.05 % of golang submissions
Your memory usage beats 72.97 % of golang submissions (1.9 MB)
*/

// @lc code=start
func hammingDistance(x int, y int) int {
	x ^= y
	sum := 0
	for i := 0; i < 32; i++ {
		if x == 0 {
			break
		}
		if x&1 == 1 {
			sum++
		}
		x = x >> 1
	}
	return sum
}

// @lc code=end

func hammingDistance_45_05(x int, y int) int {
	sum := 0
	for i := 0; i < 32; i++ {
		if (x&1)^(y&1) == 1 {
			sum++
		}
		x = x >> 1
		y = y >> 1
	}
	return sum
}
