package solutions

/*
 * @lc app=leetcode id=54 lang=golang
 *
 * [54] Spiral Matrix
 */

/*
Your runtime beats 57.99 % of golang submissions
Your memory usage beats 61.07 % of golang submissions (2 MB)
*/

// @lc code=start
func spiralOrder(matrix [][]int) []int {
	topBound := 0
	rightBound := len(matrix[0]) - 1
	bottomBound := len(matrix) - 1
	leftBound := 0
	max := len(matrix[0]) * len(matrix)

	direction := 0
	x := 0
	y := 0
	path := make([]int, 0)
	path = append(path, matrix[y][x])

	for len(path) < max {
		// fmt.Printf("x=%v, y=%v, dir=%v, %v, %v, %v, %v\n", x, y, direction, rightBound, bottomBound, leftBound, topBound)
		if direction == 0 {
			if x != rightBound {
				x += 1
				path = append(path, matrix[y][x])
			} else {
				direction = 1
				topBound++
			}
		} else if direction == 1 {
			if y != bottomBound {
				y += 1
				path = append(path, matrix[y][x])
			} else {
				direction = 2
				rightBound--
			}
		} else if direction == 2 {
			if x != leftBound {
				x -= 1
				path = append(path, matrix[y][x])
			} else {
				direction = 3
				bottomBound--
			}
		} else if direction == 3 {
			if y != topBound {
				y -= 1
				path = append(path, matrix[y][x])
			} else {
				direction = 0
				leftBound++
			}
		}
	}

	return path
}

// @lc code=end
