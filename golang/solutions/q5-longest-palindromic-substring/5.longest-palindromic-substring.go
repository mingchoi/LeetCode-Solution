package solutions

/*
 * @lc app=leetcode id=5 lang=golang
 *
 * [5] Longest Palindromic Substring
 */

/*
Your runtime beats 93.56 % of golang submissions
Your memory usage beats 81.55 % of golang submissions (2.3 MB)
*/

// @lc code=start
func longestPalindrome(s string) string {
	max := 1
	word := s[0:1]
	for i := 0; i < len(s); i++ {
		offset := 1
		for i-offset >= 0 && i+offset < len(s) {
			if s[i-offset] != s[i+offset] {
				break
			}
			offset += 1
		}
		offset -= 1
		if 1+offset*2 > max {
			max = 1 + offset*2
			word = s[i-offset : i+offset+1]
		}
		if i+1 < len(s) && s[i] == s[i+1] {
			offset = 1
			for i-offset >= 0 && i+1+offset < len(s) {
				if s[i-offset] != s[i+1+offset] {
					break
				}
				offset += 1
			}
			offset -= 1
			if 2+offset*2 > max {
				max = 1 + offset*2
				word = s[i-offset : i+offset+2]
			}
		}
	}
	return word
}

// @lc code=end

/*
Timeout attempt
*/
func r(s string) string {
	if len(s) == 1 {
		return s
	}
	if isPalindrome(s) {
		return s
	}
	trimLeft := r(s[1:])
	trimRight := r(s[:len(s)-1])
	if trimLeft == "" && trimRight == "" {
		return ""
	}
	if len(trimLeft) > len(trimRight) {
		return trimLeft
	} else {
		return trimRight
	}
}

func isPalindrome(s string) bool {
	lo := 0
	hi := len(s) - 1
	for lo < hi {
		if s[lo] != s[hi] {
			return false
		}
		lo++
		hi--
	}
	return true
}
