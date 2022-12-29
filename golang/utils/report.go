package utils

import (
	"fmt"
	"os"
	"sort"
	"strconv"
	"strings"
)

const markdownReportHeader string = `# LeetCode Solution

Solutions are written in Golang or Java. 

Here are the result: (higher is better, max at 100)

`

type Result struct {
	Id          string
	RuntimeBeat float64
	RuntimeMS   float64
	MemoryBeat  float64
	MemoryMB    float64
	Language    string
}

type ReportSummaryRow struct {
	Difficulty string
	Total      int
	Runtime    float64
	Memory     float64
}

func (row ReportSummaryRow) ToMarkdownTitle() string {
	return "|difficulty|total|runtime beat(avg)|memory beat(avg)|\n|---|---|---|---|\n"
}

func (row ReportSummaryRow) ToMarkdown() string {
	return fmt.Sprintf("|%v|%v|%.2f|%.2f|\n", row.Difficulty, row.Total, row.Runtime, row.Memory)
}

type ReportResultRow struct {
	Id         int
	Name       string
	Difficulty string
	Runtime    float64
	Memory     float64
	Language   string
}

func (row ReportResultRow) ToMarkdownTitle() string {
	return "|id|title|difficulty|runtime beat|memory beat|lang|\n|---|---|---|---|---|---|\n"
}

func (row ReportResultRow) ToMarkdown() string {
	return fmt.Sprintf("|%v|%v|%v|%.2f|%.2f|%v|\n", row.Id, row.Name, row.Difficulty, row.Runtime, row.Memory, row.Language)
}

func GenerateMarkdownReport(results []Result) {
	if len(leetCodeInMemDB) == 0 {
		createInMemLeetCodeQuestionDB()
	}
	reportStr := generateMarkdownReportString(results)
	err := os.WriteFile("README.md", []byte(reportStr), 0644)
	if err != nil {
		panic(err)
	}
}

func generateMarkdownReportString(results []Result) string {
	sum := map[string]ReportSummaryRow{
		"Easy":   {Difficulty: "Easy"},
		"Medium": {Difficulty: "Medium"},
		"Hard":   {Difficulty: "Hard"},
	}
	rows := make([]ReportResultRow, 0)

	// Collect data form results
	for _, r := range results {
		q, ok := leetCodeInMemDB[r.Id]
		if !ok {
			panic("question not found in leetcode in memory db")
		}
		// Add data to sum table
		sumRow := sum[q.Difficulty]
		sumRow.Total += 1
		sumRow.Runtime += r.RuntimeBeat
		sumRow.Memory += r.MemoryBeat
		sum[q.Difficulty] = sumRow
		// Add record to result table
		id, err := strconv.Atoi(r.Id)
		if err != nil {
			panic(err)
		}
		row := ReportResultRow{
			Id:         id,
			Name:       q.Title,
			Difficulty: q.Difficulty,
			Runtime:    r.RuntimeBeat,
			Memory:     r.MemoryBeat,
			Language:   r.Language,
		}
		rows = append(rows, row)
	}

	// Update sum data
	totalRow := ReportSummaryRow{Difficulty: "Total"}
	for _, r := range sum {
		totalRow.Total += r.Total
		totalRow.Runtime += r.Runtime
		totalRow.Memory += r.Memory
		r.Runtime /= float64(r.Total)
		r.Memory /= float64(r.Total)
		sum[r.Difficulty] = r
	}
	totalRow.Runtime /= float64(totalRow.Total)
	totalRow.Memory /= float64(totalRow.Total)

	// sort results
	sort.Slice(rows, func(i, j int) bool {
		if rows[i].Id == rows[j].Id {
			return rows[i].Language == "Go"
		}
		return rows[i].Id < rows[j].Id
	})

	// Build report
	builder := strings.Builder{}
	builder.WriteString(markdownReportHeader)
	builder.WriteString(ReportSummaryRow{}.ToMarkdownTitle())
	builder.WriteString(sum["Easy"].ToMarkdown())
	builder.WriteString(sum["Medium"].ToMarkdown())
	builder.WriteString(sum["Hard"].ToMarkdown())
	builder.WriteString(totalRow.ToMarkdown())
	builder.WriteString("\n")
	builder.WriteString(ReportResultRow{}.ToMarkdownTitle())
	for _, r := range rows {
		builder.WriteString(r.ToMarkdown())
	}
	return builder.String()
}
