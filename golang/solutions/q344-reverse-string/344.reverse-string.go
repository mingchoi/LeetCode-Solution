package solutions

/*
 * @lc app=leetcode id=344 lang=golang
 *
 * [344] Reverse String
 */

/*
Your runtime beats 83.46 % of golang submissions
Your memory usage beats 86.51 % of golang submissions (6.6 MB)
*/

// @lc code=start
func reverseString(s []byte) {
	i := 0
	j := len(s) - 1
	for i < j {
		s[i], s[j] = s[j], s[i]
		i++
		j--
	}
}

// @lc code=end

func reverseString_old(s []byte) {
	for i := 0; i < len(s)/2; i++ {
		temp := s[len(s)-1-i]
		s[len(s)-1-i] = s[i]
		s[i] = temp
	}
}
