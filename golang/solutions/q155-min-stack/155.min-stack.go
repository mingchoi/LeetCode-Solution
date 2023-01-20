package solutions

/*
 * @lc app=leetcode id=155 lang=golang
 *
 * [155] Min Stack
 */

/*
Your runtime beats 95.4 % of golang submissions
Your memory usage beats 65.3 % of golang submissions (8.2 MB)
*/

// @lc code=start
type MinStack struct {
	min   []int
	stack []int
}

func Constructor() MinStack {
	return MinStack{[]int{}, []int{}}
}

func (this *MinStack) Push(val int) {
	if len(this.stack) == 0 || val <= this.GetMin() {
		this.min = append(this.min, val)
	}
	this.stack = append(this.stack, val)
}

func (this *MinStack) Pop() {
	if this.Top() == this.GetMin() {
		this.min = this.min[0 : len(this.min)-1]
	}
	this.stack = this.stack[0 : len(this.stack)-1]
}

func (this *MinStack) Top() int {
	return this.stack[len(this.stack)-1]
}

func (this *MinStack) GetMin() int {
	return this.min[len(this.min)-1]
}

/**
 * Your MinStack object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(val);
 * obj.Pop();
 * param_3 := obj.Top();
 * param_4 := obj.GetMin();
 */
// @lc code=end
