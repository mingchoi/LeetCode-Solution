package solutions

/*
 * @lc app=leetcode id=204 lang=golang
 *
 * [204] Count Primes
 */

/*
Your runtime beats 65.27 % of golang submissions
Your memory usage beats 50.3 % of golang submissions (12.8 MB)
*/

// @lc code=start
func countPrimes(n int) int {
	if n == 0 || n == 1 {
		return 0
	}
	np := make([]bool, n+1)
	primeCount := 0
	for i := 2; i < n; i++ {
		if np[i] {
			continue
		}
		prime := i
		sum := prime * 2
		primeCount++
		for sum <= n {
			np[sum] = true
			sum += prime
		}
	}
	return primeCount
}

// @lc code=end
