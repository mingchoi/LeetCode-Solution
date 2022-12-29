package io.github.mingchoi.leetcodesolutionjava.util;

import java.text.DecimalFormat;

public class SumResult {
    public String title;
    public Integer count;
    public Double runtime;
    public Double memory;

    public SumResult(String title, Integer count, Double runtime, Double memory) {
        this.title = title;
        this.count = count;
        this.runtime = runtime;
        this.memory = memory;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "|" +
                title + "|" +
                count + "|" +
                (runtime != null ? df.format(runtime) : "-") + "|" +
                (memory != null ? df.format(memory) : "-") + "|";
    }
}