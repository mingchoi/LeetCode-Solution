package utils

import (
	"bufio"
	"os"
	"regexp"
	"strconv"
	"strings"
)

func ParseJavaSolution() []Result {
	// List all java source code file
	filesPath := make([]string, 0)
	entries, err := os.ReadDir("java/src/main/java/io/github/mingchoi/leetcodesolutionjava/solution")
	if err != nil {
		panic(err)
	}
	for _, entry := range entries {
		if entry.IsDir() {
			files, err := os.ReadDir("java/src/main/java/io/github/mingchoi/leetcodesolutionjava/solution/" + entry.Name())
			if err != nil {
				panic(err)
			}
			for _, file := range files {
				if !file.IsDir() {
					filesPath = append(filesPath, "java/src/main/java/io/github/mingchoi/leetcodesolutionjava/solution/"+entry.Name()+"/"+file.Name())
				}
			}
		}
	}

	// Prase result from source code
	results := make([]Result, 0)
	for i := 0; i < len(filesPath); i++ {
		Id := string(regexp.MustCompile(`q\d+_`).Find([]byte(filesPath[i])))
		Id = Id[1 : len(Id)-1]
		file, err := os.Open(filesPath[i])
		if err != nil {
			panic(err)
		}
		defer file.Close()

		scanner := bufio.NewScanner(file)
		for scanner.Scan() {
			text := scanner.Text()
			if strings.HasPrefix(text, "Runtime:") {
				results = append(results, extractOldLeetCodeResult(Id, filesPath[i], scanner))
			}
		}
	}

	return results
}

func extractOldLeetCodeResult(Id, path string, scanner *bufio.Scanner) Result {
	/*
		example:
		Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Common Characters.
		Memory Usage: 37 MB, less than 100.00% of Java online submissions for Find Common Characters.
	*/
	runtimeUsed := string(regexp.MustCompile(`\d+\s*ms`).Find(scanner.Bytes()))
	runtimeUsedFloat, err := strconv.ParseFloat(
		strings.TrimSpace(runtimeUsed[:len(runtimeUsed)-2]),
		64)
	if err != nil {
		panic(err)
	}
	runtimeBeat := string(regexp.MustCompile(`\d+\.\d*`).Find(scanner.Bytes()))
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
	memoryBeat := string(regexp.MustCompile(`\d+\.\d*`).Find(scanner.Bytes()))
	memoryBeatFloat, err := strconv.ParseFloat(memoryBeat, 64)
	if err != nil {
		panic(err)
	}
	return Result{
		Id:          Id,
		RuntimeBeat: runtimeBeatFloat,
		RuntimeMS:   runtimeUsedFloat,
		MemoryBeat:  memoryBeatFloat,
		MemoryMB:    memoryUsedFloat,
		Language:    "Java",
		Path:        path,
	}
}
