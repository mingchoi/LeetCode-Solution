package solutions

/*
 * @lc app=leetcode id=28 lang=golang
 *
 * [28] Find the Index of the First Occurrence in a String
 */

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 47.07 % of golang submissions (2 MB)
*/

// @lc code=start
func strStr(haystack string, needle string) int {
	index := -1
	for i := 0; i < len(haystack)-len(needle)+1; i++ {
		if haystack[i:i+len(needle)] == needle {
			return i
		}
	}
	return index
}

// @lc code=end

func strStr_22_61(haystack string, needle string) int {
	index := -1
	for i := 0; i < len(haystack); i++ {
		n := 0
		for i+n < len(haystack) && haystack[i+n] == needle[n] {
			n++
			if n == len(needle) {
				return i
			}
		}
	}
	return index
}
