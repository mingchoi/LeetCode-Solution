package solutions

import (
	"fmt"
	"math"
)

/*
 * @lc app=leetcode id=918 lang=golang
 *
 * [918] Maximum Sum Circular Subarray
 */

// @lc code=start
func maxSubarraySumCircular(nums []int) int {
	max := nums[0]
	sum := nums[0]
	sumIndex := 0
	length := len(nums) * 2
	for i := 1; i < length; i++ {
		index := i % len(nums)
		newSum := sum + nums[index]
		fmt.Printf("i=%v, newSum=%v, sum=%v, sumIndex=%v\n", i, newSum, sum, sumIndex)
		if newSum > nums[index] {
			sum = newSum
		} else {
			sum = nums[index]
			sumIndex = i
		}
		if sum > max {
			max = sum
		}
		if i-sumIndex+1 >= len(nums) {
			fmt.Println("too long!")
			sum = nums[index]
			sumIndex = i
		}
	}
	return max
}

// @lc code=end

func maxSubarraySumCircular_timeout(nums []int) int {
	sum := make([]int, len(nums))
	max := math.MinInt32
	for offset := 0; offset < len(nums); offset++ {
		for i := 0; i < len(sum); i++ {
			sum[i] += nums[(offset+i)%len(nums)]
			if sum[i] > max {
				max = sum[i]
			}
		}
	}
	return max
}
