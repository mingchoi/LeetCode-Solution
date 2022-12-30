package solutions

/*
 * @lc app=leetcode id=8 lang=golang
 *
 * [8] String to Integer (atoi)
 */

/**
Note: Really disappointed with test cases come with this question.
Wasting many hours to handle all the weird edge case but you can't just send a format error.
Worst LeetCode experience ever.
I should have check thumbs up/down first.
*/

// @lc code=start
func myAtoi(s string) int {
	t := map[byte]int{
		'0': 0,
		'1': 1,
		'2': 2,
		'3': 3,
		'4': 4,
		'5': 5,
		'6': 6,
		'7': 7,
		'8': 8,
		'9': 9,
	}
	sum := 0
	multiplier := 1
	sign := false
	negative := false
	whiteSpace := false
	overflow := false
	for i := len(s) - 1; i > -1; i-- {
		if s[i] == '-' {
			if sign {
				return 0
			}
			sum *= -1
			negative = true
			sign = true
		} else if s[i] == '+' {
			if sign {
				return 0
			}
			sign = true
		} else if s[i] == ' ' {
			if multiplier != 1 {
				whiteSpace = true
			}
		} else if s[i] >= '0' && s[i] <= '9' {
			if sign || whiteSpace {
				return 0
			}
			if s[i] == '0' {
				sum += t[s[i]] * multiplier
			} else if multiplier == 10000000000 {
				overflow = true
			} else if multiplier == 1000000000 {
				if s[i] == '0' || s[i] == '1' {
					sum += t[s[i]] * multiplier
				} else if s[i] == '2' {
					if sum > 147483647 {
						overflow = true
					} else {
						sum += t[s[i]] * multiplier
					}
				} else {
					overflow = true
				}
			} else {
				sum += t[s[i]] * multiplier
			}
			multiplier *= 10
		} else if multiplier != 1 {
			sum = 0
			multiplier = 1
		}
	}
	if overflow || sum > 2147483647 || sum < -2147483648 {
		if negative {
			return -2147483648
		}
		return 2147483647
	}
	return int(sum)
}

// @lc code=end
