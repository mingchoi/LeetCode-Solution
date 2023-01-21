package solutions

/*
 * @lc app=leetcode id=118 lang=golang
 *
 * [118] Pascal's Triangle
 */

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 14.91 % of golang submissions (2.2 MB)
*/

// @lc code=start
func generate(numRows int) [][]int {
	tri := make([][]int, numRows)
	for i := 1; i <= numRows; i++ {
		row := make([]int, i)
		row[0] = 1
		row[i-1] = 1
		if i > 2 {
			for j := 1; j < i-1; j++ {
				row[j] = tri[i-2][j-1] + tri[i-2][j]
			}
		}
		tri[i-1] = row
	}
	return tri
}

// @lc code=end
