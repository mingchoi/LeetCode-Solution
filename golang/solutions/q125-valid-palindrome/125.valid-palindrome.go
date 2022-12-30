package solutions

/*
 * @lc app=leetcode id=125 lang=golang
 *
 * [125] Valid Palindrome
 */

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 93.03 % of golang submissions (2.5 MB)
*/

// @lc code=start
func isPalindrome(s string) bool {
	lo := 0
	hi := len(s) - 1
	for lo <= hi {
		a := s[lo]
		if !((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a >= '0' && a <= '9')) {
			lo++
			continue
		}
		b := s[hi]
		if !((b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z') || (b >= '0' && b <= '9')) {
			hi--
			continue
		}
		if a >= 'A' && a <= 'Z' {
			a += 32
		}
		if b >= 'A' && b <= 'Z' {
			b += 32
		}
		if a != b {
			return false
		}
		lo++
		hi--
	}
	return true
}

// @lc code=end
