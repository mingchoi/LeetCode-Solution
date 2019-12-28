package io.github.mingchoi.leetcodesolutionjava.solution.q146_lru_cache;

import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCacheTest {

    @Test
    public void main() {

        LRUCache cache;

        // test 1
        cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);

        assertEquals(1,
                cache.get(1));

        cache.put(3, 3);

        assertEquals(-1,
                cache.get(2));

        cache.put(4, 4);

        assertEquals(-1,
                cache.get(1));

        assertEquals(3,
                cache.get(3));

        assertEquals(4,
                cache.get(4));

        // test 2
        cache = new LRUCache(2);

        cache.put(2, 1);
        cache.put(2, 2);

        assertEquals(2,
                cache.get(2));

        cache.put(1, 1);
        cache.put(4, 1);
        assertEquals(-1,
                cache.get(2));

    }
}