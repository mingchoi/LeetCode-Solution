package solutions

import (
	"math"
)

/*
 * @lc app=leetcode id=918 lang=golang
 *
 * [918] Maximum Sum Circular Subarray
 */

/*
Your runtime beats 87.92 % of golang submissions
Your memory usage beats 69.08 % of golang submissions (7.3 MB)
*/

// @lc code=start
func maxSubarraySumCircular(nums []int) int {
	totalSum := nums[0]
	max := nums[0]
	maxSum := nums[0]
	min := nums[0]
	minSum := nums[0]
	for i := 1; i < len(nums); i++ {
		totalSum += nums[i]
		// find max sub array
		newSum := maxSum + nums[i]
		if newSum > nums[i] {
			maxSum = newSum
		} else {
			maxSum = nums[i]
		}
		if maxSum > max {
			max = maxSum
		}
		// find min sub array
		newSum = minSum + nums[i]
		if newSum < nums[i] {
			minSum = newSum
		} else {
			minSum = nums[i]
		}
		if minSum < min {
			min = minSum
		}
	}
	if max < 0 {
		return max
	}
	max2 := totalSum - min
	// fmt.Printf("totalSum=%v, min=%v, max=%v, max2=%v\n", totalSum, min, max, max2)
	if max2 > max {
		return max2
	}
	return max
}

// @lc code=end

func maxSubarraySumCircular_timeout2(nums []int) int {
	max := nums[0]
	sum := nums[0]
	sumIndex := 0
	length := len(nums) * 2
	for i := 1; i < length; i++ {
		index := i % len(nums)
		if i-sumIndex >= len(nums) {
			sum -= nums[sumIndex]
			sumIndex += 1
			jSum := sum
			for j := sumIndex; j < i; j++ {
				jSum = jSum - nums[j%len(nums)]
				if jSum > sum {
					sum = jSum
					sumIndex = j + 1
				}
			}
		}
		newSum := sum + nums[index]
		if newSum > nums[index] {
			sum = newSum
		} else {
			sum = nums[index]
			sumIndex = i
		}
		if sum > max {
			max = sum
		}
	}
	return max
}

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
