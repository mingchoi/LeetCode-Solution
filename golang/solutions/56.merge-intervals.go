package solutions

import (
	"sort"
)

/*
 * @lc app=leetcode id=56 lang=golang
 *
 * [56] Merge Intervals
 */

/*
Your runtime beats 80.15 % of golang submissions
Your memory usage beats 61.34 % of golang submissions (6.9 MB)
*/

// @lc code=start
func merge(intervals [][]int) [][]int {
	sort.Slice(intervals, func(i, j int) bool {
		return intervals[i][0] < intervals[j][0]
	})
	result := [][]int{intervals[0]}
	for i := 1; i < len(intervals); i++ {
		last := result[len(result)-1]
		merged, ok := mergeAB(last, intervals[i])
		if ok {
			result[len(result)-1] = merged
		} else {
			result = append(result, intervals[i])
		}
	}

	return result
}

func mergeAB(a, b []int) ([]int, bool) {
	l := a
	r := b
	if a[0] > b[0] {
		l = b
		r = a
	}
	if l[1] < r[0] {
		return nil, false
	}
	min := r[0]
	if l[0] < r[0] {
		min = l[0]
	}
	max := r[1]
	if l[1] > r[1] {
		max = l[1]
	}
	return []int{min, max}, true
}

// @lc code=end
