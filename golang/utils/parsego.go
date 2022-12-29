package utils

import (
	"bufio"
	"os"
	"regexp"
	"strconv"
	"strings"
)

func ParseGoSolution() []Result {
	// List all java source code file
	filesPath := make([]string, 0)
	entries, err := os.ReadDir("golang/solutions")
	if err != nil {
		panic(err)
	}
	for _, entry := range entries {
		if entry.IsDir() {
			files, err := os.ReadDir("golang/solutions/" + entry.Name())
			if err != nil {
				panic(err)
			}
			for _, file := range files {
				if !file.IsDir() {
					filesPath = append(filesPath, "golang/solutions/"+entry.Name()+"/"+file.Name())
				}
			}
		}
	}

	// Prase result from source code
	results := make([]Result, 0)
	for i := 0; i < len(filesPath); i++ {
		Id := string(regexp.MustCompile(`/\d+\.`).Find([]byte(filesPath[i])))
		Id = Id[1 : len(Id)-1]
		file, err := os.Open(filesPath[i])
		if err != nil {
			panic(err)
		}
		defer file.Close()

		scanner := bufio.NewScanner(file)
		for scanner.Scan() {
			text := scanner.Text()
			if strings.HasPrefix(text, "Your runtime") {
				results = append(results, extractLeetCodeExtensionResult(Id, scanner))
			}
		}
	}

	return results
}

func extractLeetCodeExtensionResult(Id string, scanner *bufio.Scanner) Result {
	/*
		example:
		Your runtime beats 96.22 % of golang submissions
		Your memory usage beats 48.53 % of golang submissions (4.2 MB)
	*/
	runtimeBeat := string(regexp.MustCompile(`\d+\.*\d*`).Find(scanner.Bytes()))
	runtimeBeatFloat, err := strconv.ParseFloat(runtimeBeat, 64)
	if err != nil {
		panic(err)
	}
	if ok := scanner.Scan(); !ok {
		panic("missing memory result")
	}
	memoryUsed := string(regexp.MustCompile(`\d+\.*\d*\s*MB`).Find(scanner.Bytes()))
	memoryUsedFloat, err := strconv.ParseFloat(
		strings.TrimSpace(memoryUsed[:len(memoryUsed)-2]),
		64)
	if err != nil {
		panic(err)
	}
	memoryBeat := string(regexp.MustCompile(`\d+\.*\d*`).Find(scanner.Bytes()))
	memoryBeatFloat, err := strconv.ParseFloat(memoryBeat, 64)
	if err != nil {
		panic(err)
	}
	return Result{
		Id:          Id,
		RuntimeBeat: runtimeBeatFloat,
		RuntimeMS:   0,
		MemoryBeat:  memoryBeatFloat,
		MemoryMB:    memoryUsedFloat,
		Language:    "Go",
	}
}
