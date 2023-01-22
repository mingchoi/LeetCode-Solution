package solutions

/*
 * @lc app=leetcode id=14 lang=golang
 *
 * [14] Longest Common Prefix
 */
/*
Your runtime beats 40.73 % of golang submissions
Your memory usage beats 37.18 % of golang submissions (2.3 MB)
*/

// @lc code=start
func longestCommonPrefix(strs []string) string {
	if len(strs) == 0 {
		return ""
	}
	for i := 0; i < len(strs[0]); i++ {
		for _, str := range strs {
			if i == len(str) || str[i] != strs[0][i] {
				return strs[0][0:i]
			}
		}
	}
	return strs[0]
}

// @lc code=end
func longestCommonPrefix_40_73(strs []string) string {
	i := 0
	for i < len(strs[0]) {
		for _, str := range strs {
			if i == len(str) {
				return strs[0][0:i]
			}
			if str[i] != strs[0][i] {
				return strs[0][0:i]
			}
		}
		i++
	}
	return strs[0][0:i]
}
