package io.github.mingchoi.leetcodesolutionjava.solution.q208_implement_trie_prefix_tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {

    @Test
    public void trie() {
        Trie root = new Trie();
        root.insert("apple");
        assertTrue(root.search("apple"));
        assertFalse(root.search("app"));
        assertTrue(root.startsWith("app"));
        root.insert("app");
        assertTrue(root.search("app"));
    }

}