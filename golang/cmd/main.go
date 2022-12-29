package main

import "github.com/mingchoi/LeetCode-Solution/golang/utils"

func main() {
	results := append(utils.ParseJavaSolution(), utils.ParseGoSolution()...)
	utils.GenerateMarkdownReport(results)
}
