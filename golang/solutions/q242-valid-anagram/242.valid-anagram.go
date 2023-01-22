package solutions

/*
 * @lc app=leetcode id=242 lang=golang
 *
 * [242] Valid Anagram
 */

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 100 % of golang submissions (2.7 MB)
*/

// @lc code=start
func isAnagram(s string, t string) bool {
	m := make([]int, 52)
	if len(s) != len(t) {
		return false
	}
	for i := 0; i < len(s); i++ {
		m[s[i]-'a'] += 1
		m[t[i]-'a'+26] += 1
	}
	for i := 0; i < 26; i++ {
		if m[i] != m[i+26] {
			return false
		}
	}
	return true
}

// @lc code=end
