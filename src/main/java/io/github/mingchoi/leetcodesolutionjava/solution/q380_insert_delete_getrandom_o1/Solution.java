package io.github.mingchoi.leetcodesolutionjava.solution.q380_insert_delete_getrandom_o1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*
Runtime: 54 ms, faster than 58.14% of Java online submissions for Insert Delete GetRandom O(1).
Memory Usage: 46.8 MB, less than 58.00% of Java online submissions for Insert Delete GetRandom O(1).
 */
class RandomizedSet {
    HashMap<Integer, Boolean> map;
    ArrayList<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, true);
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        map.remove(val);
        return true;
    }

    public int getRandom() {
        Random ran = new Random();
        while(true){
            int k = list.get(ran.nextInt(list.size()));
            if(map.containsKey(k)){
                return k;
            }
        }
    }
}