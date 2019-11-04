package io.github.mingchoi.leetcodesolutionjava.solution.q127_word_ladder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        class Pair {
            public String word;
            public int level;

            public Pair(String word, int level) {
                this.word = word;
                this.level = level;
            }
        }

        List<String> list = new ArrayList<>(wordList);
        list.remove(beginWord);
        List<Pair> queue = new ArrayList<>();
        queue.add(new Pair(beginWord, 1));
        while (queue.size() > 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String w = it.next();
                if (diff(queue.get(0).word, w) == 1) {
                    if (w.equals(endWord)) {
                        return queue.get(0).level + 1;
                    }
                    queue.add(new Pair(w, queue.get(0).level + 1));
                    it.remove();
                }
            }
            queue.remove(0);
        }
        return 0;
    }

    int diff(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) count++;
        }
        return count;
    }
}
