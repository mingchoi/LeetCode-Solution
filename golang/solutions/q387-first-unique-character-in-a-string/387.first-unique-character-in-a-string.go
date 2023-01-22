package solutions

import "math"

/*
 * @lc app=leetcode id=387 lang=golang
 *
 * [387] First Unique Character in a String
 */

/*
Your runtime beats 89.98 % of golang submissions
Your memory usage beats 68.67 % of golang submissions (5.3 MB)
*/

// @lc code=start
func firstUniqChar(s string) int {
	t := make([]int, 52)
	for i := 0; i < len(s); i++ {
		t[s[i]-'a'] += 1
		t[s[i]-'a'+26] = i
	}
	index := math.MaxInt32
	for i := 0; i < 26; i++ {
		if t[i] == 1 && t[i+26] < index {
			index = t[i+26]
		}
	}
	if index == math.MaxInt32 {
		return -1
	}
	return index
}

// @lc code=end

func firstUniqChar_31_88(s string) int {
	t := make(map[byte]int)
	ti := make(map[byte]int)
	for i := 0; i < len(s); i++ {
		t[s[i]] += 1
		ti[s[i]] = i
	}
	index := math.MaxInt32
	for k, v := range t {
		if v == 1 {
			if ti[k] < index {
				index = ti[k]
			}
		}
	}
	if index == math.MaxInt32 {
		return -1
	}
	return index
}
