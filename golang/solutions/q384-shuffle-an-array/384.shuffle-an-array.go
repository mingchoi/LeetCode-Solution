package solutions

import "math/rand"

/*
 * @lc app=leetcode id=384 lang=golang
 *
 * [384] Shuffle an Array
 */

/*
Your runtime beats 87.41 % of golang submissions
Your memory usage beats 54.81 % of golang submissions (8 MB)
*/

// @lc code=start
type Solution struct {
	data []int
}

func Constructor(nums []int) Solution {
	return Solution{nums}
}

func (this *Solution) Reset() []int {
	return this.data
}

func (this *Solution) Shuffle() []int {
	result := make([]int, len(this.data))
	copy(result, this.data)
	for i := 0; i < len(result); i++ {
		swap := rand.Intn(len(result))
		result[i], result[swap] = result[swap], result[i]
	}
	return result
}

/**
 * Your Solution object will be instantiated and called as such:
 * obj := Constructor(nums);
 * param_1 := obj.Reset();
 * param_2 := obj.Shuffle();
 */
// @lc code=end
