package io.github.mingchoi.leetcodesolutionjava.solution.q208_implement_trie_prefix_tree;

import java.util.HashMap;
/*
Runtime: 48 ms, faster than 76.72% of Java online submissions for Implement Trie (Prefix Tree).
Memory Usage: 52.9 MB, less than 38.46% of Java online submissions for Implement Trie (Prefix Tree).
 */
public class Trie {
    HashMap<Character, Trie> child = new HashMap<>();
    public Boolean isWord = false;

    public Trie() {
    }

    public void insert(String word) {
        Trie next = null;
        if (child.containsKey(word.charAt(0))) {
            next = child.get(word.charAt(0));
        } else {
            next = new Trie();
            child.put(word.charAt(0), next);
        }
        if (word.length() == 1) {
            next.isWord = true;
        } else {
            next.insert(word.substring(1, word.length()));
        }
    }

    public boolean search(String word) {
        Trie next = child.get(word.charAt(0));
        if (next == null) return false;
        if (word.length() == 1) {
            return next.isWord;
        }
        return next.search(word.substring(1, word.length()));
    }

    public boolean startsWith(String prefix) {
        Trie next = child.get(prefix.charAt(0));
        if (next == null) return false;
        if (prefix.length() == 1) {
            return true;
        }
        return next.startsWith(prefix.substring(1, prefix.length()));
    }
}
