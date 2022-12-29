package utils

import (
	"encoding/json"
	"log"
	"os"
)

type LeetCodeQuestion struct {
	AcRate             float64     `json:"acRate"`
	Difficulty         string      `json:"difficulty"`
	FreqBar            interface{} `json:"freqBar"`
	FrontendQuestionID string      `json:"frontendQuestionId"`
	IsFavor            bool        `json:"isFavor"`
	PaidOnly           bool        `json:"paidOnly"`
	Status             string      `json:"status"`
	Title              string      `json:"title"`
	TitleSlug          string      `json:"titleSlug"`
	TopicTags          []struct {
		Name string `json:"name"`
		ID   string `json:"id"`
		Slug string `json:"slug"`
	} `json:"topicTags"`
	HasSolution      bool `json:"hasSolution"`
	HasVideoSolution bool `json:"hasVideoSolution"`
}

type LeetCodeQuestionsList struct {
	Total     int                `json:"total"`
	Questions []LeetCodeQuestion `json:"questions"`
}

var leetCodeInMemDB map[string]LeetCodeQuestion

func createInMemLeetCodeQuestionDB() {
	data, err := os.ReadFile("data/leetcode-questions.json")
	if err != nil {
		log.Fatal(err)
	}
	var questionsList LeetCodeQuestionsList
	err = json.Unmarshal(data, &questionsList)
	if err != nil {
		log.Fatal(err)
	}

	leetCodeInMemDB = make(map[string]LeetCodeQuestion)
	for _, q := range questionsList.Questions {
		leetCodeInMemDB[q.FrontendQuestionID] = q
	}
}
