package io.github.mingchoi.leetcodesolutionjava.solution.q146_lru_cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
/*
Runtime: 26 ms, faster than 75.89% of Java online submissions for LRU Cache.
Memory Usage: 56.4 MB, less than 65.03% of Java online submissions for LRU Cache.
 */
public class LRUCache {
    HashMap<Integer, Integer> k2v;
    HashMap<Integer, Integer> kcount;
    HashMap<Integer, Integer> step;
    int cap;
    int head = -1;
    int tail = -1;

    public LRUCache(int capacity) {
        cap = capacity;
        k2v = new HashMap<>();
        kcount = new HashMap<>();
        step = new HashMap<>();
    }

    public void put(int key, int value) {
        // insert
        k2v.put(key, value);
        kcount.put(
                key,
                kcount.getOrDefault(key, 0) + 1
        );
        tail++;
        step.put(
                tail,
                key
        );
        // remove if oversize
        while (k2v.size() > cap) {
            head++;
            int k = step.get(head);
            int remainStep = kcount.get(k);
            if (remainStep == 1) {
                kcount.remove(k);
                k2v.remove(k);
            } else {
                kcount.put(k, remainStep - 1);
            }
            step.remove(head);
        }
    }

    public int get(int key) {
        if (k2v.containsKey(key)) {
            kcount.put(
                    key,
                    kcount.get(key) + 1
            );
            tail++;
            step.put(
                    tail,
                    key
            );
            return k2v.get(key);
        }
        return -1;
    }
}

/*
:( Runtime: 135 ms, faster than 10.05% of Java online submissions for LRU Cache.
:(

 Memory Usage: 65.1 MB, less than 8.59% of Java online submissions for LRU Cache.
 */
class LRUCache_slow {
    HashMap<Integer, Integer> map;
    Queue<Integer> queue;
    int cap;

    public LRUCache_slow(int capacity) {
        map = new HashMap<>();
        queue = new LinkedList<>();
        cap = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            queue.remove(key);
            queue.offer(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.put(key, value);
            queue.remove(key);
            queue.offer(key);
        } else {
            map.put(key, value);
            queue.offer(key);
            if (queue.size() > cap) {
                int i = queue.poll();
                map.remove(i);
            }
        }
    }
}