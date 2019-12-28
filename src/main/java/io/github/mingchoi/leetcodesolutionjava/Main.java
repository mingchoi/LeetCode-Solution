package io.github.mingchoi.leetcodesolutionjava;


import com.google.gson.Gson;
import io.github.mingchoi.leetcodesolutionjava.util.Question;
import io.github.mingchoi.leetcodesolutionjava.util.Result;
import io.github.mingchoi.leetcodesolutionjava.util.SumResult;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        GenerateTemplateById(821);
        ScanSolutionsResult();
    }

    private static void ScanSolutionsResult() {
        File solutions = new File("src/main/java/io/github/mingchoi/leetcodesolutionjava/solution/");
        ArrayList<Result> results = new ArrayList<>();

        // Read result from sources
        try {
            for (File f : solutions.listFiles()) {
                if (!f.isDirectory()) {
                    continue;
                }

                // Get question info
                int id = Integer.valueOf(f.getName().split("_")[0].substring(1));
                Question q = findQuestion(id);
                if (q == null) {
                    System.out.println("Q" + String.valueOf(id) + " not found.");
                    continue;
                }

                // Read result
                Result r = new Result(q.questionFrontendId, q.title, q.difficulty);
                ReadResultFromSolutionFolder(f, r);
                results.add(r);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Handle result
        Collections.sort(results, Comparator.comparingInt(a -> Integer.parseInt(a.questionId)));

        List<SumResult> sumResults = Arrays.asList("Easy", "Medium", "Hard", "Total").stream()
                .map(str -> results.stream().filter(result ->
                        (result.difficulty.equals(str) || str.equals("Total"))
                                && result.runtime != null))
                .map(st -> {
                            List<Result> rlist = st.collect(Collectors.toList());
                            return new SumResult("" +
                                    rlist.get(0).difficulty,
                                    rlist.size(),
                                    rlist.stream()
                                            .map(result -> result.runtime)
                                            .reduce((a, b) -> a + b).get() / rlist.size(),
                                    rlist.stream()
                                            .map(result -> result.memory)
                                            .reduce((a, b) -> a + b).get() / rlist.size()
                            );
                        }
                ).collect(Collectors.toList());
        SumResult totalResult = sumResults.get(sumResults.size() - 1);
        totalResult.title = "Total";
        sumResults.set(sumResults.size() - 1, totalResult);

        // Write to file
        try {
            FileWriter fw = new FileWriter("README.md");
            fw.write("# LeetCode Solution\n\nAll solutions are written in Java. \n\nHere are the result: (higher is better, 100 is max)\n\n");
            fw.write("|difficulty|total|runtime faster|memory lesser|\n|---|---|---|---|\n");
            for (SumResult s : sumResults)
                fw.append(s.toString() + "\n");
            fw.append("\n\n");
            fw.append("|id|title|difficulty|runtime faster|memory lesser|\n|---|---|---|---|---|\n");
            for (Result r : results)
                fw.append(r.toString() + "\n");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void ReadResultFromSolutionFolder(File f, Result r) throws FileNotFoundException {
        for (File s : f.listFiles()) {
            String[] strs = s.getName().split("\\.");
            if (strs.length > 1) {
                if (strs[strs.length - 1].equals("java")) {
                    ReadResultFromSourceCode(r, s);
                }
            }
        }
    }

    private static void ReadResultFromSourceCode(Result r, File s) throws FileNotFoundException {
        Scanner scan = new Scanner(s);
        while (scan.hasNextLine()) {
            String line = scan.nextLine().trim();
            if (line.startsWith("Runtime: ")) {
                Pattern pat = Pattern.compile("\\d*\\.\\d*");
                Matcher mat = pat.matcher(line);
                if (mat.find()) {
                    r.runtime = Double.valueOf(mat.group(0));
                }
            } else if (line.startsWith("Memory Usage: ")) {
                Pattern pat = Pattern.compile("\\d*\\.\\d*");
                Matcher mat = pat.matcher(line);
                if (mat.find()) {
                    r.memory = Double.valueOf(mat.group(0));
                }
            }
        }
    }

    private static void GenerateTemplateById(int id) {
        Question q = findQuestion(id);
        if (q != null) GenerateTemplate(q);
    }

    private static void GenerateTemplate(Question q) {
        String folder = QuestionToFolderName(q);
        new File("src/main/java/io/github/mingchoi/leetcodesolutionjava/solution/" + folder).mkdir();

        Question.CodeSnippetNode snippet = null;
        for (Question.CodeSnippetNode n : q.codeSnippets) {
            if (n.lang.equals("Java")) {
                snippet = n;
            }
        }

        try {
            FileWriter fw = new FileWriter("src/main/java/io/github/mingchoi/leetcodesolutionjava/solution/" + folder + "/Solution.java");
            fw.append("package io.github.mingchoi.leetcodesolutionjava.solution." + folder + ";\n\npublic ");
            fw.append(snippet.code);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Question findQuestion(Integer id) {
        JSONArray questions = getQuestionsFromJson();
        for (int i = 0; i < questions.size(); i++) {
            JSONObject q = (JSONObject) questions.get(i);
            if (q.get("questionFrontendId").equals(id.toString())) {
                return new Gson().fromJson(q.toJSONString(), Question.class);
            }
        }
        return null;
    }

    private static JSONArray getQuestionsFromJson() {
        try {
            FileReader file = new FileReader("data/questions.json");
            JSONParser parser = new JSONParser();
            JSONObject root = (JSONObject) parser.parse(file);
            JSONObject data = (JSONObject) root.get("data");
            return (JSONArray) data.get("allQuestions");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String QuestionToFolderName(Question question) {
        return "q" + question.questionFrontendId + "_" + question.titleSlug.replace("-", "_");
    }
}
