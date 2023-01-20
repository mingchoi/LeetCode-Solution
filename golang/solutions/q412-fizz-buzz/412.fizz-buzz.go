package solutions

import (
	"strconv"
)

/*
 * @lc app=leetcode id=412 lang=golang
 *
 * [412] Fizz Buzz
 */

/*
Your runtime beats 92.66 % of golang submissions
Your memory usage beats 99.88 % of golang submissions (3.4 MB)
*/

// @lc code=start
func fizzBuzz(n int) []string {
	r := make([]string, 0, n)
	for i := 1; i <= n; i++ {
		if i%3 == 0 && i%5 == 0 {
			r = append(r, "FizzBuzz")
		} else if i%3 == 0 {
			r = append(r, "Fizz")
		} else if i%5 == 0 {
			r = append(r, "Buzz")
		} else {
			r = append(r, strconv.Itoa(i))
		}
	}
	return r
}

// @lc code=end
