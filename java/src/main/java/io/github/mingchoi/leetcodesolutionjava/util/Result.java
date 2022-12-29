package io.github.mingchoi.leetcodesolutionjava.util;

public class Result {
    public String questionId;
    public String title;
    public String difficulty;
    public Double runtime;
    public Double memory;

    public Result(String questionId, String title, String difficulty) {
        this.questionId = questionId;
        this.title = title;
        this.difficulty = difficulty;
    }

    public String toString() {
        return "|" +
                questionId + "|" +
                title + "|" +
                difficulty + "|" +
                (runtime != null ? runtime : "-") + "|" +
                (memory != null ? memory : "-") + "|";
    }


}

