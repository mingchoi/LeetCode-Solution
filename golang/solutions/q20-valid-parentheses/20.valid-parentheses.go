package solutions

/*
 * @lc app=leetcode id=20 lang=golang
 *
 * [20] Valid Parentheses
 */

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 98.86 % of golang submissions (1.9 MB)
*/

// @lc code=start
func isValid(s string) bool {
	t := map[byte]byte{
		')': '(',
		'}': '{',
		']': '[',
	}
	stack := make([]byte, 0)
	for i := 0; i < len(s); i++ {
		p := s[i]
		if o, ok := t[p]; ok {
			if len(stack) == 0 {
				return false
			}
			if stack[len(stack)-1] != o {
				return false
			}
			stack = stack[:len(stack)-1]
		} else {
			stack = append(stack, p)
		}
	}
	return len(stack) == 0
}

// @lc code=end
