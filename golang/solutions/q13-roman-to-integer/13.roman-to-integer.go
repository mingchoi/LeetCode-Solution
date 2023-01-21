package solutions

/*
 * @lc app=leetcode id=13 lang=golang
 *
 * [13] Roman to Integer
 */

/*
Your runtime beats 97.07 % of golang submissions
Your memory usage beats 100 % of golang submissions (2.8 MB)
*/

// @lc code=start
func romanToInt(s string) int {
	t := map[byte]int{
		'I': 1,
		'V': 5,
		'X': 10,
		'L': 50,
		'C': 100,
		'D': 500,
		'M': 1000,
	}
	sum := 0
	max := 1
	for i := len(s) - 1; i >= 0; i-- {
		val := t[s[i]]
		if max > val {
			sum -= val
		} else {
			sum += val
			max = val
		}
	}
	return sum
}

// @lc code=end
