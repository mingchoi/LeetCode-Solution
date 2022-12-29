package io.github.mingchoi.leetcodesolutionjava.util;

import java.util.List;

public class Question {
    public String questionId;
    public String title;
    public String content;
    public String titleSlug;
    //    public String metaData;
    public String questionFrontendId;
    public ArticleNode solution;
    //    public String similarQuestions;
    //    public String stats;
    //    public boolean isPaidOnly;
    public String difficulty;
    public List<CodeSnippetNode> codeSnippets;
    public List<TopicTagNode> topicTags;

    public static class ArticleNode {
        public boolean canSeeDetail;
        public String id;
    }

    public static class CodeSnippetNode {
        public String code;
        public String langSlug;
        public String lang;
    }

    public static class TopicTagNode {
        public String name;
        public Object translatedName;
        public String slug;
    }
}
