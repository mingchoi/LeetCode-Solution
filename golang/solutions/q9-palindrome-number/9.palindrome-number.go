package solutions

import (
	"strconv"
)

/*
 * @lc app=leetcode id=9 lang=golang
 *
 * [9] Palindrome Number
 */

/*
Your runtime beats 85.17 % of golang submissions
Your memory usage beats 100 % of golang submissions (4.5 MB)
*/

/**
BenchmarkIsPalindrome_string/isPalindrome-8         	125632216	         9.453 ns/op	       0 B/op	       0 allocs/op
BenchmarkIsPalindrome_string/isPalindrome_slice-8   	 9957586	       118.9 ns/op	     248 B/op	       5 allocs/op
BenchmarkIsPalindrome_string/isPalindrome_string-8  	35645768	        34.20 ns/op	      16 B/op	       1 allocs/op
*/

// @lc code=start
func isPalindrome(x int) bool {
	if x < 0 {
		return false
	}
	n := x
	length := 0
	for n != 0 {
		length++
		n /= 10
	}
	head := x
	tail := 0
	for i := 0; i < length/2; i++ {
		tail = tail*10 + head%10
		head /= 10
	}
	if length%2 == 1 {
		head /= 10
	}
	return head == tail
}

// @lc code=end

func isPalindrome_slice(x int) bool {
	if x < 0 {
		return false
	}
	n := x
	nums := make([]int, 0)
	for n != 0 {
		nums = append(nums, n%10)
		n /= 10
	}
	length := len(nums) / 2
	for i := 0; i < length; i++ {
		if nums[i] != nums[len(nums)-i-1] {
			return false
		}
	}
	return true
}

func isPalindrome_string(x int) bool {
	if x < 0 {
		return false
	}
	str := strconv.Itoa(x)
	for i := 0; i < len(str); i++ {
		if str[i] != str[len(str)-i-1] {
			return false
		}
	}
	return true
}
