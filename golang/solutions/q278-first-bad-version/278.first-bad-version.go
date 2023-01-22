package solutions

/*
 * @lc app=leetcode id=278 lang=golang
 *
 * [278] First Bad Version
 */

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 66.86 % of golang submissions (1.9 MB)
*/

// @lc code=start
func firstBadVersion(n int) int {
	if isBadVersion(1) {
		return 1
	}
	lo := 1
	hi := n
	for {
		mid := (lo + hi) / 2
		if isBadVersion(mid) {
			hi = mid
		} else if lo == mid {
			return lo + 1
		} else {
			lo = mid
		}
	}
}

// @lc code=end

func firstBadVersion_iteration(n int) int {
	for i := n; i > 0; i-- {
		if !isBadVersion(i) {
			return i + 1
		}
	}
	return 0
}

var badVersion int32 = 0

func isBadVersion(n int) bool {
	return n >= int(badVersion)
}

func setBadVersion(n int) {
	badVersion = int32(n)
}
